package eureka.zuul.client.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by ThinkE45 on 2018/10/9.
 */
@Component
public class MyFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx=RequestContext.getCurrentContext();
        HttpServletRequest request=ctx.getRequest();
        Object acc=request.getParameter("hi");
        if (acc == null) {
        ctx.setSendZuulResponse(false);
        ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("hisfdsf");
            } catch (IOException e) {
                e.printStackTrace();
                return  null;
            }
        }
        return null;
    }
}

