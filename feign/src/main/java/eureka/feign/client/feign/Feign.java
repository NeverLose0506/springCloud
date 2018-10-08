package eureka.feign.client.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ThinkE45 on 2018/10/8.
 */
@FeignClient(value ="eureka-two" )
public interface Feign {
 //   @GetMapping("/hi")

    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    public String getPort(@RequestParam("hi") String hi);
}
