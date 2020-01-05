package cn.tedu.sp02.item.controller;

import cn.tedu.sp01.pojo.Item;
import cn.tedu.sp01.service.ItemService;
import cn.tedu.web.util.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * FileName: ItemController
 * Author:   SunQ
 * Date:     2020/1/5 10:13
 * TODO: 孙权，他来了
 */
@RestController
@Slf4j
public class ItemController {

    @Autowired
    private ItemService  itemService;

    @Value("${server.port}")
    private int port;

    @GetMapping("/{orderId}")
    public JsonResult<List<Item>> getItems(@PathVariable String orderId){
        log.info("item-service-port:"+port+",orderId:"+orderId);
        List<Item> items = itemService.getItems(orderId);
        return JsonResult.ok().data(items).msg("prot:"+port);
    }

    @PostMapping("/decreaseNumber")
    public JsonResult decreaseNumber(@RequestBody List<Item> items){
        itemService.decreaseNumber(items);
        return JsonResult.ok();
    }
}
