package eureka.zuul.client.config;

import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.client.ClientHttpResponse;

/**
 * Created by ThinkE45 on 2018/10/9.
 */
public class MyFallbackProvider implements ZuulFallbackProvider {
    @Override
    public String getRoute() {
        return null;
    }

    @Override
    public ClientHttpResponse fallbackResponse() {
        return null;
    }
}
