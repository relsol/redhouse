package com.redhouse.user;

import com.redhouse.RedhouseApplicationTests;
import com.redhouse.entity.User;
import com.redhouse.service.UserService;
import com.redhouse.util.JsonUtil;
import net.minidev.json.JSONUtil;
import org.junit.Test;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * Created by RelSol.Chen on 2016/9/9.
 */
public class UserServiceTest extends RedhouseApplicationTests {

    @Resource
    private UserService userService;

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

//    @Test
//    public void test(){
//        List<User> userList = this.userService.getUserList();
//        System.out.println(userList.size());
//    }

    @Test
    public void putDataRedisTest(){
        try {
            List<User> userList = this.userService.getUserList();
            String userJson = JsonUtil.obj2Json(userList);

            HashOperations<String, String, Object> hashOperations = this.redisTemplate.opsForHash();

            hashOperations.put("redhouse","userList", userJson);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getDataRedisTest(){
        try {
            HashOperations<String, String, Object> hashOperations = this.redisTemplate.opsForHash();

            String userJson = hashOperations.get("redhouse","userList").toString();

            List<User> userList = JsonUtil.str2List(userJson, List.class, User.class);
            System.out.println(userList.size());
            System.out.println(userList.get(0).getName());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
