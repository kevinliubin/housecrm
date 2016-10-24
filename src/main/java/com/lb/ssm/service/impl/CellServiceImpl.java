package com.lb.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.lb.ssm.mapper.CellExtendMapper;
import com.lb.ssm.mapper.CellMapper;
import com.lb.ssm.service.CellService;
import com.lb.ssm.vo.Cell;
import com.lb.ssm.vo.CellExample;
import com.lb.ssm.vo.CellExtend;
@Service
public class CellServiceImpl implements CellService {
	
	
	@Autowired
	private CellMapper cellMapper;
	
	@Autowired
	private CellExtendMapper cellExtendMapper;
	
	@Override
	public List<Cell> getCellList(String limit,String offset) {
		List<CellExtend> cellList = cellExtendMapper.getCellList();
		System.out.println(cellList.size());
		//实例化查询
		CellExample example = new CellExample();
		int pageindex=0;
		if(Integer.parseInt(offset) !=0){
			pageindex = Integer.parseInt(offset)/Integer.parseInt(limit);
		}
		pageindex+= 1;
		PageHelper.startPage(pageindex, Integer.parseInt(limit));
		List<Cell> list = cellMapper.selectByExample(example);
		return list;
	}

}
