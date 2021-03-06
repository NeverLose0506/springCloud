package eureka.riboon.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ThinkE45 on 2018/9/29.
 */
@RestController
public class Controller {
    @Autowired
    LoadBalancerClient loadBalancerClient;
    @GetMapping("/testRibbon")
    public String testRibbon(){
        ServiceInstance serviceInstance=loadBalancerClient.choose("stores");
        return serviceInstance.getHost()+"  "+serviceInstance.getPort();
    }
}
