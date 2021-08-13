package com.atguigu.web;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.atguigu.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @auther zhaolixin
 * @creat 2021.06.07.20:30
 */
public class RegistServlet extends HttpServlet {
   private UserService userService=new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username=req.getParameter("username");
        String password=req.getParameter("password");
        String email=req.getParameter("email");
        String code=req.getParameter("code");
        System.out.println(code);
        if("abcde".equalsIgnoreCase(code)){
            if(userService.existsUsername(username)){
                System.out.println("用户名["+username+"]已存在");
                req.getRequestDispatcher("/pages/user/regist.html").forward(req,resp);
            }
            else{
                userService.registUser(new User(null,username,password,email));
                req.getRequestDispatcher("/pages/user/regist_success.html").forward(req,resp);
            }
        }
        else{
            System.out.println("验证码错误");
            req.getRequestDispatcher("/pages/user/regist.html").forward(req,resp);
        }



    }
}
