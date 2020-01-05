package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.User;

/**
 * FileName: UserService
 * Author:   SunQ
 * Date:     2020/1/5 9:38
 * TODO: 孙权，他来了
 */
public interface UserService {

    /**
     * 根据用户id获取用户信息
     * @param userId
     * @return
     */
    User getUser(Integer userId);

    /**
     * 根据用户id和score，增加指定用户的积分
     * @param id
     * @param score
     */
    void addScore(Integer id,Integer score);

}
