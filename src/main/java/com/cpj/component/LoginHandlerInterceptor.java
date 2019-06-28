package com.cpj.component;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author PengjuCao
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    //目标方法执行之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {


        Object loginUser = request.getSession().getAttribute("LoginUser");
        if(loginUser == null){
            //未登录，
            request.setAttribute("msg","请先登录");
            System.out.println("我是拦截器！1111");
            request.getRequestDispatcher("/login.html").forward(request,response);
            return false;
        }else{
            //已经登录
            return true;
        }




    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

}
