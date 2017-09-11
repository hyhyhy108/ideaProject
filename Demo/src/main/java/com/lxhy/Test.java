package com.lxhy;
import com.lxhy.user.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import com.lxhy.pojo.User;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class Test {
    @Autowired
    private UserService userService;

    @org.junit.Test
    public void test1() {
        User user = userService.getUserByUsername("ggg");

        System.out.println(user.getUsername());

        System.out.println(user.getPassword());

    }

}