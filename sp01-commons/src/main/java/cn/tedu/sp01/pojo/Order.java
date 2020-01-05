package cn.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * FileName: Order
 * Author:   SunQ
 * Date:     2020/1/5 9:34
 * TODO: 孙权，他来了
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Order {

    private String id;
    private User user;
    private List<Item> items;
}
