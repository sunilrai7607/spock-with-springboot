package com.kscapser.rest.api.spock.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService{


    @Override
    public String sayHello(String name) {
        return "Hello "+name;
    }
}
