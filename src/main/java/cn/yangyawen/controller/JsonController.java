package cn.yangyawen.controller;

import cn.yangyawen.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class JsonController {

    @RequestMapping("/json/response")
    @ResponseBody
    public User responseJson() {
        User user = new User(1, "杨啊啊");
        user.setPwd("123456");
        user.setBirthday(new Date());
        System.out.println(user);
        return user;
    }

    /**
     * consumes = "application/json" 接收到的数据必须是json
     */
    @PostMapping(value = "/json/request01", consumes = "application/json")
    @ResponseBody
    public User requestJson01(@RequestBody String name) {
        System.out.println(name);
        return new User(1, "杨啊啊");
    }

    @PostMapping(value = "/json/request02", consumes = "application/json")
    @ResponseBody
    public User requestJson02(@RequestBody User user) {
        System.out.println(user);
        return new User(3, "yang");
    }
}
