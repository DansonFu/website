package cn.lanson.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.lanson.service.pictureService;

@Controller
@Scope(value = "prototype")
@RequestMapping("/picture")
public class pictureController {

    @Resource
    private pictureService pictureService;

    @RequestMapping(value = "/main", method = { RequestMethod.GET })
    public ModelAndView main(HttpServletRequest request, HttpSession session, HttpServletResponse response) {

        ModelAndView mav = new ModelAndView("/main");
        return mav;
    }
}
