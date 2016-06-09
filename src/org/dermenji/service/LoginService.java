package org.dermenji.service;


import org.dermenji.dto.User;

import java.util.HashMap;

/**
 * Created by fns02 on 6/6/2016.
 */
public class LoginService {

    HashMap<String, String> users = new HashMap<String, String>();


    public LoginService() {
        users.put("qq", "test");
    }

    public boolean authenticate(String userId, String password){
        String test = password.trim();
        if (password == null  ||  password.trim() == ""){
            return  false;
        }
        return  true;
    }

    public User getUserDetails(String userId){
        User user = new User();
        user.setUserName(users.get(userId));
        user.setUserId(userId);
        return user;
    }
}
