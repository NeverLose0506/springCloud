package eurekafeignclient.feign.controller;

import eurekafeignclient.eurekafeign.EurekaFeignApplication;
import eurekafeignclient.feign.feign.hIfeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HiFeign {
    @Resource
    hIfeign feign;
    @GetMapping("/feign")
    public String sayHi(String name){
        return  feign.getPort(name);
    }
}
