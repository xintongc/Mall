package com.zz.mall.service.login;

import com.zz.mall.entity.User;
import com.zz.mall.model.LoginBizResult;

public interface ILoginBizService {

    LoginBizResult loginByName(String name, String pwd);

    LoginBizResult exist(String name);

    LoginBizResult register(User user);
}
