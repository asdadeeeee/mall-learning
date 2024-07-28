package com.macro.mall.tiny.dao;

import com.macro.mall.tiny.model.UmsDepartment;
import org.springframework.stereotype.Repository;

public interface UmsDepartmentDao {

    UmsDepartment SelectSingleByID(Long id);

    int InsertSingle(UmsDepartment umsDepartment);
}
