package com.lb.ssm.mapper;

import com.lb.ssm.vo.Cell;
import com.lb.ssm.vo.CellExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CellMapper {
    int countByExample(CellExample example);

    int deleteByExample(CellExample example);

    int deleteByPrimaryKey(Integer cellid);

    int insert(Cell record);

    int insertSelective(Cell record);

    List<Cell> selectByExample(CellExample example);

    Cell selectByPrimaryKey(Integer cellid);

    int updateByExampleSelective(@Param("record") Cell record, @Param("example") CellExample example);

    int updateByExample(@Param("record") Cell record, @Param("example") CellExample example);

    int updateByPrimaryKeySelective(Cell record);

    int updateByPrimaryKey(Cell record);
}