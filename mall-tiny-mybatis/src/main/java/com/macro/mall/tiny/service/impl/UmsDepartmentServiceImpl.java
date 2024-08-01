package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.mbg.mapper.UmsDepartmentMapper;
import com.macro.mall.tiny.mbg.model.UmsDepartment;
import com.macro.mall.tiny.service.UmsDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UmsDepartmentServiceImpl implements UmsDepartmentService {
    @Autowired
    private UmsDepartmentMapper umsDepartmentMapper;

    public UmsDepartment SelectByPrimaryKey(long id){
        return  umsDepartmentMapper.selectByPrimaryKey(id);
    }
}
