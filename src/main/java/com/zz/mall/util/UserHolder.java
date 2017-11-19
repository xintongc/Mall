package com.zz.mall.util;

import com.zz.mall.entity.User;

public class UserHolder {

    private static ThreadLocal<User> USER_HOLDER = new ThreadLocal<User>();

    public User getUser() {
        return USER_HOLDER.get();
    }

    public void setUser(User user) {
        USER_HOLDER.set(user);
    }
}
