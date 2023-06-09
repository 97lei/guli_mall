package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author leiwang
 * @email 1404221253@qq.com
 * @date 2023-05-15 16:08:34
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
