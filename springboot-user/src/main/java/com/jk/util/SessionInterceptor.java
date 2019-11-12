package com.jk.util;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName SessionInterceptor
 * @Description: TODO
 * @Author duanwf
 * @Date 2019/11/5 12:08
 * @Version V1.0
 **/
@Component
public class SessionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler ) throws Exception {
        System.out.println("进入拦截器");
        Object user = request.getSession().getAttribute("user");
        if (user != null) {
            return true;
        }
        response.sendRedirect(request.getContextPath() + "/toLogin");
        return false;
    }
}
