package com.jctl.cloud.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by kay on 2016/11/21 0021.
 */
public class CookieUtils {

    public static void setCookieValue(HttpServletResponse response,String cookieName,String cookieValue){
        setCookieValue(response,cookieName,cookieValue,7*60*60*24);
    }

    public static void setCookieValue(HttpServletResponse response, String cookieName, String cookieValue, int maxAge){
        try {
            if(cookieValue != null){
                cookieValue = URLEncoder.encode(cookieValue, "UTF-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Cookie c = new Cookie(cookieName,cookieValue);
        c.setPath("/");
        c.setMaxAge(maxAge);//7*24小时过期
        response.addCookie(c);
    }


    public static String getCookieValue(HttpServletRequest request, String cookieName){
        Cookie[] cookies = request.getCookies();
        if(cookies == null) return "";

        for(Cookie c : cookies){
            if(c.getName().equalsIgnoreCase(cookieName)){
                String cookieValue = c.getValue();
                try {
                    cookieValue = URLEncoder.encode(cookieValue,"UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                return cookieValue;
            }
        }
        return "";
    }
    public static void clearCookies(HttpServletRequest request,HttpServletResponse response){
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for(Cookie c : cookies){
                c.setMaxAge(0);
                c.setValue(null);
                response.addCookie(c);
            }
        }
    }

    public static Long getProductId(){
        Long productId = null;
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie : cookies){
            if("redProductId".equals(cookie.getName())){
                productId = Long.valueOf(cookie.getValue());
            }
        }
        return productId;
    }
}
