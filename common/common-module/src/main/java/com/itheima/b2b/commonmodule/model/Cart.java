package com.itheima.b2b.commonmodule.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Cart
 * @Description TODO
 * @Date 2019-10-11 18:28
 * @Created by CrazyStone
 */
public class Cart {
    private Integer id;
    private String goodsname;
    private Integer number;
    private Integer price;
    private Integer goodid;
    private Integer uid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    private List<Goods> goodsList = new ArrayList<>();


    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getPrice() {

        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", goodsname='" + goodsname + '\'' +
                ", number=" + number +
                ", price=" + price +
                '}';
    }
}
