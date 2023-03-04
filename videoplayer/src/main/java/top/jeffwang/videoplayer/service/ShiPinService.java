package top.jeffwang.videoplayer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import top.jeffwang.videoplayer.dao.ShiPinDao;
import top.jeffwang.videoplayer.domain.ShiPin;

import java.util.List;

@Service
@Component
public class ShiPinService {
    @Autowired
    private ShiPinDao shiPinDao;

    //插入
    public int insertUrl(String name,String lujing,String url){
        System.out.print("开始插入=name=="+name+"\n");
        System.out.print("开始插入=lujing=="+lujing+"\n");
        System.out.print("开始插入=url=="+url+"\n");
        int jieguo=shiPinDao.insertUrl(name,lujing,url);
        System.out.print("插入结果==="+jieguo+"\n");
        return jieguo;
    }
    //查询
    public List<ShiPin> selectShipin(){
        List<ShiPin> shipins=shiPinDao.selectShipin();
        return  shipins;
    }

    //根据id播放
    public String playShipin(int id){
        System.out.println("开始播放=id=="+id);
        String url = shiPinDao.playShipin(id);
        System.out.println("视频url=="+url);
        return url;
    }
}
