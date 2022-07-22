package com.plus.mybatisplus_demo;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author YZ
 * @date 2022/7/20 0020
 * @apiNote
 */
@Data
public class ResponseEntity {
    private String code;
    private String message;
    private Map<String,Object> map = new HashMap<>();
}
