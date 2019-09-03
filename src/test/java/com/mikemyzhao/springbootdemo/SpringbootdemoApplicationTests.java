package com.mikemyzhao.springbootdemo;

import com.mikemyzhao.springbootdemo.entity.Student;
import com.mikemyzhao.springbootdemo.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdemoApplicationTests {

    @Autowired
    Student student;

    @Autowired
    ApplicationContext context;

    Logger logger = LoggerFactory.getLogger(SpringbootdemoApplicationTests.class);

    @Test
    public void contextLoads() {
        System.out.println(student);
    }

    @Test
    public void testImportResource(){
//        StudentService ss = (StudentService) context.getBean("studentService");
        StudentService ss = (StudentService) context.getBean("stuService");

        System.out.println(ss);
    }

    @Test
    public void testLog(){
        logger.trace("trace***");
        logger.debug("debug***");
        logger.info("info***");
        logger.warn("warn***");
        logger.error("error***");
    }


}
