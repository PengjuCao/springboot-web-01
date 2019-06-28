package com.cpj.config;

import com.cpj.component.LoginHandlerInterceptor;
import com.cpj.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author PengjuCao
 */
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter{




    @Bean //将组件注册在容器
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/login.html").setViewName("login");
                registry.addViewController("/dashboard.html").setViewName("dashboard");

                }

                //登录注册拦截器
                @Override
                public void addInterceptors(InterceptorRegistry registry) {
                    super.addInterceptors(registry);
                   // System.out.println("我是拦截器！2222222");
                    registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                            .excludePathPatterns("/login.html","/user/login","/","/asserts/**"
                                  ,"/webjars/**"  );

                }
               };
            return adapter;
    }

    //国际化
    @Bean
    public LocaleResolver localeResolver(){

        return new MyLocaleResolver();
    }

}
