package com.hjs.loadbalanced;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 轮询算法若要定制，则不能放在@ComponentScan所扫描的包及其子包
 * 否则会被所有的ribbon客户端所共享
 */

@Configuration
public class MyRule {

    @Bean
    public IRule mySelfRule(){
        return new RandomRule();
    }

}
