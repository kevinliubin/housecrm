package com.lb.ssm.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.lb.ssm.common.JsonToTable;
import com.lb.ssm.common.JsonUtils;
import com.lb.ssm.common.MD5Util;
import com.lb.ssm.service.UserService;
import com.lb.ssm.vo.User;

import net.sf.json.JSONObject;

/**
 * 用户
 * @author liubin
 *
 */
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 直接跳转到登录页面
	 * @return
	 */
	@RequestMapping(value="/user/login",method={RequestMethod.POST,RequestMethod.GET})
	public String login(){
		//直接跳转到user的登录界面
		
		return "login1";
	}
	
	/**
	 * 登录检测
	 */
	@RequestMapping(value="/user/logincheck",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView logincheck(User user,HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		User user2 = null;
		if (user.getUsername() == null ) {
			//从session中取 user的信息  如果有就是存在session  没有就是session已经过期  或者用户已经退出
			user2 = (User) request.getSession().getAttribute("user");
			if (user2 == null) {
				modelAndView.setViewName("login1");
			}else {
				modelAndView.setViewName("main");
			}
			return modelAndView;
		}
		//将密码转换成MD5
		user.setUserpassword(MD5Util.MD5(user.getUserpassword()));
		user2 = userService.getUser(user);
		if (user2 != null ) {
			//查询权限信息
			//modelAndView.addObject(user2);
			request.getSession().setAttribute("user", user2);
			
			modelAndView.setViewName("blank");
			return modelAndView;
		}else {
			request.setAttribute("errorUserMess", "用户名密码有误");
			modelAndView.setViewName("login1");
			return modelAndView;
		}
			
	}
	
	
	@RequestMapping("/user/mm")
	public String goMMM(HttpServletRequest request){
		if (request.getSession().getAttribute("user") != null) {
			return "main";
		}else{
			return "login1";
		}
	}
	
	
	@RequestMapping("/user/loginout")
	public String loginout(HttpServletRequest request){
		request.getSession().removeAttribute("user");
		return "redirect:/";
	}
	
	@RequestMapping("/user/userList")
	public ModelAndView userList(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userList");
		return modelAndView;
	}
	
	@RequestMapping("/user/userpage")
	@ResponseBody
	public List<User> userLists(HttpServletRequest request,HttpServletResponse response) throws Exception{
		//获取页面的数据
		BufferedReader bufr = new BufferedReader(new InputStreamReader(request.getInputStream(),"UTF-8"));
		StringBuilder sBuilder = new StringBuilder("");
        String temp = "";
        while((temp = bufr.readLine()) != null){
            sBuilder.append(temp);
         }
        bufr.close();
        String json = sBuilder.toString();
		JSONObject object = JSONObject.fromObject(json);
        String limit= object.getString("limit");//通过此方法获取前端数据
        String offset= object.getString("offset");
        //将解析的数据传递给service解析
        List<User> userList = userService.getUserList(limit, offset);
        //取记录总条数
        PageInfo<User> pageinfo = new PageInfo<>(userList);
		int total = (int)pageinfo.getTotal();
      	//封装数据返回
      	JsonToTable.jsonPrint(response, userList, total);
		return null;
	}
	
	@RequestMapping(value={"/user/userReflush/{name}"},produces = "text/html;charset=UTF-8")
	@ResponseBody
	public List<User> userReflush(@PathVariable String name, HttpServletRequest request,HttpServletResponse response) throws Exception{
		//获取页面的数据
		BufferedReader bufr = new BufferedReader(new InputStreamReader(request.getInputStream(),"UTF-8"));
		StringBuilder sBuilder = new StringBuilder("");
        String temp = "";
        while((temp = bufr.readLine()) != null){
            sBuilder.append(temp);
         }
        bufr.close();
        String json = sBuilder.toString();
		JSONObject object = JSONObject.fromObject(json);
        String limit= object.getString("limit");//通过此方法获取前端数据
        String offset= object.getString("offset");
        //将解析的数据传递给service解析
        List<User> userList = null;
        if (name != null) {
			
        	name = URLDecoder.decode(name, "UTF-8");
        	userList = userService.getSearchUserList(name,limit, offset);
		}else{
			 userList = userService.getUserList(limit, offset);
		}
        //取记录总条数
        PageInfo<User> pageinfo = new PageInfo<>(userList);
		int total = (int)pageinfo.getTotal();
      	//封装数据返回
      	JsonToTable.jsonPrint(response, userList, total);
		return null;
	}
	
	@RequestMapping(value={"/user/personalInfo/{id}"},produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String personalInfo(@PathVariable Integer id,HttpServletRequest request) throws IOException{
		User user = userService.getUserById(id);
		String json = JsonUtils.objectToJson(user);
		return json;
	}
	
	@RequestMapping(value={"/user/updateUser"})
	public String updateUser(User user){
		userService.updateUser(user);
		return "redirect:userList";
	}
	
	@RequestMapping("/user/deleteUser/{userId}")
	@ResponseBody
	public String deleteUser(@PathVariable Integer userId) throws IOException{
		int i = userService.deleteUser(userId);
		String json = JsonUtils.objectToJson(i);
		return json;
	}
	
	@RequestMapping(value={"/user/addUser"},method={RequestMethod.POST})
	public String addUser(User user){
		userService.addUser(user);
		return "redirect:userList";
	}
	
}
