//package com.itheima.userconsumer.controller;
//
//import com.itheima.userconsumer.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//@Controller
//@RequestMapping("/admin")
//public class UserController {
//    @Autowired
//    UserService userService;
//     //跳转登录界面
//    @GetMapping(value = "/tologin")
//    public String tologin() {
//        return "login";
//    }
//     // 跳转注册界面
//    @GetMapping(value = "/toregister")
//    public String toregister() {
//        return "register";
//    }
//     // 用户登录
//    @GetMapping(value = "/login")
//    public String login(String uname, String upassword, HttpServletRequest request) {
//       if (userService.login(uname) != null) {
//            if (userService.login(uname).getUpassword().equals(upassword)){
//                HttpSession session = request.getSession(true);
//                session.setAttribute("user", userService.login(uname));  //将登陆者信息存入session
//              return "redirect:http://localhost:8896/goods/getAll?uaccount="+userService.login(uname).getUaccount()+"&upasswoed="+userService.login(uname).getUpassword();
//            }
//        }
//       // request.setAttribute("mag","账号密码错误");
//        System.out.print("登录成功");
//        return "login";
//    }
//    //用户注册
//    @GetMapping(value = "/register")
//    public String register(HttpServletRequest request,String upassword,String uname,String usex) {
//       if(userService.register(upassword, uname, usex)>0){
//           System.out.print("注册成功");
//           return "login";
//       }
//        System.out.print("注册失败");
//        return "register";
//    }
//}
package com.itheima.userconsumer.controller;

import com.itheima.userconsumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class UserController {

    @Autowired
    private UserService userService;

    // 跳转登录界面
    @GetMapping(value = "/tologin")
    public String tologin() {
        return "login";  // 返回的应该是模板名称，不需要加路径
    }

    // 跳转注册界面
    @GetMapping(value = "/toregister")
    public String toregister() {
        return "register";  // 返回的应该是模板名称，不需要加路径
    }

    // 用户登录
    @GetMapping(value = "/login")
    public String login(String uname, String upassword, HttpServletRequest request) {
        if (userService.login(uname) != null) {
            if (userService.login(uname).getUpassword().equals(upassword)) {
                HttpSession session = request.getSession(true);
                session.setAttribute("user", userService.login(uname));  // 将登录者信息存入session
                return "redirect:http://localhost:8896/goods/getAll?uaccount="
                        + userService.login(uname).getUaccount()
                        + "&upassword="
                        + userService.login(uname).getUpassword();
            }
        }
        // 登录失败处理
        request.setAttribute("msg", "账号或密码错误");
        return "login";
    }

    // 用户注册
    @GetMapping(value = "/register")
    public String register(HttpServletRequest request, String upassword, String uname, String usex) {
        if (userService.register(upassword, uname, usex) > 0) {
            System.out.print("注册成功");
            return "login";  // 注册成功后跳转登录页面
        }
        System.out.print("注册失败");
        return "register";  // 注册失败后返回注册页面
    }
}
