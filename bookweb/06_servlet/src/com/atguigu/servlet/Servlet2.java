package com.atguigu.servlet; /**
 * @auther zhaolixin
 * @creat 2021.05.15.15:28
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        System.out.println("在Servlet2中查看参数："+username);
        Object key1 = request.getAttribute("key1");
        System.out.println("柜台一是否有章："+key1);
        System.out.println("Servlet2自己的业务");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
