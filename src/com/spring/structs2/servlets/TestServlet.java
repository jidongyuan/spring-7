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
        //1.��application������еõ�IOC����������
        ServletContext servletContext = getServletContext();
        ApplicationContext ctx = (ApplicationContext)servletContext.getAttribute("applicationContext");
        //2.��IOC�����еõ���Ҫ��bean
        Person person = ctx.getBean(Person.class);
        person.hello();
    }
}
