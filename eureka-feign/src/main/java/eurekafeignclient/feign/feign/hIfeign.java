package eurekafeignclient.feign.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@FeignClient(value = "eureka-two")
public interface hIfeign {

    @GetMapping("/hi")
    public String getPort(String hi);
}
