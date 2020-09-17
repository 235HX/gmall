package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wanggh
 * @email wanggh@139.com
 * @date 2020-09-17 09:57:16
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
