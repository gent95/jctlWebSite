package com.jctl.cloud.utils.file.img;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/16 0016.
 */
public class FileUtils {

    // 保存文件的目录
    private static String PATH_FOLDER = "E:/data/img";
    // 存放临时文件的目录
    private static String TEMP_FOLDER = "/uploadTemp";

    private static String URL_NGINX ="localhost:8080/";


    public static Map<String, Object> upload(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        request.setCharacterEncoding("utf-8"); // 设置编码
//        response.setContentType("text/html;charset=UTF-8");
        DiskFileItemFactory factory = new DiskFileItemFactory();
        factory.setRepository(new File(TEMP_FOLDER));
        factory.setSizeThreshold(1024 * 1024);
        ServletFileUpload upload = new ServletFileUpload(factory);
        List<FileItem> list = upload.parseRequest(request);
        FileItem item = getUploadFileItem(list);
        String filename = getUploadFileName(item);
        String saveName = new Date().getTime() + filename.substring(filename.lastIndexOf("."));
        String picUrl = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/upload/" + saveName;
        item.write(new File(PATH_FOLDER, saveName));

        result.put("path", PATH_FOLDER);
        result.put("url", URL_NGINX + saveName);
        result.put("fileName", filename);
        return result;
    }


    public static FileItem getUploadFileItem(List<FileItem> list) {
        for (FileItem fileItem : list) {
            if (!fileItem.isFormField()) {
                return fileItem;
            }
        }
        return null;
    }

    public static String getUploadFileName(FileItem item) {
        // 获取路径名
        String value = item.getName();
        // 索引到最后一个反斜杠
        int start = value.lastIndexOf("/");
        // 截取 上传文件的 字符串名字，加1是 去掉反斜杠，
        String filename = value.substring(start + 1);

        return filename;
    }


}

