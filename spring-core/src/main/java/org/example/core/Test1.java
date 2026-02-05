package org.example.core;

import org.springframework.util.DigestUtils;


public class Test1 {
    public static void main(String[] args) {
        String str = "hello";
        String hex = DigestUtils.md5DigestAsHex(str.getBytes());
        System.out.println("Hex formatı: " + hex);
    }
}
