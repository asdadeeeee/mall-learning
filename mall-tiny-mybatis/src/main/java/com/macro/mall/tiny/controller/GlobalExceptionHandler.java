package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonResult;
import lombok.extern.java.Log;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import  com.macro.mall.tiny.common.api.ResultCode;

@ControllerAdvice
@Log
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(DataAccessException.class)
    public CommonResult HandleDataAccessException(DataAccessException ex)
    {
        log.info("GlobalExceptionHandler HandleDataAccessException");
        return CommonResult.failed(ResultCode.SYSTEMFAILED);
    }
}
