package com.plus.mybatisplus_demo.pojo;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.experimental.Accessors;

/**
 * @author YZ
 * @date 2022/7/20 0020
 * @apiNote
 */
@Getter
public enum ResponseCodeEnum implements IEnum<ResponseCodeEnum> {

    /*资源不存在*/
    CODE_404(404,"资源不存在"),
    /*系统未知异常*/
    CODE_500(500,"系统未知异常"),
    /*请求成功*/
    CODE_200(200,"请求成功"),
    /*权限不足*/
    CODE_403(403,"权限不足"),
    /*访问异常*/
    CODE_503(503,"访问异常");

    ResponseCodeEnum(int code,String msg){
        this.code=code;
        this.msg=msg;
    }

    @EnumValue
    @JsonValue
    private final int code;
    @EnumValue
    @JsonValue
    private final String msg;

    @Override
    public ResponseCodeEnum getValue() {
        return this;
    }
}
