package com.plus.mybatisplus_demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plus.mybatisplus_demo.mapper.UserInfoMapper;
import com.plus.mybatisplus_demo.pojo.Region;
import com.plus.mybatisplus_demo.pojo.UserInfo;
import com.plus.mybatisplus_demo.service.IUserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * @author YZ
 * @date 2022/7/18 0018
 * @apiNote
 */
@RestController
@RequestMapping("userinfo")
@Slf4j
public class UserInfoController {

    @Autowired
    private IUserInfoService iUserInfoService;


    @RequestMapping("LoadUser")
    public List<UserInfo> loadUserInfo(UserInfo userInfo){
        QueryWrapper<UserInfo> wrapper = new QueryWrapper<>();
        log.info("userInfo:{}",userInfo);
        if (userInfo!=null) {
            wrapper.eq(Objects.nonNull(userInfo.getUserId()),"userId",userInfo.getUserId());
            wrapper.eq(Objects.nonNull(userInfo.getUsername()),"username",userInfo.getUsername());
            wrapper.eq(Objects.nonNull(userInfo.getPassword()),"password",userInfo.getPassword());
        }
        UpdateWrapper<Region> updateWrapper = new UpdateWrapper<>();

        //wrapper.setEntity(userInfo)
        //.orderBy(true,true,"number");
        //not(i -> i.eq("name", "李白").ne("status", "活着"))
        //wrapper.eq("username","张三").not(e->e.eq("password","210932"));
        final List<Map<String, Object>> list =  iUserInfoService.listMaps(wrapper);
        final List<UserInfo> UserList = iUserInfoService.list(wrapper);
        Page<UserInfo> page = new Page();
        page.setSize(20);
        final Page<UserInfo> page1 = iUserInfoService.page(page);
        log.info("userinfo:{}",list);
        log.info("UserList:{}",UserList);
        return UserList;
    }


}
