package eurekafeignclient.config;

import feign.RetryableException;
import feign.Retryer;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class Bean {
     @org.springframework.context.annotation.Bean
    public Retryer feignRetryer(){
        return  new Retryer.Default();
    }

}
