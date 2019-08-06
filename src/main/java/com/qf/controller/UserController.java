package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;
import com.qf.utils.DataView;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping(method = RequestMethod.POST,value = "/user/tologin")
    public DataView<User> login(@RequestParam(name = "wechat") String wechat){
        User user = userService.login(wechat);
        DataView<User> dataView = new DataView<>();
        dataView.setCode(0);
        dataView.setMsg("成功");
        dataView.setData(user);
        return dataView;
    }

}
