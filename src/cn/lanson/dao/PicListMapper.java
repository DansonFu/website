package cn.lanson.dao;

import cn.lanson.pojo.PicList;
import cn.lanson.pojo.PicListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PicListMapper {
    int countByExample(PicListExample example);

    int deleteByExample(PicListExample example);

    int deleteByPrimaryKey(Integer picListId);

    int insert(PicList record);

    int insertSelective(PicList record);

    List<PicList> selectByExample(PicListExample example);

    PicList selectByPrimaryKey(Integer picListId);

    int updateByExampleSelective(@Param("record") PicList record, @Param("example") PicListExample example);

    int updateByExample(@Param("record") PicList record, @Param("example") PicListExample example);

    int updateByPrimaryKeySelective(PicList record);

    int updateByPrimaryKey(PicList record);
}