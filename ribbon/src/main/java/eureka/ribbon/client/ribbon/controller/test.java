package eureka.ribbon.client.ribbon.controller;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ThinkE45 on 2018/9/29.
 */
@RestController
public class test {
    @Resource
    RestTemplate restTemplate;
    @Autowired
    LoadBalancerClient loadBalancerClient;
    @GetMapping("/getEureka")
    public String getUrl(String url){

        return  restTemplate.getForObject("http://eureka-two/hi?hi=sdf",String.class);
    }

    @GetMapping("/testRibbon")
    public String testRibbon(){
        ServiceInstance serviceInstance=loadBalancerClient.choose("eureka-two");
        return serviceInstance.getHost()+"  "+serviceInstance.getPort();
    }
}
