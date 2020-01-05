package cn.tedu.sp03.user.controller;

import cn.tedu.sp01.pojo.User;
import cn.tedu.sp01.service.UserService;
import cn.tedu.web.util.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: UserController
 * Author:   SunQ
 * Date:     2020/1/5 11:40
 * TODO: 孙权，他来了
 */
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public JsonResult<User> getUser(@PathVariable Integer userId){
        User user = userService.getUser(userId);
        return JsonResult.ok().data(user);
    }

    @GetMapping("/{userId}/score")
    public JsonResult addScore(@PathVariable Integer userId,@RequestParam Integer score){
        userService.addScore(userId,score);
        return JsonResult.ok();
    }

}
