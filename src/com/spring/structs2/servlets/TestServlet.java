package com.spring.structs2.servlets;

import com.spring.structs2.beans.Person;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017-01-17.
 */
public class TestServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse){
        //1.从application域对象中得到IOC容器的引用
        ServletContext servletContext = getServletContext();
        ApplicationContext ctx = (ApplicationContext)servletContext.getAttribute("applicationContext");
        //2.从IOC容器中得到需要的bean
        Person person = ctx.getBean(Person.class);
        person.hello();
    }
}
