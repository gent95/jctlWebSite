package com.jctl.cloud.utils.web;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2016/12/8 0008.
 */
public class WebPathUtils {

    public WebPathUtils() {
    }

    public static String getContextRealPath(HttpServletRequest request) {
        return request.getRealPath("/");
    }

    public static String getContextRealPath(HttpServletRequest request, String relativePath) {
        if(relativePath != null && !relativePath.startsWith("/")) {
            relativePath = "/" + relativePath;
        }

        return request.getRealPath(relativePath);
    }

    public static String getWebRootPath(String webRootKey) {
        return System.getProperty(webRootKey);
    }
}
