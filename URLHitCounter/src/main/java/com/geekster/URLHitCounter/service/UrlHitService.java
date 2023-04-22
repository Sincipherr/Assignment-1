package com.geekster.URLHitCounter.service;

import com.geekster.URLHitCounter.Repository.UrlHitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlHitService {
    @Autowired
    UrlHitRepo ur;
    public String counturl(String username){
        return ur.count(username);
    }
}
