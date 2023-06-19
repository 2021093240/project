package com.example.utils;

import io.jsonwebtoken.*;

public class JwtUtil {

    private static String sign="admin";

    public static boolean checkToken(String token){
        if (token==null || token==""){
            return false;
        }
        try {
            Jws<Claims> claimsJws = Jwts.parser().setSigningKey(sign).parseClaimsJws(token);
        } catch (Exception e) {
           e.printStackTrace();
           return false;
        }
        return true;
    }
}
