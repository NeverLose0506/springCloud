package com.zqbx.client.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod ="error")
    public String getPort(String hi) throws InterruptedException {
        RestTemplate restTemplate=new RestTemplate();
        if(hi==null){
          throw new RuntimeException("dd");
        }
        return  hi+"----"+port;
    }
    @GetMapping("/getUrl")
    public String getUrl(String url, HttpServletRequest request, HttpServletResponse response){
        RestTemplate restTemplate=new RestTemplate();
         response.setCharacterEncoding("utf-8");
        return  restTemplate.getForObject(url,String.class);
    }
    public String error(String hi){
        return "error :服务层错误  --   "+hi;
    }
}
