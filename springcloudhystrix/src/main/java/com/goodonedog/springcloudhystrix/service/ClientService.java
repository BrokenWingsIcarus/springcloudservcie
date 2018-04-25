package com.goodonedog.springcloudhystrix.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Administrator
 */
@FeignClient(name="compute-service",fallback = FallbackComputeSerivceImpl.class)
public interface ClientService {
    /**
     * 通过feign 我们可以远程调用 compute-service的方法 注意 请求方式的不同不一样的注解配置
     * @param a
     * @param b
     * @return
     */
    @RequestMapping("/add")
    public Integer consumer(@RequestParam("a")Integer a , @RequestParam("b") Integer b);
}
