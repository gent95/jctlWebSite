package com.jctl.cloud.utils.file.img;

//import com.sun.image.codec.jpeg.JPEGCodec;
//import com.sun.image.codec.jpeg.JPEGImageEncoder;

import com.jctl.cloud.common.file.ImgResult;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Date;

/**
 * Created by kay on 2016/12/8.
 */

/**
 * 图像工具
 *
 * @author kay
 */
@SuppressWarnings("restriction")
public class ImgUtils {


    private static final long serialVersionUID = 1L;
    // 保存文件的目录

    private static String PATH_FOLDER = "/upload/";
    // 存放临时文件的目录
    private static String TEMP_FOLDER = "/uploadTemp";


    /**
     * 文件上传
     * response)
     */
    public static ImgResult upload(HttpServletRequest request, MultipartFile picFile) {
        ImgResult result = new ImgResult();
        try {
            String filename = picFile.getOriginalFilename();
            String saveName = new Date().getTime() + filename.substring(filename.lastIndexOf("."));
            String filePath = request.getSession().getServletContext().getRealPath("/") + PATH_FOLDER + saveName;
            String picUrl = PATH_FOLDER + saveName;
            mkDir(request.getSession().getServletContext().getRealPath("/") + PATH_FOLDER);
            picFile.transferTo(new File(filePath));
            result.setRealPath(filePath);
            result.setUrl(picUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 创建文件夹
     * @param path
     */
    public static void mkDir(String path) {
        File file = new File(path);
        if (!file.exists() && !file.isDirectory()) {
            System.out.println("//不存在");
            file.mkdir();
        } else {
            System.out.println("//目录存在");
        }

    }
}