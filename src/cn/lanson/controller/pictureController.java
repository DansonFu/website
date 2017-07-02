package cn.lanson.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.lanson.pojo.Picture;
import cn.lanson.service.pictureService;

@Controller
@Scope(value = "prototype")
@RequestMapping("/picture")
public class pictureController {

    @Resource
    private pictureService pictureService;

    /**
     * 主页，获取所有数据
     * @param request
     * @param session
     * @param response
     * @return
     */
    @RequestMapping(value = "/main", method = { RequestMethod.GET })
    public ModelAndView main(HttpServletRequest request, HttpSession session, HttpServletResponse response) {
    	//获取所有数据
    	List<Picture> findAll = pictureService.findAll();
        ModelAndView mav = new ModelAndView("/main");
//        mav.addObject("findAll", findAll);
        return mav;
    }
    @RequestMapping(value="/add",method={RequestMethod.GET})
    public ModelAndView add(){
    	 ModelAndView mav = new ModelAndView("/add");
         return mav;
    }
    
    @RequestMapping(value="/addPic",method={RequestMethod.POST})
    public void addPic(HttpServletRequest request){
    	request.getParameter("");
    	request.getParameter("");
    	request.getParameter("");
    	request.getParameter("");
    	request.getParameter("");
    	Picture picture=new Picture();
    	pictureService.insertPic(picture);
    }
    @RequestMapping(value="/edit",method={RequestMethod.POST})
    public ModelAndView edit(){
    	 ModelAndView mav = new ModelAndView("/edit");
         return mav;
    }
    
    @RequestMapping(value="/editPic",method={RequestMethod.POST})
    public void editPic(HttpServletRequest request){
    	request.getParameter("");
    	request.getParameter("");
    	request.getParameter("");
    	request.getParameter("");
    	request.getParameter("");
    	Picture picture=new Picture();
    	pictureService.updateById(picture);
    }
    
    @RequestMapping(value="/delete",method={RequestMethod.DELETE})
    public void delete(int id){
    	pictureService.deleteById(id);
    }
    
}
