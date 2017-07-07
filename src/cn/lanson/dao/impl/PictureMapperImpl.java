package cn.lanson.dao.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import cn.lanson.dao.PictureMapper;
import cn.lanson.pojo.Picture;
import cn.lanson.utils.pictureType;

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

        Picture picture = new Picture();
        picture.setCreatetime(new Date());
        picture.setName(record.getName());
        picture.setPicurl(record.getPicurl());
        picture.setQiniukey(record.getQiniukey());
        picture.setUpdatetime(new Date());
        picture.setStatus(pictureType.getTypeNameByValue("activity"));
        return pictureMapper.insert(picture);
    }

    @Override
    public int insertSelective(Picture record) {
        Picture picture = new Picture();
        picture.setCreatetime(new Date());
        picture.setName(record.getName());
        picture.setPicurl(record.getPicurl());
        picture.setQiniukey(record.getQiniukey());
        picture.setUpdatetime(new Date());
        picture.setStatus(pictureType.getTypeNameByValue("activity"));
        return pictureMapper.insertSelective(picture);
    }

    @Override
    public Picture selectByPrimaryKey(Integer id) {
        // TODO Auto-generated method stub
        return pictureMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Picture record) {
        Picture picture = pictureMapper.selectByPrimaryKey(record.getId());
        if (record.getCreatetime() == null) {
            picture.setCreatetime(new Date());
        } else {

            picture.setCreatetime(record.getCreatetime());
        }
        picture.setName(record.getName());
        picture.setPicurl(record.getPicurl());
        picture.setQiniukey(record.getQiniukey());
        if (record.getUpdatetime() == null) {
            picture.setUpdatetime(new Date());
        } else {

            picture.setUpdatetime(record.getUpdatetime());
        }
        picture.setStatus(pictureType.getTypeNameByValue("activity"));
        return pictureMapper.updateByPrimaryKeySelective(picture);
    }

    @Override
    public int updateByPrimaryKey(Picture record) {
        Picture picture = pictureMapper.selectByPrimaryKey(record.getId());
        if (record.getCreatetime() == null) {
            picture.setCreatetime(new Date());
        } else {

            picture.setCreatetime(record.getCreatetime());
        }
        picture.setName(record.getName());
        picture.setPicurl(record.getPicurl());
        picture.setQiniukey(record.getQiniukey());
        if (record.getUpdatetime() == null) {
            picture.setUpdatetime(new Date());
        } else {

            picture.setUpdatetime(record.getUpdatetime());
        }
        picture.setStatus(pictureType.getTypeNameByValue("activity"));
        return pictureMapper.updateByPrimaryKey(picture);
    }

    @Override
    public List<Picture> findAll() {
        // TODO Auto-generated method stub
        return pictureMapper.findAll();
    }

}
