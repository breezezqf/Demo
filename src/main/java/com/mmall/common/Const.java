package com.mmall.common;


public class Const {

    public static final String CURRENT_USER = "currentUser";

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    // 普通用户和管理员是一个组, 用枚举显得繁重,可以用内部类
    public interface Role{
        int ROLE_CUSTOMER = 0;//普通用户
        int ROLE_ADMIN = 1; //管理员
    }
}
