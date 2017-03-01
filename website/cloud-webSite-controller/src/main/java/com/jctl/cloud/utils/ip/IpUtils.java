package com.jctl.cloud.utils.ip;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2016/11/28 0028.
 */
public class IpUtils {
	private IpUtils() {
    }
    public static String getIpAddr(HttpServletRequest request) {
        if(request == null) {
            return "unknown";
        } else {
            String ip = request.getHeader("x-forwarded-for");
            if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("Proxy-Client-IP");
            }

            if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("X-Forwarded-For");
            }

            if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("WL-Proxy-Client-IP");
            }

            if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("X-Real-IP");
            }

            if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getRemoteAddr();
            }
            return ip;
        }
    }

    /**
     * 获取访问Ip
     * @auth Tu
     * @return
     */
    public static String getIpAddress(){
    	StringBuilder sb=new StringBuilder();
    	try{
    		Enumeration<NetworkInterface> en=NetworkInterface.getNetworkInterfaces();


    		while(en.hasMoreElements()){
    			NetworkInterface intf=(NetworkInterface)en.nextElement();
    			Enumeration<InetAddress> enumIpAddr=intf.getInetAddresses();
    			while(enumIpAddr.hasMoreElements()){
    				InetAddress inetAddress=enumIpAddr.nextElement();
    				if(!inetAddress.isLoopbackAddress()&&!inetAddress.isLinkLocalAddress()&&inetAddress.isSiteLocalAddress()){
    					sb.append(inetAddress.getHostAddress().toString()+"\n");
    				}
    			}
    		}
    	}catch (Exception e) {
		 e.printStackTrace();
		}
    	return sb.toString();
    }

    
}