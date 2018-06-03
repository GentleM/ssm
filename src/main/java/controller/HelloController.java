package controller;


import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import services.UserService;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * description。
 *
 * @author rango
 *         2018-05-27 10:33
 **/
@Controller
public class HelloController{

    @Autowired
    @Qualifier("userService")
    public UserService userService;

    @RequestMapping("/hello")
    public String welcome(){
        System.out.println("进入controller！");
        User user = new User();
        user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        user.setUpdateTime(new Date());
        userService.addUser(user);
//        List<User> list = userService.getUserList();
        return "hello";
    }

}
