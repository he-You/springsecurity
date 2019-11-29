package com.heyou.springsecurity.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heyou.springsecurity.entity.SysMenuEntity;
import com.heyou.springsecurity.entity.SysRoleEntity;
import com.heyou.springsecurity.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * @Description 系统用户DAO
 */
@Mapper
public interface SysUserDao extends BaseMapper<SysUserEntity> {

    /**
     * 通过用户ID查询角色集合
     */
    List<SysRoleEntity> selectSysRoleByUserId(Long userId);
    /**
     * 通过用户ID查询权限集合
     */
    List<SysMenuEntity> selectSysMenuByUserId(Long userId);
	
}
