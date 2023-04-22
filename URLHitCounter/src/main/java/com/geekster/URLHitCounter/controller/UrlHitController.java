package com.geekster.URLHitCounter.controller;

import com.geekster.URLHitCounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {
    @Autowired
    UrlHitService us;

    @GetMapping(value = "/urlcount/{username}")
    public String counturl(@PathVariable String username){
        return us.counturl(username);
    }
}
