package com.shanshuan.annotation.factory;

import com.shanshuan.annotation.annotation.Int;
import com.shanshuan.annotation.annotation.Validate;
import com.shanshuan.annotation.model.User;
import com.sun.org.apache.xml.internal.security.Init;

import java.lang.reflect.Method;

public class UserFactory {
    public static User create()
    {
        User user = new User();

        // 获取User类中所有的方法（getDeclaredMethods也行）
        Method[] methods = User.class.getMethods();

        try
        {
            for (Method method : methods)
            {
                // 如果此方法有注解，就把注解里面的数据赋值到user对象
                if (method.isAnnotationPresent(Int.class))
                {
                    Int init = method.getAnnotation(Int.class);
                    method.invoke(user, init.value());
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }

        return user;
    }
}
