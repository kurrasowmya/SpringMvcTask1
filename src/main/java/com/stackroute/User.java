package com.stackroute;

import org.springframework.stereotype.Component;

@Component
public class User {
    String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
