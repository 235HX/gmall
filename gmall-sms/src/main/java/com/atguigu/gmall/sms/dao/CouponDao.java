package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wanggh
 * @email wanggh@139.com
 * @date 2020-09-16 18:08:39
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
