package com.plus.mybatisplus_demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plus.mybatisplus_demo.ResponseResult;
import com.plus.mybatisplus_demo.config.DataSourceConfig;
import com.plus.mybatisplus_demo.config.P6spyConfig;
import com.plus.mybatisplus_demo.pojo.Region;
import com.plus.mybatisplus_demo.service.IRegionService;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yz
 * @since 2022-07-19
 */
@RestController
@RequestMapping("/region")
@Slf4j
public class RegionController {

    @Autowired
    private IRegionService iRegionService;

    @RequestMapping("loadRegion")
    public Page<Region> loadRegion(Region region,@Param("current") int current,@Param("size") int size){
        QueryWrapper<Region> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(!StringUtils.isEmpty(region.getName()),"name",region.getName())
                .eq(!StringUtils.isEmpty(region.getNumber()),"number",region.getNumber());
        //Map<String,Object> map = new HashMap<>();
        //map.put("name","北京市");
        //map.put("number","110000");
        // queryWrapper.allEq(map, false);
                //.having("number >= 110000");
        //List<Region> result = iRegionService.list(queryWrapper);
        //log.info("result:{}",result);
        Page<Region> page = new Page<>();
        page.setSize(size);
        page.setCurrent(current);
        final Page<Region> page1 = iRegionService.page(page, queryWrapper);
        return page1;
    }

    @RequestMapping("update")
    public ResponseResult<Boolean> updateRecord(Region region){
        log.info("region:{}",region);
        ResponseResult<Boolean> response = new ResponseResult<>();
        response.setData(iRegionService.updateById(region)); ;
        response.setMsg("success");
        return response;
    }

    @RequestMapping("delete")
    public ResponseResult<Boolean> deleteRecord(Region region){
        ResponseResult<Boolean> response = new ResponseResult<>();
        //response.setData(iRegionService.removeById(region.getId()));
        iRegionService.updateById(region);
        response.setMsg("success");
        return response;
    }

    @Autowired
    private P6spyConfig p6spyConfig;

    @RequestMapping("insert")
    public ResponseResult<Boolean> insertRecord(Region region){
        log.info("data:{}",p6spyConfig.toString());
        ResponseResult<Boolean> response = new ResponseResult<>();
        response.setData(iRegionService.save(region));
        response.setMsg("success");
        return response;
    }
}
