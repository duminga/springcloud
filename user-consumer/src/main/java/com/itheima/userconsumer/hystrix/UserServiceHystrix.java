package com.itheima.userconsumer.hystrix;


import com.itheima.b2b.commonmodule.model.User;
        import com.itheima.userconsumer.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceHystrix implements UserService {
    @Override
    public User login(String uaccount) {
        return null;
    }

    @Override
    public int register(String upassword, String uname, String usex) {
        return 0;
    }
}
