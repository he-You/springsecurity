package com.heyou.springsecurity.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.heyou.springsecurity.entity.SysMenuEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 权限DAO
 */
@Mapper
public interface SysMenuDao extends BaseMapper<SysMenuEntity> {

}