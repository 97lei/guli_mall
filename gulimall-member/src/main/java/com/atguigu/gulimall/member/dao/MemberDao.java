package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author leiwang
 * @email 1404221253@qq.com
 * @date 2023-05-15 15:48:02
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}