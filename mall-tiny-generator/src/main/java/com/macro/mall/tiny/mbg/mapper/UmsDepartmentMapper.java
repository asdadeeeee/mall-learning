package com.macro.mall.tiny.mbg.mapper;

import com.macro.mall.tiny.mbg.model.UmsDepartment;
import com.macro.mall.tiny.mbg.model.UmsDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsDepartmentMapper {
    long countByExample(UmsDepartmentExample example);

    int deleteByExample(UmsDepartmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsDepartment row);

    int insertSelective(UmsDepartment row);

    List<UmsDepartment> selectByExample(UmsDepartmentExample example);

    UmsDepartment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsDepartment row, @Param("example") UmsDepartmentExample example);

    int updateByExample(@Param("row") UmsDepartment row, @Param("example") UmsDepartmentExample example);

    int updateByPrimaryKeySelective(UmsDepartment row);

    int updateByPrimaryKey(UmsDepartment row);
}