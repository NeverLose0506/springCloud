package eurekafeignclient.eurekafeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
@ComponentScan(value = "eurekafeignclient")
public class EurekaFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignApplication.class, args);
	}
}
