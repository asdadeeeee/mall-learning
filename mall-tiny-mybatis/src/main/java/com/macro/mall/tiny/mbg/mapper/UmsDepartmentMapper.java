package com.macro.mall.tiny.mbg.mapper;

import com.macro.mall.tiny.mbg.model.UmsDepartment;
import com.macro.mall.tiny.mbg.model.UmsDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface UmsDepartmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_department
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    long countByExample(UmsDepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_department
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    int deleteByExample(UmsDepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_department
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_department
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    int insert(UmsDepartment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_department
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    int insertSelective(UmsDepartment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_department
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    List<UmsDepartment> selectByExample(UmsDepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_department
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    UmsDepartment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_department
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    int updateByExampleSelective(@Param("row") UmsDepartment row, @Param("example") UmsDepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_department
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    int updateByExample(@Param("row") UmsDepartment row, @Param("example") UmsDepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_department
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    int updateByPrimaryKeySelective(UmsDepartment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_department
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    int updateByPrimaryKey(UmsDepartment row);
}