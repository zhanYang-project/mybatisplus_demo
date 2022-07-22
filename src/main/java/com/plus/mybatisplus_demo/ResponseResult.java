package com.plus.mybatisplus_demo;

import lombok.Data;

/**
 * @author liyi
 * @date 2022/6/26
 * @apiNote
 */
@Data
public class ResponseResult<T> {
    private int code;
    private T data;
    private String msg;
}
