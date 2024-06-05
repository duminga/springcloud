package com.itheima.controller;

/**
 * Created by itcast on 2019/10/31.
 */
import com.itheima.dao.CartDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class CartController {
    @Autowired
    CartDao cartDao;
    @RequestMapping(value = "/deleteCart",method = RequestMethod.GET)
    public int deleteCart(@RequestParam(value = "gid")int gid){
        return cartDao.deleteCart(gid);
    }
    @RequestMapping(value = "/insertOrder",method = RequestMethod.GET)
    public int insertOrder(@RequestParam(value = "goodsname")String
                                   goodsname, @RequestParam(value = "number")int number,
                           @RequestParam(value = "price")int price,@RequestParam(value =
            "uid")int uid){
        return cartDao.insertOrder(goodsname,number,price,uid);
    }
}
