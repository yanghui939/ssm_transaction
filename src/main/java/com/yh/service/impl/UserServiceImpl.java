package com.yh.service.impl;

import com.yh.dao.UserDao;
import com.yh.pojo.User;
import com.yh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public void updateUser() {
        User user1 = userDao.findById(1);
        User user2 = userDao.findById(2);
        user1.setMoney(user1.getMoney() - 100);
        user2.setMoney(user2.getMoney() + 100);
        userDao.updateUser(user1);
        int i = 10/0;
        userDao.updateUser(user2);
    }
}
