package com.lxq18.learn.yml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;

@Component
public class Test {
    @Autowired
    private MyProps myProps;

    @Autowired
    @Qualifier("map1")
    private Map<String, String> map1;

    @Autowired
    @Qualifier("map2")
    private Map<Integer, Integer> map2;

    @PostConstruct
    public void init() {
        System.out.println(myProps);
        System.out.println(map1);
        System.out.println(map2);
    }
}
