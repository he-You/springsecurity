package com.heyou.springsecurity.util;

import com.heyou.springsecurity.entity.UserAndRoleInfo;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author heyou
 * @date 2019-11-29 10:53
 */
public class SecurityUtil {
    /**
     * 私有化构造器
     */
    private SecurityUtil(){}

    /**
     * 获取当前用户信息
     */
    public static UserAndRoleInfo getUserInfo(){
        UserAndRoleInfo userDetails = (UserAndRoleInfo) SecurityContextHolder.getContext().getAuthentication() .getPrincipal();
        return userDetails;
    }
    /**
     * 获取当前用户ID
     */
    public static Long getUserId(){
        return getUserInfo().getUserId();
    }
    /**
     * 获取当前用户账号
     */
    public static String getUserName(){
        return getUserInfo().getUsername();
    }
}
