package com.jctl.cloud.utils.msg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 *
 * 服务商：http://www.106jiekou.com/
 * 短信发送模板 测试版
 * Created by Kay on 2016/12/1 0001.
 */
public class SendMsgUtils {


    /**
     * 测试账号密码
     */
//    private static final String ACCOUNT = "i710833194";
//    private static final String PASS_WORD = "meirenai";
    private static final String POST_URL = "http://sms.106jiekou.com/utf8/sms.aspx?account=i710833194&password=meirenai&mobile=13693567027&content=您的订单编码：6666。如需帮助请联系客服。";





    public static String sendMsg(String postData, String postUrl) {
        try {
            //发送POST请求
            URL url = new URL(postUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setUseCaches(false);
            conn.setDoOutput(true);

            conn.setRequestProperty("Content-Length", "" + postData.length());
            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
            out.write(postData);
            out.flush();
            out.close();

            //获取响应状态
            if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                return "网络连接失败！";
            }
            //获取响应内容体
            String line, result = "";
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
            while ((line = in.readLine()) != null) {
                result += line + "\n";
            }
            in.close();
            return result;
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return "";
    }

    /**
     * 短息接口测试
     * @param args
     */
    public static  void main(String []args){

        String msg = sendMsg("6666",POST_URL);
        System.out.print(msg);
    }
}
