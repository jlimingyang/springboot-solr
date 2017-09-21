package com.item1024.Config;

/**
 * @author 阳十三
 * @email wdful165177@gmail.com
 * @blog http://www.item1024.com
 * @date 2017/9/21
 */

import com.item1024.Interceptor.Interceptor01;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        // 多个拦截器组成一个拦截器链

        // addPathPatterns 用于添加拦截规则

        // excludePathPatterns 用户排除拦截

        registry.addInterceptor(new Interceptor01()).addPathPatterns("/**");

        super.addInterceptors(registry);

    }


}
