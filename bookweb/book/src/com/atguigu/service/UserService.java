package com.atguigu.service;

import com.atguigu.pojo.User;

/**
 * @auther zhaolixin
 * @creat 2021.05.20.17:17
 */
public interface UserService {
    /**
     * 注册用户
     * @param user
     */
    public void registUser(User user);
    /**
     * 登录
     * @param user
     * @return 如果返回null,说明登录失败
     */
    public  User login(User user);
    /**
     * 检查用户名是否可以用
     * @param username
     * @return 返回true 表示用户名已存在
     */
    public boolean existsUsername(String username);




}
