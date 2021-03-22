package org.sang;

/*
import org.springframework.web.servlet.mvc.Controller;
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;

public class MyController implements Controller {
     /*
     *这就是一个请求处理接口
     *@param req这就是前端发送来的请求
     *@param resp这就是服务端给前端的响应
     *@return 返回值是一个ModelAndView,Model 相当于是我们的数据模型,view是我们的视图
     *@throws  Exception
     */
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        ModelAndView mv = new ModelAndView( "hello");mv.addObject( "name","skiboy" );
        return mv;
    }

    public String value() {
        return null;
    }

    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
