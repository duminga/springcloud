package com.itheima.dao;

/**
 * Created by itcast on 2019/10/31.
 */
import com.itheima.b2b.commonmodule.model.Cart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
@Mapper
public interface CartDao {
    //根据ID删除订单
    int deleteCart(@Param(value = "gid") int gid);
    //购买商品后添加一条订单数据
    int insertOrder(@Param(value = "goodsname")String goodsname,@Param(value
            ="number")int number,@Param(value = "price")int price,@Param(value
            = "uid")int uid);
}
