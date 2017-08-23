package cn.lanson.dao;

import cn.lanson.pojo.PicConnection;
import cn.lanson.pojo.PicConnectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PicConnectionMapper {
    int countByExample(PicConnectionExample example);

    int deleteByExample(PicConnectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PicConnection record);

    int insertSelective(PicConnection record);

    List<PicConnection> selectByExample(PicConnectionExample example);

    PicConnection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PicConnection record, @Param("example") PicConnectionExample example);

    int updateByExample(@Param("record") PicConnection record, @Param("example") PicConnectionExample example);

    int updateByPrimaryKeySelective(PicConnection record);

    int updateByPrimaryKey(PicConnection record);
}