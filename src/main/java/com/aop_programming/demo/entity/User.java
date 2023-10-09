package com.aop_programming.demo.entity;

import org.springframework.stereotype.Repository;

@Repository
public class User {
    public String getUserDetails(){
        return "user details";
    }
}
