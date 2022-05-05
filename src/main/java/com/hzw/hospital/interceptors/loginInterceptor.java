package com.hzw.hospital.interceptors;

import com.hzw.hospital.bean.Patient;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class loginInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Patient logined_user = (Patient) session.getAttribute("Logined_User");
        if(logined_user == null){
            session.setAttribute("Msg" , "想什么了，滚去登录！");
            response.sendRedirect(request.getContextPath()+"/");
            return false;
        }
        //放行  访问目标资源
        return true;
    }

}
