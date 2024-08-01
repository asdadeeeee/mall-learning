package com.macro.mall.tiny.test;

import com.macro.mall.tiny.dao.UmsDepartmentDao;
import com.macro.mall.tiny.mbg.mapper.UmsDepartmentMapper;
import com.macro.mall.tiny.mbg.model.UmsDepartment;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisZhouzjTest {

    @Autowired
    private UmsDepartmentDao umsDepartmentDao;
    @Autowired
    private UmsDepartmentMapper umsDepartmentMapper;
    private static final Logger LOGGER = LoggerFactory.getLogger(MyBatisBaseTest.class);

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
        UmsDepartment department = umsDepartmentMapper.selectByPrimaryKey(2L);
        LOGGER.info("testSelectSingleByID, result = {}",department);
    }
}
