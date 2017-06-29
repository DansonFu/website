package cn.lanson.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import cn.lanson.dao.PictureMapper;
import cn.lanson.pojo.Picture;

@Repository("PictureMapper")
public class PictureMapperImpl implements PictureMapper {

    @Resource(name = "PictureMapper")
    private PictureMapper pictureMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        // TODO Auto-generated method stub
        return pictureMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Picture record) {
        // TODO Auto-generated method stub
        return pictureMapper.insert(record);
    }

    @Override
    public int insertSelective(Picture record) {
        // TODO Auto-generated method stub
        return pictureMapper.insertSelective(record);
    }

    @Override
    public Picture selectByPrimaryKey(Integer id) {
        // TODO Auto-generated method stub
        return pictureMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Picture record) {
        // TODO Auto-generated method stub
        return pictureMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Picture record) {
        // TODO Auto-generated method stub
        return pictureMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Picture> findAll() {
        // TODO Auto-generated method stub
        return pictureMapper.findAll();
    }

}
