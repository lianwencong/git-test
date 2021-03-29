package com.greate.community;

import com.greate.community.entity.User;
import com.greate.community.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommunityApplicationTests {

    //这里之前发生过错误，如果不使用@Autowired注解，使用new的方式就会出错
    //再userSerice中会报userMapper为空的错误
    @Autowired
    UserService userService;

    @Test
    void contextLoads() {

        User user = userService.findUserById(101);
        System.out.println(user);
    }

}
