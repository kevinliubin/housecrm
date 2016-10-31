package com.lb.ssm.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.lb.ssm.common.JsonToTable;
import com.lb.ssm.service.CellService;
import com.lb.ssm.service.SubService;
import com.lb.ssm.vo.Cell;
import com.lb.ssm.vo.Subdistrict;

import net.sf.json.JSONObject;
/**
 * 每个单元楼层controller
 * @author hello
 *
 */
@Controller
@RequestMapping("/cell")
public class CellController {
	
	@Autowired
	private CellService cellService;
	
	@Autowired
	private SubService subService;
	
	@RequestMapping("/cellList")
	public ModelAndView cellList(){
		ModelAndView modelAndView = new ModelAndView();
		//查询所有的小区
		List<Subdistrict> allSubdistList = subService.getAllSubdist();
		modelAndView.addObject("allSubdistList", allSubdistList);
		modelAndView.setViewName("/cell/cell");
		return modelAndView;
	}
	
	
	@RequestMapping("/cellpage")
	@ResponseBody
	public String cellpage(HttpServletRequest request,HttpServletResponse response) throws Exception, IOException{
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
        
        List<Cell> cellList = cellService.getCellList(limit, offset);
        PageInfo<Cell> pageInfo = new PageInfo<>(cellList);
        JsonToTable.jsonPrintObject(response, cellList, (int)pageInfo.getTotal());
		return null;
	}
}
