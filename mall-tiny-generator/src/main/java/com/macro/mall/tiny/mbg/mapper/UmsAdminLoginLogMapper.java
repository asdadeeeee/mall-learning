package com.macro.mall.tiny.mbg.mapper;

import com.macro.mall.tiny.mbg.model.UmsAdminLoginLog;
import com.macro.mall.tiny.mbg.model.UmsAdminLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminLoginLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_login_log
     *
     * @mbg.generated Thu Aug 01 16:41:31 GMT+08:00 2024
     */
    long countByExample(UmsAdminLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_login_log
     *
     * @mbg.generated Thu Aug 01 16:41:31 GMT+08:00 2024
     */
    int deleteByExample(UmsAdminLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_login_log
     *
     * @mbg.generated Thu Aug 01 16:41:31 GMT+08:00 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_login_log
     *
     * @mbg.generated Thu Aug 01 16:41:31 GMT+08:00 2024
     */
    int insert(UmsAdminLoginLog row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_login_log
     *
     * @mbg.generated Thu Aug 01 16:41:31 GMT+08:00 2024
     */
    int insertSelective(UmsAdminLoginLog row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_login_log
     *
     * @mbg.generated Thu Aug 01 16:41:31 GMT+08:00 2024
     */
    List<UmsAdminLoginLog> selectByExample(UmsAdminLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_login_log
     *
     * @mbg.generated Thu Aug 01 16:41:31 GMT+08:00 2024
     */
    UmsAdminLoginLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_login_log
     *
     * @mbg.generated Thu Aug 01 16:41:31 GMT+08:00 2024
     */
    int updateByExampleSelective(@Param("row") UmsAdminLoginLog row, @Param("example") UmsAdminLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_login_log
     *
     * @mbg.generated Thu Aug 01 16:41:31 GMT+08:00 2024
     */
    int updateByExample(@Param("row") UmsAdminLoginLog row, @Param("example") UmsAdminLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_login_log
     *
     * @mbg.generated Thu Aug 01 16:41:31 GMT+08:00 2024
     */
    int updateByPrimaryKeySelective(UmsAdminLoginLog row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_login_log
     *
     * @mbg.generated Thu Aug 01 16:41:31 GMT+08:00 2024
     */
    int updateByPrimaryKey(UmsAdminLoginLog row);
}