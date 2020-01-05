package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.Item;

import java.util.List;

/**
 * FileName: ItemService
 * Author:   SunQ
 * Date:     2020/1/5 9:38
 * TODO: 孙权，他来了
 */
public interface ItemService {

    /**
     * 通过订单id获取订单中的商品列表
     * @param orderId
     * @return
     */
    List<Item> getItems(String orderId);

    /**
     * 根据商品列表，减少库存
     * @param items
     */
    void decreaseNumber(List<Item> items);
}
