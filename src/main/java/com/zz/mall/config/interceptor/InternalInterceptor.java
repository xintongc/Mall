package com.zz.mall.config.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class InternalInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        //do something there
        request.getHeader("//");
        request.getParameterMap();
        request.getMethod();
        request.setAttribute("1","2");//对request进行加工

        //1 获取令牌
        String token=request.getHeader("X-Token-xxx");//必须以X-开头 后面全部自定义
        //2. 换取用户
        // User user= AuthService.findUserByToken(token)
        //3  ThreadLocal 放入user
        return true;
    }
}
