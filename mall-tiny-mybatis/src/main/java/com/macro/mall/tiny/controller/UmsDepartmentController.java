package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.mbg.model.UmsDepartment;
import com.macro.mall.tiny.service.UmsDepartmentService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Log
@RequestMapping("/Department")
public class UmsDepartmentController {
    @Autowired
    private UmsDepartmentService umsDepartmentService;

    @RequestMapping(value = "select/{ID}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<UmsDepartment> GetUmsDepartment(@PathVariable("ID") Long ID)
    {
        return CommonResult.success(umsDepartmentService.SelectByPrimaryKey(ID));
    }

    @RequestMapping(value = "/All", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<UmsDepartment>> GetAllUmsDepartment()
    {
        return CommonResult.success(umsDepartmentService.SelectAll());
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<UmsDepartment>> GetListUmsDepartment(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                                                  @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize)
    {
        return CommonResult.success(umsDepartmentService.ListPage(pageNum,pageSize));
    }
}
