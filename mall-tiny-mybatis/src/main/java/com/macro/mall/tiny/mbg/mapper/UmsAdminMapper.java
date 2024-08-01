package com.macro.mall.tiny.mbg.mapper;

import com.macro.mall.tiny.mbg.model.UmsAdmin;
import com.macro.mall.tiny.mbg.model.UmsAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    long countByExample(UmsAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    int deleteByExample(UmsAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    int insert(UmsAdmin row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    int insertSelective(UmsAdmin row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    List<UmsAdmin> selectByExample(UmsAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    UmsAdmin selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    int updateByExampleSelective(@Param("row") UmsAdmin row, @Param("example") UmsAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    int updateByExample(@Param("row") UmsAdmin row, @Param("example") UmsAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    int updateByPrimaryKeySelective(UmsAdmin row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbg.generated Thu Aug 01 16:44:44 GMT+08:00 2024
     */
    int updateByPrimaryKey(UmsAdmin row);
}