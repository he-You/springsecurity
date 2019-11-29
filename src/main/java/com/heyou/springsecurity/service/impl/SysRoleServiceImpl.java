package com.heyou.springsecurity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heyou.springsecurity.dao.SysRoleDao;
import com.heyou.springsecurity.entity.SysRoleEntity;
import com.heyou.springsecurity.service.SysRoleService;
import org.springframework.stereotype.Service;

/**
 * @Description 角色业务实现
 */
@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleDao, SysRoleEntity> implements SysRoleService {

}