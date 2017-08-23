package cn.lanson.intercptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import cn.lanson.pojo.User;

public class UserLoginInterceptor extends HandlerInterceptorAdapter {

    private static final String[] IGNORE_URL = { "/login.jsp", "/regedit.jsp" };

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean flag = false;
        String url = request.getRequestURL().toString();
        // 不拦截上面定义的路径
        for (String str : IGNORE_URL) {
            if (url.contains(str)) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            User user = (User) request.getSession().getAttribute("users");
            if (user != null) {
                flag = true;
            } else {
                response.sendRedirect("/login.jsp");
            }
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
