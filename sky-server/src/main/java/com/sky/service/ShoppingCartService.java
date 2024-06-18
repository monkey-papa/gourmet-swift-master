package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;

import java.util.List;

/**
 * @Author liming
 * @Date 2023/11/10 22:24
 * @Description
 **/
public interface ShoppingCartService {
    /**
     * 添加购物车
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);

    /**
     * 查看购物车
     * @return
     */
    List<ShoppingCart> showShoppingCart();

    /**
     * 根据指定商品和数量减少购物车中的商品数量。
     * @param shoppingCartDTO 购物车数据传输对象
     * @return 减少是否成功
     */
//    boolean reduceShoppingCart(ShoppingCartDTO shoppingCartDTO);
    /**
     * 减少购物车中商品的数量。
     * @param shoppingCartDTO 购物车数据传输对象
     * @return 减少操作是否成功
     */
    boolean reduceShoppingCart(ShoppingCartDTO shoppingCartDTO);

    /**
     * 清空购物车
     */
    void cleanShoppingCart();
}
