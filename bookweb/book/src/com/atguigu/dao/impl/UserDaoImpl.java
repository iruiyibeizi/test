package com.atguigu.dao.impl;

import com.atguigu.dao.BasoDao;
import com.atguigu.dao.UserDao;
import com.atguigu.pojo.User;

/**
 * @auther zhaolixin
 * @creat 2021.05.20.16:43
 */


public class UserDaoImpl extends BasoDao implements UserDao {

    @Override
    public User queryUserByUsername(String username) {
        String sql="select id,username,password,email from t_user where username=?";
        return queryForone(User.class,sql,username);


    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) {
        String sql="select id,username,password,email from t_user where username=? and password=?";
        return queryForone(User.class,sql,username,password);
    }

    @Override
    public int SaveUser(User user) {
        String sql="insert into t_user(username,password,email) values(?,?,?)";
        return update(sql,user.getUsername(),user.getUsername(),user.getEmail());
    }
}
