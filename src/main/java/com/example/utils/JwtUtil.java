package com.example.utils;

import io.jsonwebtoken.*;

import java.util.Date;
import java.util.UUID;

public class JwtUtil {

    private static long time = 1000*60*60*1 ;
    private static String sign = "admin" ;

    public static String createToken(String username,Integer power){


        JwtBuilder builder = Jwts.builder();

        String jwToken = builder
                //头部
                .setHeaderParam("typ","JWT")
                .setHeaderParam("alg" , "HS256")
                //载荷 PayLoad
                .claim("username",username)
                .claim("power",power)
                .setSubject("admin-test")
                .setExpiration(new Date(System.currentTimeMillis()+time))
                .setId(UUID.randomUUID().toString())

                //签名
                .signWith(SignatureAlgorithm.HS256,sign)

                //使用,连接成完整的字符串
                .compact();

        return jwToken;
    }

    //验证Token是否过期的方法
    public static boolean checkToken(String token){

        if(token == null || token == ""){

            return false ;
        }

        try {
            Jws<Claims> claimsJws = Jwts.parser().setSigningKey(sign).parseClaimsJws(token);//将token JWT的值转化成一个Key-value的值，通过key获取对应的value
        } catch (Exception e) {
            e.printStackTrace();
            return false ;

        }

        return true ;

    }
}
