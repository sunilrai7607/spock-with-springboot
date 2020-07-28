package com.kscapser.rest.api.spock.service

import spock.lang.Specification


class HelloServiceSpec extends Specification {

    IHelloService helloService

    def setup() {
        helloService = new HelloService();
    }

    def "calling sayHello "() {
        expect: "sayHello works"
        helloService.sayHello("Sunil") != null
    }
}