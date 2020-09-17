package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wanggh
 * @email wanggh@139.com
 * @date 2020-09-17 09:48:37
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
