package com.atguigu.servlet; /**
 * @auther zhaolixin
 * @creat 2021.05.15.14:13
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class HelloServlet3 extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("urI:"+request.getRequestURI());
        System.out.println("url:"+request.getRequestURL());

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
