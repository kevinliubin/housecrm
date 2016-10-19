package com.lb.ssm.service;

import java.util.List;

import com.lb.ssm.vo.Cell;

public interface CellService {
	
	List<Cell> getCellList(String limit,String offset);
	
}
