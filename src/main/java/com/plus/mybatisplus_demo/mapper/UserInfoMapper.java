package com.plus.mybatisplus_demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.plus.mybatisplus_demo.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.servlet.annotation.HandlesTypes;

/**
 * @author YZ
 * @date 2022/7/18 0018
 * @apiNote
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {
}
