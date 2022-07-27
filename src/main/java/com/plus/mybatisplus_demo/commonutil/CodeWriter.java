package com.plus.mybatisplus_demo.commonutil;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @author YZ
 * @date 2022/7/18 0018
 * @apiNote
 * 需要依赖于 Freemarker 引擎模板 ，generator 代码生成依赖
 */

public class CodeWriter {
    private static final String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC";
    private static final String username ="root";
    private static final String password ="123456";


    public static void main(String[] args) {
        FastAutoGenerator.create(url, username, password).globalConfig(builder->{
                    builder.author("yz") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D://code"); // 指定输出目录
                }).packageConfig(builder -> {
                    builder.parent("com.baomidou.mybatisplus.samples.generator") // 设置父包名
                            .moduleName("CoderWriter") // 设置父包模块名


                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D://code")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder
                            //.addInclude("t_simple") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine())
                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

}

