package com.heyou.springsecurity.security.service;

import com.heyou.springsecurity.entity.SysUserEntity;
import com.heyou.springsecurity.security.entity.UserAndRoleInfo;
import com.heyou.springsecurity.service.SysUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * SpringSecurity用户的业务实现
 * @Author Sans
 * @CreateTime 2019/10/1 17:21
 */
@Component
public class SelfUserDetailsService implements UserDetailsService {

    @Resource
    private SysUserService sysUserService;

    /**
     * 查询用户信息
     * @Author Sans
     * @CreateTime 2019/9/13 17:23
     * @Param  username  用户名
     * @Return UserDetails SpringSecurity用户信息
     */
    @Override
    public UserAndRoleInfo loadUserByUsername(String username) throws UsernameNotFoundException {
        // 查询用户信息
        SysUserEntity sysUserEntity =sysUserService.selectUserByName(username);
        if (sysUserEntity!=null){
            // 组装参数
            UserAndRoleInfo selfUserEntity = new UserAndRoleInfo();
            BeanUtils.copyProperties(sysUserEntity,selfUserEntity);
            return selfUserEntity;
        }
        return null;
    }
}