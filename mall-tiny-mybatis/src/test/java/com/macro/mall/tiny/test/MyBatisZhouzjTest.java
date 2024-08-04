package com.macro.mall.tiny.test;

import com.github.pagehelper.PageHelper;
import com.macro.mall.tiny.dao.UmsDepartmentDao;
import com.macro.mall.tiny.mbg.mapper.UmsDepartmentMapper;
import com.macro.mall.tiny.mbg.model.UmsDepartment;
import com.macro.mall.tiny.mbg.model.UmsDepartmentExample;
import com.macro.mall.tiny.service.UmsDepartmentService;
import com.macro.mall.tiny.service.impl.UmsDepartmentServiceImpl;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Log
@SpringBootTest
public class MyBatisZhouzjTest {

    @Autowired
    private UmsDepartmentDao umsDepartmentDao;
    @Autowired
    private UmsDepartmentMapper umsDepartmentMapper;
    @Autowired
    private UmsDepartmentService umsDepartmentService;

//    private static final Logger LOGGER = LoggerFactory.getLogger(MyBatisBaseTest.class);

//    @Test
//    void testSelectSingleByID()
//    {
//        UmsDepartment department = umsDepartmentDao.SelectSingleByID(2L);
//        LOGGER.info("testSelectSingleByID, result = {}",department);
//    }
//
//    @Test
//    void testInsertSingle()
//    {
//        UmsDepartment department = new UmsDepartment();
//        department.setName("T2");
//        department.setNumber(2);
//        int id = umsDepartmentDao.InsertSingle(department);
//        LOGGER.info("testInsertSingle, result = {}",department);
//    }

    @Test
    void testSelectSingleByID()
    {
        UmsDepartment department = umsDepartmentService.SelectByPrimaryKey(100l);
        log.info("testSelectSingleByID, result = "+ department);
    }

    @Test
    void testSelectAll()
    {
        PageHelper.startPage(1,10);
        List<UmsDepartment> departments = umsDepartmentMapper.selectByExample(new UmsDepartmentExample());
        for(UmsDepartment department : departments)
        {
            //LOGGER.info("testSelectAll, result = {}",department);
        }

    }
}
