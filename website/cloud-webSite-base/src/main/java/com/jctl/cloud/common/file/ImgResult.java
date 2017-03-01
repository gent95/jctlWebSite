package com.jctl.cloud.common.file;

/**
 * 返回结果类型
 * Created by kay on 2016/12/9 0009.
 */
public class ImgResult {

    //文件保存路径
    private String realPath;
    //文件网络路径
    private  String url;

    public String getRealPath() {
        return realPath;
    }

    public void setRealPath(String realPath) {
        this.realPath = realPath;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
