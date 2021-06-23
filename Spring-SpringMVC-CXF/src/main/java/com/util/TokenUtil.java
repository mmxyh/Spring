package com.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * token工具类
 * @Author: hmm
 * @Date: 2019/5/17 10:00
 */
public class TokenUtil {
    //过期时间
    private static final long EXPIRE_TIME = 24 * 60 * 60 * 1000;
//    private static final long EXPIRE_TIME = 5 * 1000;
    //私钥
    private static final String TOKEN_SECRET = "thefirsttoken123";

    /**
     * 生成签名，12小时过期
     *
     * @param **username**
     * @param **password**
     * @return
     */
    public static String sign(Map<String, Object> param) {
        try {
            // 设置过期时间
            Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            // 私钥和加密算法
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            // 设置头部信息
            Map<String, Object> header = new HashMap<>(2);
            header.put("Type", "Jwt");
            header.put("alg", "HS256");
            // 返回token字符串
            return JWT.create()
                    .withHeader(header)
                    .withClaim("uid", (int) param.get("uid"))
                    .withClaim("userName", (String) param.get("userName"))
                    .withClaim("userCode", (String) param.get("userCode"))
                    .withClaim("orgId", (String) param.get("orgId"))
                    .withClaim("orgName", (String) param.get("orgName"))
                    .withClaim("depCode", (String) param.get("depCode"))
                    .withClaim("depName", (String) param.get("depName"))
                    .withExpiresAt(date)
                    .sign(algorithm);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 检验token是否正确
     *
     * @param **token**
     * @return
     */
    public static boolean verify(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 从token中获取userCode信息
     *
     * @param **token**
     * @return
     */
    public static String getUserCode(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("userCode").asString();
        } catch (JWTDecodeException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 从token中获取userName信息
     *
     * @param **token**
     * @return
     */
    public static String getUserName(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("userName").asString();
        } catch (JWTDecodeException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 从token中获取uid信息
     *
     * @param **token**
     * @return
     */
    public static int getUid(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("uid").asInt();
        } catch (JWTDecodeException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * 获取orgId
     *
     * @param **token**
     * @return
     */
    public static String getOrgId(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("orgId").asString();
        } catch (JWTDecodeException e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 获取orgName
     *
     * @param **token**
     * @return
     */
    public static String getOrgName(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("orgName").asString();
        } catch (JWTDecodeException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取depCode
     *
     * @param **token**
     * @return
     */
    public static String getDepCode(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("depCode").asString();
        } catch (JWTDecodeException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取depName
     *
     * @param **token**
     * @return
     */
    public static String getDepName(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("depName").asString();
        } catch (JWTDecodeException e) {
            e.printStackTrace();
            return null;
        }
    }
}
