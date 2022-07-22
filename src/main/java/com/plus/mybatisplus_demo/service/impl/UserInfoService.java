package com.plus.mybatisplus_demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.plus.mybatisplus_demo.mapper.UserInfoMapper;
import com.plus.mybatisplus_demo.pojo.UserInfo;
import com.plus.mybatisplus_demo.service.IUserInfoService;
import org.springframework.stereotype.Service;

/**
 * @author YZ
 * @date 2022/7/18 0018
 * @apiNote
 */
@Service
public class UserInfoService extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {
}
