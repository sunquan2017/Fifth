package cn.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * FileName: User
 * Author:   SunQ
 * Date:     2020/1/5 9:35
 * TODO: 孙权，他来了
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class User {

    private Integer id;
    private String name;
    private String password;
}
