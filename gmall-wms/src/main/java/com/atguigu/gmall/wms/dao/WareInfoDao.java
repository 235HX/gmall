package com.atguigu.gmall.wms.dao;

import com.atguigu.gmall.wms.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author wanggh
 * @email wanggh@139.com
 * @date 2020-09-17 10:08:31
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
