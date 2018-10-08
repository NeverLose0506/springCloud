package eureka.feign.client.controller;

import eureka.feign.client.feign.Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ThinkE45 on 2018/10/8.
 */
@RestController
public class FeignController {
    @Autowired
    Feign feign;

    @GetMapping("/getClientPost")
    public String  getClientPost( String url){
        return feign.getPort(url);
    }
    @GetMapping("/getClientPost1")
    public String  getClientPost1(String url){
        return url;
    }
}
