package com.itheima.configuration;

/**
 * Created by itcast on 2019/10/31.
 */
import com.itheima.filter.SysInterceptor;
import org.springframework.context.annotation.Configuration;
import
        org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.
        annotation.WebMvcConfigurerAdapter;
@Configuration
//将拦截器添加到SpringBoot配置中
public class SessionConfiguration extends WebMvcConfigurerAdapter{
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new
                SysInterceptor()).addPathPatterns("/goods/cart");
    }
}
