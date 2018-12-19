package com.basic.java;

import java.util.List;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/19.
 */
public class PasswordUtils {
    @UseCase(id=47, description = "Paswrods must contain at least once")
    public boolean validatePassowrd(String password){
        return password.matches("\\w*\\d\\w*");
    }

    @UseCase(id = 48)
    public String encryptPassowrd(String password){
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id = 49,description = "New passwrods can't equal previously used ones")
    public boolean checkForNewPassowrd(List<String> prevPasswords, String password){
        return prevPasswords.contains(password);
    }
}
