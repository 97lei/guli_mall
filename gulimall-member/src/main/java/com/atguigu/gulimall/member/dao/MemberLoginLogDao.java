package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author leiwang
 * @email 1404221253@qq.com
 * @date 2023-05-15 15:48:02
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
