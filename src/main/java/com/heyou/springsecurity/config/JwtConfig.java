package com.heyou.springsecurity.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 简要说明:
 * JWT配置类
 * @author heyou
 * @date 2019-11-28 23:28
 */
@Data
@Component
//@ConfigurationProperties(prefix = "jwt")
public class JwtConfig {
    /**
     * 密钥KEY
     */
    public static String secret;
    /**
     * TokenKey
     */
    public static String tokenHeader;
    /**
     * Token前缀字符
     */
    public static String tokenPrefix;
    /**
     * 过期时间
     */
    public static Integer expiration;
    /**
     * 不需要认证的接口
     */
    public static String antMatchers;
}
