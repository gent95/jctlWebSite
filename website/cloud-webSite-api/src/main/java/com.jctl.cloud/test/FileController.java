package com.jctl.cloud.api.test;

import com.jctl.cloud.common.file.ImgResult;
import com.jctl.cloud.common.utils.Reflections;
import com.jctl.cloud.utils.file.img.ImgUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kay on 2016/12/8 0008.
 */
@Controller
@RequestMapping("file")
public class FileController {

    private final String imgSize = "" + 1024 * 6;


    /**
     * 图片上传方法
     *
     * @return
     */
    @RequestMapping("uploadImg")
    public String uploadImg() {
        return "test/upload";
    }

    @RequestMapping("/busnesRef")
    public String introduction() {
        return "web/solution/busnesRef";
    }

    @RequestMapping("laYui")
    public String laYui() {
        return "test/layui";
    }


    @RequestMapping("upload")
    public void upload(HttpServletRequest request, Model model, MultipartFile picFile) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        Map<String, Object> rel = new HashMap<String, Object>();
        if (picFile == null) {
            resultMap.put("result", 0);
            return;
        }
        try {
            ImgResult result = ImgUtils.upload(request, picFile);
            String[] propertys = new String[]{"imgUrl", "realPath"};
            for (String property : propertys) {
                resultMap.put(property, Reflections.invokeGetter(result, property));
            }
            rel.put("result", resultMap);
        } catch (Exception e) {
            model.addAttribute("flag", 0);
            e.printStackTrace();
        }
    }


    @RequestMapping("laUp")
    @ResponseBody
    public Map laUp(HttpServletRequest request, Model model, MultipartFile picFile) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        Map<String, Object> rel = new HashMap<String, Object>();
        if (picFile == null) {
            model.addAttribute("flag", 0);
        }
        try {
            ImgResult result = ImgUtils.upload(request, picFile);
            String[] propertys = new String[]{"imgUrl", "realPath"};
            for (String property : propertys) {
                if ("imgUrl".equals(property)) {
                    resultMap.put("url", Reflections.invokeGetter(result, property));
                } else {
                    resultMap.put(property, Reflections.invokeGetter(result, property));
                }
            }
            rel.put("result", resultMap);
        } catch (Exception e) {
            model.addAttribute("flag", 0);
            e.printStackTrace();
        }
        return resultMap;
    }
}
