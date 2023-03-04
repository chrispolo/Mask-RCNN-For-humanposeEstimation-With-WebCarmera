package top.jeffwang.videoplayer.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.jeffwang.videoplayer.domain.ShiPin;
import top.jeffwang.videoplayer.service.ShiPinService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class QueryListController {

    @Autowired
    private ShiPinService shiPinService;

    @GetMapping("/page")
    public Object queryList(@RequestParam(value = "page", defaultValue = "1") int page,
                            @RequestParam(value = "size", defaultValue = "10") int size) {
        System.out.print("查询视频" + "\n");
        PageHelper.startPage(page, size);
        List<ShiPin> shipins = shiPinService.selectShipin();
        PageInfo<ShiPin> pageInfo = new PageInfo<>(shipins);
        Map<String, Object> data = new HashMap<>();
        data.put("total_size", pageInfo.getTotal());//总条数
        data.put("total_page", pageInfo.getPages());//总页数
        data.put("current_page", page);//当前页
        data.put("data", pageInfo.getList());//数据

        return data;
    }
}
