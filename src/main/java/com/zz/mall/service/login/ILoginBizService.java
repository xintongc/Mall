package com.zz.mall.service.login;

import com.zz.mall.model.LoginBizResult;

public interface ILoginBizService {

    LoginBizResult loginByName(String name, String pwd);
}
