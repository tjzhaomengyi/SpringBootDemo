package com.mikemyzhao.springbootdemo.config;

import com.mikemyzhao.springbootdemo.entity.Student;
import com.mikemyzhao.springbootdemo.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: zhaomengyi
 * @Date: 2019/9/2 18:20
 * @Description:配置类
 */

@Configuration
public class AppConfig {
    @Bean
    public StudentService stuService(){
        StudentService studentService = new StudentService();
        return  studentService;//<bean>
    }

}
