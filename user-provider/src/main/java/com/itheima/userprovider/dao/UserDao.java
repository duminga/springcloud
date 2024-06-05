package com.itheima.userprovider.dao;


import com.itheima.b2b.commonmodule.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
     User login(@Param(value = "uname") String uname);//用户登录接口
    int register(@Param(value = "upassword")String upassword,@Param(value = "uname")String uname,@Param(value = "usex") String usex);//用户注册接口
}
//    <?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
//        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
//<mapper namespace="com.itheima.dao.UserDao">
//
//<insert id="register" parameterType="java.lang.String">
//        INSERT INTO USER(upassword,uname,usex) VALUES
//        (#{upassword},#{uname},#{usex})
//</insert>
//<select id="login" resultType="com.itheima.b2b.commonmodule.model.User"
//        parameterType="java.lang.String">
//        select * from user where uname=#{uname}
//</select>
//
//</mapper>