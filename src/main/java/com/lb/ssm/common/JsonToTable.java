package com.lb.ssm.common;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.lb.ssm.vo.Customer;
import com.lb.ssm.vo.User;

import net.sf.json.JSONObject;

/**
 * 把list封装json  回页面
 * @author liubin
 *
 */
public class JsonToTable {
	
	public static void  jsonPrint(HttpServletResponse response,List<User> list,int total){
		
		try {
			String score = null;
    		JSONObject jsonObject=null;
    		String scorejson = null;
    		if(list!=null && total!=0){
    			for(int i = 0;i<list.size();i++){
    				response.setContentType("text/html;charset=UTF-8"); 
					ObjectMapper objectMapper = new ObjectMapper();
					scorejson = objectMapper.writeValueAsString(list); 
					jsonObject = new JSONObject();
					jsonObject.put("rows", scorejson);//需要的数据  定义死的
					jsonObject.put("total", total);
					score = jsonObject.toString();
    			}
    		}else{
        		jsonObject = new JSONObject();
        		jsonObject.put("rows", "[]");
    			jsonObject.put("total", total);
    			score = jsonObject.toString();
        	}
    		response.getWriter().write(score);
    		response.getWriter().flush();
    		response.getWriter().close();
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void  jsonPrintCustomer(HttpServletResponse response,List<Customer> list,int total){
		
		try {
			String score = null;
    		JSONObject jsonObject=null;
    		String scorejson = null;
    		if(list!=null && total!=0){
    			for(int i = 0;i<list.size();i++){
    				response.setContentType("text/html;charset=UTF-8"); 
					ObjectMapper objectMapper = new ObjectMapper();
					scorejson = objectMapper.writeValueAsString(list); 
					jsonObject = new JSONObject();
					jsonObject.put("rows", scorejson);//需要的数据  定义死的
					jsonObject.put("total", total);
					score = jsonObject.toString();
    			}
    		}else{
        		jsonObject = new JSONObject();
        		jsonObject.put("rows", "[]");
    			jsonObject.put("total", total);
    			score = jsonObject.toString();
        	}
    		response.getWriter().write(score);
    		response.getWriter().flush();
    		response.getWriter().close();
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void  jsonPrintObject(HttpServletResponse response,List<?> list,int total){
		
		try {
			String score = null;
    		JSONObject jsonObject=null;
    		String scorejson = null;
    		if(list!=null && total!=0){
    			for(int i = 0;i<list.size();i++){
    				response.setContentType("text/html;charset=UTF-8"); 
					ObjectMapper objectMapper = new ObjectMapper();
					scorejson = objectMapper.writeValueAsString(list); 
					jsonObject = new JSONObject();
					jsonObject.put("rows", scorejson);//需要的数据  定义死的
					jsonObject.put("total", total);
					score = jsonObject.toString();
    			}
    		}else{
        		jsonObject = new JSONObject();
        		jsonObject.put("rows", "[]");
    			jsonObject.put("total", total);
    			score = jsonObject.toString();
        	}
    		response.getWriter().write(score);
    		response.getWriter().flush();
    		response.getWriter().close();
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
