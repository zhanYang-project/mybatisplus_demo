package com.plus.mybatisplus_demo.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author YZ
 * @date 2022/7/21 0021
 * @apiNote
 */
@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
@PropertySource(value = "classpath:application.yml")
@Data
public class DataSourceConfig {

    @Value("${username}")
    public  String username;
    @Value("${password}")
    public  String password;
    @Value("${url}")
    public  String url;
    @Value("${driver-class-name}")
    public String driverClassName;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "DataSourceConfig{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                ", driverClassName='" + driverClassName + '\'' +
                '}';
    }
}
