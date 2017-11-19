package com.zz.mall.config;

import com.zz.mall.config.interceptor.InternalInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

    @Autowired
    private InternalInterceptor internalInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(internalInterceptor).addPathPatterns("/api/internal/**");
        //api/external/user or product的时候 这个拦截器不生效 当且仅当 /api/internal 开头的 才生效
    }
}
