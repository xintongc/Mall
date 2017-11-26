package com.zz.mall.service.user.impl;

import com.zz.mall.entity.User;
import com.zz.mall.repo.UserRepo;
import com.zz.mall.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User createNewUser(User user) {
        return userRepo.saveAndFlush(user);
    }

    @Override
    public User deleteUser(Integer userId) {
        return null;
    }

    @Override
    public User updateUser(Integer userId, User user) {
        return null;
    }

    @Override
    public User findByPhoneNo(String phoneNo) {
        return null;
    }

    @Override
    public User findByMailAddress(String mailAddress) {
        return null;
    }

    @Override
    public User findByName(String name) {
        return null;
    }
}
