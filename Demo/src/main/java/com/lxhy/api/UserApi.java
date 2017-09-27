package com.lxhy.api;

import com.lxhy.pojo.User;
import com.lxhy.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Created by jerry on 2017/9/13.
 */
@Component
@Path("user")
public class UserApi {

    @Autowired
    private UserService service;

    @GET
    @Path("getPwd")
    public String getUserPass(@QueryParam("userName")String userName){
        User user = service.getUserByUsername(userName);
        return user.getPassword();
    }
}
