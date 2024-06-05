package com.itheima.dao;

import com.itheima.b2b.commonmodule.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserDao {
    //用户注册接口
    int register(@Param(value = "upassword")String upassword,
                 @Param(value = "uname")String uname,
                 @Param(value = "usex") String usex);

    User login(@Param(value = "uname") String uname);//用户登录接口;
}
