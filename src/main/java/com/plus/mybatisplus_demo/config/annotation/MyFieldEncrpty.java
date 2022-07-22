//package com.plus.mybatisplus_demo.config.annotation;
//
//import mybatis.mate.annotation.Algorithm;
//import org.springframework.core.Ordered;
//import org.springframework.core.annotation.Order;
//
//import java.lang.annotation.*;
//
///**
// * @author YZ
// * @date 2022/7/22 0022
// * @apiNote
// */
////标识作用
//@Documented
//
////注解的作用目标
//@Target({ElementType.FIELD, ElementType.TYPE})
//
////注解的保留时限 RUNTIME 是指在运行时有效
////取值（RetentionPoicy）有：
////1.SOURCE:在源文件中有效（即源文件保留）
////2.CLASS:在class文件中有效（即class保留）
////3.RUNTIME:在运行时有效（即运行时保留）
//@Retention(RetentionPolicy.RUNTIME)
//
////定义Spring容器加载bean的顺序
////代表这个过滤器在众多过滤器中级别最高，也就是过滤的时候最先执行
//@Order(Ordered.HIGHEST_PRECEDENCE)
//public @interface MyFieldEncrpty  {
//
//    Algorithm algorithm() default Algorithm.PBEWithMD5AndDES;
//
//    String value() default "";
//
//}
