package com.geekster.URLHitCounter.Repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class UrlHitRepo {
    static HashMap<String,Integer>freq=new  HashMap<>();
    public String count(String username){
        if(username!=null){
            freq.put(username,freq.getOrDefault(username,0)+1);
        }
        return "Username : " + username + "  count : " + freq.get(username);
    }
}

