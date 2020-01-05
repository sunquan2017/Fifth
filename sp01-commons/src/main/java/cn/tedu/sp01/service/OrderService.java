package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.Order;

/**
 * FileName: OrderService
 * Author:   SunQ
 * Date:     2020/1/5 9:38
 * TODO: 孙权，他来了
 */
public interface OrderService {

    /**
     * 根据订单id获取订单信息
     * @param orderId
     * @return
     */
    Order getOrder(String orderId);

    /**
     * 添加订单
     * @param order
     */
    void addOrder(Order order);
}
