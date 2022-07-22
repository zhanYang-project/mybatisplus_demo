package com.plus.mybatisplus_demo.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import mybatis.mate.annotation.Algorithm;
import mybatis.mate.annotation.Algorithm;
import mybatis.mate.annotation.FieldEncrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author YZ
 * @date 2022/7/18 0018
 * @apiNote
 */
@Data
@TableName("userinfo")
@NoArgsConstructor
@AllArgsConstructor
@Component
public class UserInfo {

    @FieldEncrypt(algorithm = Algorithm.PBEWithHMACSHA512AndAES_256)
    private String username;
    @FieldEncrypt(algorithm = Algorithm.PBEWithHMACSHA512AndAES_256)
    private String password;

    @TableId("userId")
    private String userId;
}
