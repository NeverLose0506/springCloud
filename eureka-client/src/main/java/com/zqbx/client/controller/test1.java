package com.zqbx.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ThinkE45 on 2018/9/29.
 */
@RestController
public class test1 {
    @Value("${server.port}")
    String port;
    @GetMapping("/hi")
    public String getPort(String hi){
        RestTemplate restTemplate=new RestTemplate();

        return  hi+"----"+port;
    }
    @GetMapping("/getUrl")
    public String getUrl(String url, HttpServletRequest request, HttpServletResponse response){
        RestTemplate restTemplate=new RestTemplate();
         response.setCharacterEncoding("utf-8");
        return  restTemplate.getForObject(url,String.class);
    }
}
