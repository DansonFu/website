package cn.lanson.service;

import java.util.List;

import cn.lanson.pojo.Picture;

/**
 * 业务层
 *
 * @author Danson
 * @time 2017年6月29日上午11:02:31
 *
 */
public interface pictureService {

    /**
     * 保存图片方法
     * 
     * @author Danson
     * @time 2017年6月29日上午11:11:18
     * @param picture
     */
    public void insertPic(Picture picture);

    /**
     * 根据id修改图片
     * 
     * @author Danson
     * @time 2017年6月29日上午11:08:56
     */
    public void updateById(Picture picture);

    /**
     * 根据id删除图片
     * 
     * @author Danson
     * @time 2017年6月29日上午11:09:42
     */
    public void deleteById(int id);

    /**
     * 查询所有的图片
     * 
     * @author Danson
     * @time 2017年6月29日上午11:11:37
     * @return
     */
    public List<Picture> findAll();

    /**
     * 根据id查询一张图片
     * 
     * @author Danson
     * @time 2017年6月29日上午11:11:42
     * @param id
     * @return
     */
    public Picture findById(int id);

}
