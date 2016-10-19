package com.lb.ssm.mapper;

import com.lb.ssm.vo.Subdistrict;
import com.lb.ssm.vo.SubdistrictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubdistrictMapper {
    int countByExample(SubdistrictExample example);

    int deleteByExample(SubdistrictExample example);

    int deleteByPrimaryKey(Integer subdistrictid);

    int insert(Subdistrict record);

    int insertSelective(Subdistrict record);

    List<Subdistrict> selectByExample(SubdistrictExample example);

    Subdistrict selectByPrimaryKey(Integer subdistrictid);

    int updateByExampleSelective(@Param("record") Subdistrict record, @Param("example") SubdistrictExample example);

    int updateByExample(@Param("record") Subdistrict record, @Param("example") SubdistrictExample example);

    int updateByPrimaryKeySelective(Subdistrict record);

    int updateByPrimaryKey(Subdistrict record);
}