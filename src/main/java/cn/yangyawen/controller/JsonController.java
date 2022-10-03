package cn.yangyawen.controller;

import cn.yangyawen.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {

    @RequestMapping("/json/response")
    @ResponseBody
    public User responseJson() {
        User user = new User(1, "杨啊啊");
        return user;
    }
}
