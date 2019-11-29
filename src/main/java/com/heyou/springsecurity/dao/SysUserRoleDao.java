package com.heyou.springsecurity.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heyou.springsecurity.entity.SysUserRoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description 用户与角色关系DAO
 */
@Mapper
public interface SysUserRoleDao extends BaseMapper<SysUserRoleEntity> {
	
}
