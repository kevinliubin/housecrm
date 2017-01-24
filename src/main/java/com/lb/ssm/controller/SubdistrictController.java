package com.lb.ssm.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.lb.ssm.annotation.Token;
import com.lb.ssm.common.JsonToTable;
import com.lb.ssm.common.JsonUtils;
import com.lb.ssm.common.export.ExportExcel;
import com.lb.ssm.exception.TokenTimeoutException;
import com.lb.ssm.service.SubService;
import com.lb.ssm.vo.Subdistrict;

import net.sf.json.JSONObject;
/**
 * 小区action
 * @author liubin
 */
@Controller
@RequestMapping("/sub")
public class SubdistrictController {
	@Autowired
	private SubService subservice;
	
	@RequestMapping("/subList")
	@Token(save=true)
	public String subList(){
		//跳转到查询页面
		return "/xiaoqu/subdistrictList";
	}
	
	@RequestMapping("/subpage")
	@ResponseBody
	public String subpage(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException, IOException{
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
        //调用service查询小区信息
        List<Subdistrict> list = subservice.getSubdistrictList(limit, offset);
        PageInfo<Subdistrict> pageInfo = new PageInfo<>(list);
        int total = (int) pageInfo.getTotal();
        JsonToTable.jsonPrintObject(response, list, total);
		return null;
	}
	@RequestMapping("/subdistRefush/{name}")
	@ResponseBody
	public String subdistRefush(@PathVariable String name, HttpServletRequest request,HttpServletResponse response) throws Exception{
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
        //分页查询
        List<Subdistrict> list = null;
        if (name != null) {
        	name = URLDecoder.decode(name, "UTF-8");
        	list = subservice.getSubdistrictListByName(name,limit, offset);
		}else{
			list = subservice.getSubdistrictList(limit, offset);
		}
        PageInfo<Subdistrict> pageInfo = new PageInfo<>(list);
        int total = (int) pageInfo.getTotal();
        JsonToTable.jsonPrintObject(response, list, total);
		return null;
	}
	
	/**
	 * @param subdistrict
	 * @param myfiles 如果想上传多个文件，那么这里就要用MultipartFile[]类型来接收文件，并且还要指定@RequestParam注解  
	 * @param request 并且上传多个文件时，前台表单中的所有<input type="file"/>的name都应该是myfiles，否则参数里的myfiles无法获取到所有上传的文件 
	 * @return
	 */
	@RequestMapping(value={"/addSubdist"},method={RequestMethod.POST,RequestMethod.GET})
	@Token(remove=true)
	public String addSubdist(Subdistrict subdistrict,@RequestParam MultipartFile[] myfiles,HttpServletRequest request) throws Exception{
		try {
			for (MultipartFile file : myfiles) {
				System.out.println(file.getSize());
			}
			subservice.addSubWithFileUpload(subdistrict, myfiles);
			return "redirect:/sub/subList";
		} catch (Exception e) {
			e.printStackTrace();
			throw new TokenTimeoutException();
		}
	}
	
	@RequestMapping(value={"/subInfo/{subId}"})
	public ModelAndView subInfo(@PathVariable Integer subId){
		ModelAndView modelAndView = new ModelAndView();
		Subdistrict subdistrict = subservice.getSubdistById(subId);
		modelAndView.addObject(subdistrict);
		modelAndView.setViewName("/xiaoqu/subInfo");
		return modelAndView;
	}
	
	@RequestMapping(value={"/subInfoById/{subId}"},produces = "text/html;charset=UTF-8")
	@ResponseBody
	public ModelAndView subInfoById(@PathVariable Integer subId) throws IOException{
		Subdistrict subdistrict = subservice.getSubdistById(subId);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("subdistrict",subdistrict);
		modelAndView.setViewName("/xiaoqu/subInfo");
		return modelAndView;
	}
	
	/**
	 * 更新之前的查询
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value={"/modifySubInfo/{subId}"},produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String modifySubInfo(@PathVariable Integer subId) throws IOException{
		Subdistrict subdistrict = subservice.getSubdistById(subId);
		String json = JsonUtils.objectToJson(subdistrict);
		return json;
	}
	/**
	 * 更新
	 * @param subdistrict
	 * @return
	 */
	@RequestMapping("/updateSubdist")
	public String updateSubdist(Subdistrict subdistrict){
		subservice.updateSubdistrict(subdistrict);
		return "redirect:/sub/subList";
	}
	
	/**
	 * 导出小区信息
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/exprtSubdist")
	public String exprtSubdist(HttpServletResponse response) throws IOException{
		List<Subdistrict> list = subservice.getAllSubdist();
		List<String []> arrList = new ArrayList<>();
		for (Subdistrict subdistrict : list) {
			String[] array = new String[]{subdistrict.getSubdistrictid()+"",subdistrict.getSubdistrictname(),
					subdistrict.getSubdistrictdiscribe(),subdistrict.getSubdistrictaddr()};
			arrList.add(array);
		}
		response.setContentType("application/vnd.ms-excel");    
		response.setHeader("Content-disposition", "attachment;filename="+new String ("小区明细.xls".getBytes("UTF-8"),"iso8859-1"));
		OutputStream ouputStream = response.getOutputStream(); 
		ExportExcel excel = new ExportExcel();
		excel.writeStream(ouputStream, null, arrList);
		return null;
	}
	
}
