package cn.lanson.dao.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import cn.lanson.dao.PictureMapper;
import cn.lanson.pojo.Picture;
import cn.lanson.pojo.PictureExample;
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
        picture.setCreateTime(new Date());
        picture.setImg(record.getImg());
        picture.setQiniu(record.getQiniu());
        picture.setUpdateTime(new Date());
        picture.setStatus(pictureType.getTypeNameByValue("activity"));
        return pictureMapper.insert(picture);
    }

    @Override
    public int insertSelective(Picture record) {
        Picture picture = new Picture();
        picture.setCreateTime(new Date());
        picture.setImg(record.getImg());
        picture.setQiniu(record.getQiniu());
        picture.setUpdateTime(new Date());
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
        if (record.getCreateTime() == null) {
            picture.setCreateTime(new Date());
        } else {

            picture.setCreateTime(record.getCreateTime());
        }
        picture.setImg(record.getImg());
        picture.setQiniu(record.getQiniu());
        if (record.getUpdateTime() == null) {
            picture.setUpdateTime(new Date());
        } else {

            picture.setUpdateTime(record.getUpdateTime());
        }
        picture.setStatus(pictureType.getTypeNameByValue("activity"));
        return pictureMapper.updateByPrimaryKeySelective(picture);
    }

    @Override
    public int updateByPrimaryKey(Picture record) {
        Picture picture = pictureMapper.selectByPrimaryKey(record.getId());
        if (record.getCreateTime() == null) {
            picture.setCreateTime(new Date());
        } else {

            picture.setCreateTime(record.getCreateTime());
        }
        picture.setImg(record.getImg());
        picture.setQiniu(record.getQiniu());
        if (record.getUpdateTime() == null) {
            picture.setUpdateTime(new Date());
        } else {

            picture.setUpdateTime(record.getUpdateTime());
        }
        picture.setStatus(pictureType.getTypeNameByValue("activity"));
        return pictureMapper.updateByPrimaryKey(picture);
    }

    @Override
    public int countByExample(PictureExample example) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int deleteByExample(PictureExample example) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<Picture> selectByExample(PictureExample example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int updateByExampleSelective(Picture record, PictureExample example) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int updateByExample(Picture record, PictureExample example) {
        // TODO Auto-generated method stub
        return 0;
    }

}
