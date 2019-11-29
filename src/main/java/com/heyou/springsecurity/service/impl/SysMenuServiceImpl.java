package com.heyou.springsecurity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heyou.springsecurity.dao.SysMenuDao;
import com.heyou.springsecurity.entity.SysMenuEntity;
import com.heyou.springsecurity.service.SysMenuService;
import org.springframework.stereotype.Service;

/**
 * @Description 权限业务实现
 */
@Service("sysMenuService")
public class SysMenuServiceImpl extends ServiceImpl<SysMenuDao, SysMenuEntity> implements SysMenuService {

}