package com.heyou.springsecurity.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heyou.springsecurity.entity.SysRoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description 角色DAO
 */
@Mapper
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {

}