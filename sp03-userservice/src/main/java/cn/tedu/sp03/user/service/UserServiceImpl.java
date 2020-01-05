package cn.tedu.sp03.user.service;

import cn.tedu.sp01.pojo.User;
import cn.tedu.sp01.service.UserService;
import cn.tedu.web.util.JsonUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * FileName: UserServiceImpl
 * Author:   SunQ
 * Date:     2020/1/5 11:34
 * TODO: 孙权，他来了
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Value("${sp.user-service.users}")
    private String  userJson;

    @Override
    public User getUser(Integer userId) {
        log.info("UserService-getUser:"+userId);
        List<User> users = JsonUtil.from(userJson, new TypeReference<List<User>>() {});
        for (User user: users ) {
            if (user.getId().equals(userId)){
                return user;
            }
        }

        return new User(userId,"新建的用户","新建的密码");
    }

    @Override
    public void addScore(Integer id, Integer score) {
        log.info("UserService-addScore::userId:"+id+",score:"+score);
    }
}
