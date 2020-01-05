package cn.tedu.sp04.order.controller;

import cn.tedu.sp01.pojo.Item;
import cn.tedu.sp01.pojo.Order;
import cn.tedu.sp01.pojo.User;
import cn.tedu.sp01.service.OrderService;
import cn.tedu.web.util.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * FileName: OrderController
 * Author:   SunQ
 * Date:     2020/1/5 10:54
 * TODO: 孙权，他来了
 */
@RestController
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{orderId}")
    public JsonResult<Order> getOrder(@PathVariable String orderId){
        log.info("order-service-getOrder:"+orderId);

        Order order = orderService.getOrder(orderId);
        return JsonResult.ok(order);
    }

    @GetMapping("/")
    public JsonResult addOrder(){
        //模拟Post提交的数据
        Order order = new Order();
        order.setId("123abc").setUser(new User(7,"李思思","123456asd"))
                .setItems(Arrays.asList(new Item[] {
                                        new Item(1,"aaa",2),
                                        new Item(2,"bbb",1),
                                        new Item(3,"ccc",3),
                                        new Item(4,"ddd",1),
                                        new Item(5,"eee",5),
                        }));
        orderService.addOrder(order);
        return JsonResult.ok();

    }

}
