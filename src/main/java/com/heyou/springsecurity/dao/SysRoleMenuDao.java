package com.heyou.springsecurity.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heyou.springsecurity.entity.SysRoleMenuEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色权限关系DAO
 */
@Mapper
public interface SysRoleMenuDao extends BaseMapper<SysRoleMenuEntity> {
	
}
