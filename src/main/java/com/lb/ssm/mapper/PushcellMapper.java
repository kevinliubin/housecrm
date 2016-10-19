package com.lb.ssm.mapper;

import com.lb.ssm.vo.Pushcell;
import com.lb.ssm.vo.PushcellExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PushcellMapper {
    int countByExample(PushcellExample example);

    int deleteByExample(PushcellExample example);

    int deleteByPrimaryKey(Integer pushid);

    int insert(Pushcell record);

    int insertSelective(Pushcell record);

    List<Pushcell> selectByExample(PushcellExample example);

    Pushcell selectByPrimaryKey(Integer pushid);

    int updateByExampleSelective(@Param("record") Pushcell record, @Param("example") PushcellExample example);

    int updateByExample(@Param("record") Pushcell record, @Param("example") PushcellExample example);

    int updateByPrimaryKeySelective(Pushcell record);

    int updateByPrimaryKey(Pushcell record);
}