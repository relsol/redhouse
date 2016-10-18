package com.redhouse.service;

import com.redhouse.entity.User;
import com.redhouse.util.JsonUtil;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by RelSol.Chen on 2016/9/8.
 */
@Service
public class UserService {

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @Cacheable(value = "getUserList")
    public List<User> getUserList(){
//        List<User> userList = new ArrayList<>();
//        User user = new User();
//        user.setName("张三");
//        user.setSex("男");
//        user.setBirthday(new Date());
//        userList.add(user);
//
//        user = new User();
//        user.setName("李四");
//        user.setSex("女");
//        userList.add(user);

        HashOperations<String, String, Object> hashOperations = this.redisTemplate.opsForHash();

        String userJson = hashOperations.get("redhouse","userList").toString();

        List<User> userList = null;
        try {
            userList = JsonUtil.str2List(userJson, List.class, User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return userList;
    }
}
