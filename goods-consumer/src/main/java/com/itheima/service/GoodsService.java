package com.itheima.service;

/**
 * Created by itcast on 2019/10/31.
 */
import com.itheima.b2b.commonmodule.model.Cart;
import com.itheima.b2b.commonmodule.model.Goods;
import com.itheima.b2b.commonmodule.model.Userorder;
import com.itheima.hystrix.GoodsServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@Component
@FeignClient(value="b2b-goods-provider",fallback =
        GoodsServiceHystrix.class)
public interface GoodsService {
    @RequestMapping(value = "/getAllgoods",method = RequestMethod.GET)
    public List<Goods> getAllgoods();
    @RequestMapping(value = "/getOnegoods",method = RequestMethod.GET)
    public List<Goods> getOnegoods(@RequestParam(value = "gname") String
                                           gname);
    @RequestMapping(value = "/getOnegid",method = RequestMethod.GET)
    public Goods getOnegid(@RequestParam(value = "gid") int gid);


    @RequestMapping(value = "/updateCart",method = RequestMethod.GET)
    public int updateCart(@RequestParam(value = "number") int number, @RequestParam(value = "id") int id);
    @RequestMapping(value = "/intcart",method = RequestMethod.GET)
    public int intcart(@RequestParam(value = "goodsname") String goodsname, @RequestParam(value = "number") int number, @RequestParam(value = "price") int price, @RequestParam(value = "goodid") int goodid, @RequestParam(value = "uid") int uid);
    @RequestMapping(value = "/getAllcart",method = RequestMethod.GET)
    public List<Cart> getAllcart(@RequestParam(value = "uid") int uid);

    @RequestMapping(value = "deleteCart" ,method = RequestMethod.GET)
    public int deleteCart(@RequestParam(value = "gid") int gid);
    @RequestMapping(value = "/insertOrder",method = RequestMethod.GET)
    public int insertOrder(@RequestParam(value = "goodsname") String goodsname, @RequestParam(value = "number") int number, @RequestParam(value = "price")int price,@RequestParam(value = "uid")int uid);

    @RequestMapping(value = "/getAllorder")
    public List<Userorder> getAllorder(@RequestParam(value = "uid") int uid);


}

