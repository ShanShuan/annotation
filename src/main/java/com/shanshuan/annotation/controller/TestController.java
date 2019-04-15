package com.shanshuan.annotation.controller;

import com.shanshuan.annotation.factory.UserFactory;
import com.shanshuan.annotation.model.User;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/my")
public class TestController {

    @RequestMapping( value ="test")
    public String test(){
        User user=new User();
        User one=UserFactory.create();
        String  hh=JSONObject.fromObject(user).toString();
        String  xx=JSONObject.fromObject(one).toString();
        return xx;
    }
}
