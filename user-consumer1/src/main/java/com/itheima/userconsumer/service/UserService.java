package com.itheima.userconsumer.service;

import com.itheima.b2b.commonmodule.model.User;
import com.itheima.userconsumer.hystrix.UserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * @Classname LoginService
 * @Description TODO
 * @Date 2019-9-10 11:29
 * @Created by CrazyStone
 */
@Component
@FeignClient(value = "b2b-user-provider",fallback = UserServiceHystrix.class)
public interface UserService {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public User login(@RequestParam(value = "uname") String uname);

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public  int register(@RequestParam(value = "upassword")String upassword, @RequestParam(value = "uname")String uname, @RequestParam(value = "usex") String usex);
}
