package com.shanshuan.annotation.model;

import com.shanshuan.annotation.annotation.Int;
import com.shanshuan.annotation.annotation.Validate;

public class User {
    private String name;
    private String pws;
    @Validate(min = 25,max = 130)
    private String age;
    @Validate(isNotNull = true)
    private String isLive;

    public String getName() {
        return name;
    }

    @Int(value = "wangzifeng")
    public void setName(String name) {
        this.name = name;
    }

    public String getPws() {
        return pws;
    }
    @Int(value="love_ruirui")
    public void setPws(String pws) {
        this.pws = pws;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
