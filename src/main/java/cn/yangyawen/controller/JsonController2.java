package cn.yangyawen.controller;

import cn.yangyawen.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * 用 @RestController 就不需要加 @ResponseBody 了
 * @RestController 控制器中所有的处理方法都会以 json 的形式返回
 * 相当于所有的处理方法都加上了 @ResponseBody
 */
@RestController
public class JsonController2 {

    @RequestMapping("/json2/response")
    // @ResponseBody
    public List<User> responseJson() {
        User user1 = new User(1, "杨啊啊");
        User user2 = new User(2, "yangyawen");
        List<User> list = Arrays.asList(user1, user2);
        return list;
    }
}
