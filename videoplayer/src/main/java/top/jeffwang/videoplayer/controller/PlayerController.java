package top.jeffwang.videoplayer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.jeffwang.videoplayer.service.ShiPinService;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class PlayerController {
    @Autowired
    private ShiPinService shiPinService;

    @GetMapping("/play")
    public Object playById(@RequestParam(value = "id") int id){
        System.out.println("播放视频");
        String url = shiPinService.playShipin(id);
        Map<String, String> data = new HashMap<>();
        data.put("url", url);
        return data;
    }
}
