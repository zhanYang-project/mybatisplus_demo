package com.plus.mybatisplus_demo;

//import com.plus.mybatisplus_demo.config.annotation.FieldEncrpty;
import com.sun.org.apache.bcel.internal.generic.NEW;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 */
@SpringBootApplication
@Slf4j
public class MybatisplusDemoApplication {

    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(MybatisplusDemoApplication.class, args);
        //final Object userInfo = context.getBean("UserInfo");
        //final Map<String, Object> beansWithAnnotation = context.getBeansWithAnnotation(FieldEncrpty.class);
        //log.info("map:{}",beansWithAnnotation);
    }

}
