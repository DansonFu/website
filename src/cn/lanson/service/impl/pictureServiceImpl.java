package cn.lanson.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.lanson.dao.PictureMapper;
import cn.lanson.pojo.Picture;
import cn.lanson.service.pictureService;

@Service("pictureService")
public class pictureServiceImpl implements pictureService {

    @Resource
    private PictureMapper pictureMapper;

    @Override
    public void insertPic(Picture picture) {
        // TODO Auto-generated method stub
        pictureMapper.insert(picture);
    }

    public void updateById(Picture picture) {
        // TODO Auto-generated method stub
        pictureMapper.updateByPrimaryKey(picture);
    }

    @Override
    public void deleteById(int id) {
        // TODO Auto-generated method stub
        pictureMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Picture> findAll() {
        // TODO Auto-generated method stub
        return pictureMapper.findAll();
    }

    @Override
    public Picture findById(int id) {

        return pictureMapper.selectByPrimaryKey(id);
    }

}
