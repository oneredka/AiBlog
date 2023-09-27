package com.icarus.ai.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;

/**
 * @className: PasswordEncoder
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/9/27
 **/
@Service
public class PasswordEncoder {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;


    public PasswordEncoder(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public String encode(String rawPassword) {
        return bCryptPasswordEncoder.encode(rawPassword);

    }

    public boolean matches(String rawPassword, String encodedPassword) {
        return bCryptPasswordEncoder.matches(rawPassword, encodedPassword);
    }

    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = new PasswordEncoder(new BCryptPasswordEncoder());;
        String pwd = "123456";
        String encodedPassword = passwordEncoder.encode(pwd);
        System.out.println(encodedPassword);
        boolean matches = passwordEncoder.matches(pwd, encodedPassword);
        boolean matches2 = passwordEncoder.matches("pwd", encodedPassword);
        System.out.println(matches);
        System.out.println(matches2);
    }
}
