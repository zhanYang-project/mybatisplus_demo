package com.plus.mybatisplus_demo;

import com.baomidou.mybatisplus.core.toolkit.AES;
import com.plus.mybatisplus_demo.config.P6spyConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class MybatisplusDemoApplicationTests {

    @Autowired
    private  P6spyConfig p6spyConfig;

    @Test
    void contextLoads() {
        String password ="123456";
        final String key = AES.generateRandomKey();
        final String result = AES.encrypt(password, "d1104d7c3b616f0b");
        log.info("result:{}",result);
    }

}

