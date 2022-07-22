package com.plus.mybatisplus_demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.plus.mybatisplus_demo.mapper.RegionMapper;
import com.plus.mybatisplus_demo.pojo.Region;
import com.plus.mybatisplus_demo.service.IRegionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yz
 * @since 2022-07-19
 */
@Service
public class RegionServiceImpl extends ServiceImpl<RegionMapper, Region> implements IRegionService {

}
