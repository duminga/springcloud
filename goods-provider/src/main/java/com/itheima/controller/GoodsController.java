package com.itheima.controller;


import com.itheima.b2b.commonmodule.model.Goods;
import com.itheima.dao.GoodsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class GoodsController {
    @Autowired
    GoodsDao goodsDao;
    @RequestMapping(value = "/getAllgoods",method = RequestMethod.GET)
    public List<Goods> getAllgoods(){
        return goodsDao.getAllgoods();
    };
    @RequestMapping(value = "/getOnegoods",method = RequestMethod.GET)
    public List<Goods> getOnegoods(@RequestParam(value = "gname")String gname){
        return goodsDao.getOnegoods(gname);
    }
    @RequestMapping(value = "/getOnegid",method = RequestMethod.GET)
    public Goods getOnegid(@RequestParam(value = "gid")int gid){
        return goodsDao.getOnegid(gid);
    }
}
