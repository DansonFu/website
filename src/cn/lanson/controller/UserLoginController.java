package cn.lanson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserLoginController {

    @RequestMapping("/")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;

    }

    @RequestMapping("/regist")
    public ModelAndView regist() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("regist");
        return mav;
    }

    @RequestMapping("/regist")
    public ModelAndView registEnd() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }

}
