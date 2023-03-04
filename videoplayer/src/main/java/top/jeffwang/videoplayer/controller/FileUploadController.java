package top.jeffwang.videoplayer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin(origins = "*")
public class FileUploadController {
    //访问路径为：http://localhost:8080/file

//    @RequestMapping("/")
//    public String home(){
//        System.out.print("================请求路径===跳转home页面================"+"\n");
//        return "/bootstrap";
//    }

    @RequestMapping("/file")
    @ResponseBody
    public String file(){
        System.out.print("================请求路径===跳转file页面================"+"\n");
        return "/file";
    }

}
