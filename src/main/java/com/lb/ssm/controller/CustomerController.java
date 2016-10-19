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
/**
 * 客户管理
 * @author liubin
 *
 */
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.lb.ssm.common.JsonToTable;
import com.lb.ssm.common.JsonUtils;
import com.lb.ssm.service.CustomerService;
import com.lb.ssm.vo.Customer;

import net.sf.json.JSONObject;
@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customerList")
	public 	String customerList(){
		//直接跳转到list的页面
		return "customer/customerList";
	}
	
	
	@RequestMapping("/customerpage")
	@ResponseBody
	public List<Customer> customerpage(HttpServletRequest request,HttpServletResponse response) throws Exception{
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
        List<Customer> list = customerService.getCustomerList(limit, offset);
        //取记录总条数
        PageInfo<Customer> pageInfo = new PageInfo<>(list);
        int total = (int) pageInfo.getTotal();
        //拼装json数据
        JsonToTable.jsonPrintCustomer(response, list, total);
		return null;
	}
	
	@RequestMapping("/addCustomer")
	public String addCustomer(Customer customer){
		//调用service插入数据  在service补全数据
		customerService.addCustomer(customer);
		return "/customer/customerList";
	}
	
	@RequestMapping(value={"/personalInfo/{id}"},produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String getCustomerInfo(@PathVariable Integer id) throws IOException{
		Customer customer = customerService.getCustomerById(id);
		String json = JsonUtils.objectToJson(customer);
		return json;
	}
	
	@RequestMapping("/updateCustomer")
	public String updateCustomer(Customer customer){
		customerService.updateCustomer(customer);
		return "/customer/customerList";
	}
	
	@RequestMapping(value={"/customerRefush/{name}"})
	@ResponseBody
	public List<Customer> customerpageRefush(@PathVariable String name,HttpServletRequest request,HttpServletResponse response) throws Exception{
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
        List<Customer> list = null;
        if (name != null) {
        	name = URLDecoder.decode(name, "UTF-8");
        	list = customerService.customerpageRefush(name,limit, offset);
		}else{
			list = customerService.getCustomerList(limit, offset);
		}
        //取记录总条数
        PageInfo<Customer> pageInfo = new PageInfo<>(list);
        int total = (int) pageInfo.getTotal();
        //拼装json数据
        JsonToTable.jsonPrintCustomer(response, list, total);
		return null;
	}
}
