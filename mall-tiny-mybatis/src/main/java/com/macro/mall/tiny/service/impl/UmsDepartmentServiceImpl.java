package com.macro.mall.tiny.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.tiny.mbg.mapper.UmsDepartmentMapper;
import com.macro.mall.tiny.mbg.model.UmsDepartment;
import com.macro.mall.tiny.mbg.model.UmsDepartmentExample;
import com.macro.mall.tiny.service.UmsDepartmentService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.List;

@Service
public class UmsDepartmentServiceImpl implements UmsDepartmentService {
    @Autowired
    private UmsDepartmentMapper umsDepartmentMapper;

    @Override
    public UmsDepartment SelectByPrimaryKey(long id)
    {
        return umsDepartmentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UmsDepartment> SelectAll()
    {
        return umsDepartmentMapper.selectByExample(new UmsDepartmentExample());
    }

    @Override
    public List<UmsDepartment> ListPage(Integer pageNum, Integer pageSize)
    {
        PageHelper.startPage(pageNum,pageSize);
        return umsDepartmentMapper.selectByExample(new UmsDepartmentExample());
    }
}
