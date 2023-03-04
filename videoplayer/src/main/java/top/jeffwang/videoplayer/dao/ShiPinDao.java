package top.jeffwang.videoplayer.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import top.jeffwang.videoplayer.domain.ShiPin;

import java.util.List;

@Mapper
@Component
public interface ShiPinDao {

        //插入
        @Insert({"insert into shipins (name,lujing,url) values (#{name},#{lujing},#{url})"})
        public int insertUrl(@Param("name")String name,@Param("lujing")String lujing,@Param("url")String url);

        //查询
        @Select("select * from shipins")
        public List<ShiPin> selectShipin();

        //根据id播放
        @Select("select url from shipins where id = #{id}")
        public String playShipin(@Param("id")int id);


}
