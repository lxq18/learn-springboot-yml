package com.lxq18.learn.yml;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class AllBeans {
    @Bean
    @ConfigurationProperties(prefix = "ps")
    public MyProps ps() {
        return new MyProps();
    }

    @Bean
    @ConfigurationProperties(prefix = "ps.map1")
    public Map<String, String> map1() {
        return new HashMap();
    }

    @Bean
    @ConfigurationProperties(prefix = "ps.map2")
    public Map<Integer, Integer> map2() {
        return new HashMap();
    }

    @Bean
    @ConditionalOnBean(name = "ps")
    public String ss() {
        return "ss";
    }
}
