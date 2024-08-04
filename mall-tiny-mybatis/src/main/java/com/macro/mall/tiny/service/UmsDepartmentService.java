package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.UmsDepartment;

import java.util.List;

public interface UmsDepartmentService {
    UmsDepartment SelectByPrimaryKey(long id);

    List<UmsDepartment> SelectAll();

    List<UmsDepartment> ListPage(Integer pageNum, Integer pageSize);
}
