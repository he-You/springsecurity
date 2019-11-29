package com.heyou.springsecurity.util;

import com.alibaba.fastjson.JSON;
import com.heyou.springsecurity.config.JwtConfig;
import com.heyou.springsecurity.security.entity.UserAndRoleInfo;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * 简要说明:
 *
 * @author heyou
 * @date 2019-11-28 23:27
 */
@Slf4j
public class JwtTokenUtil {
    public static String createAccessToken(UserAndRoleInfo selfUserEntity){
        // 登陆成功生成JWT
        String token = Jwts.builder()
                // 放入用户名和用户ID
                .setId(selfUserEntity.getUserId()+"")
                // 主题
                .setSubject(selfUserEntity.getUsername())
                // 签发时间
                .setIssuedAt(new Date())
                // 签发者
                .setIssuer("sans")
                // 自定义属性 放入用户拥有权限
                .claim("authorities", JSON.toJSONString(selfUserEntity.getAuthorities()))
                // 失效时间
                .setExpiration(new Date(System.currentTimeMillis() + JwtConfig.expiration))
                // 签名算法和密钥
                .signWith(SignatureAlgorithm.HS512, JwtConfig.secret)
                .compact();
        return token;
    }
}

