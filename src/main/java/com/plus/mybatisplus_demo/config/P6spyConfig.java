package com.plus.mybatisplus_demo.config;

import lombok.Data;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
/**
 * @author YZ
 * @date 2022/7/20 0020
 * @apiNote
 */
@Data
@Configuration
@PropertySource(value = "classpath:application.yml")
@ConfigurationProperties(prefix ="p6spy.config")
public class P6spyConfig {

    public static String appender;
    public static String logMessageFormat;
    public static String customLogMessageFormat;


}
