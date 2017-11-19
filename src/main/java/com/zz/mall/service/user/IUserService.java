package com.zz.mall.service.user;

import com.zz.mall.entity.User;

public interface IUserService {

    /*
    base CURD
     */

    User createNewUser(User user);
    User deleteUser(Integer userId);
    //  POST /mall/user/{userId} userBody
    //  POST /mall/user userBody ?是new 还是 update
    User updateUser(Integer userId,User user);

    /*
    for login
     */

    User findByPhoneNo(String phoneNo);
    User findByMailAddress(String mailAddress);
    User findByName(String name);
}
