package com.kscapser.rest.api.spock.controller;

import com.kscapser.rest.api.spock.service.IHelloService;
import com.kscapser.rest.api.spock.service.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/api/v1/services", produces = MediaType.APPLICATION_JSON_VALUE)
public class HelloController {

    private final IHelloService helloService;
    private final ILocationService locationService;

    @Autowired
    public HelloController(IHelloService helloService, ILocationService locationService) {
        this.helloService = helloService;
        this.locationService = locationService;
    }

    @RequestMapping("/hello/{id}")
    public ResponseEntity<String> sayHello(@PathVariable("id") String id) {
        return ResponseEntity.ok(helloService.sayHello(id));
    }

    @RequestMapping("/location/{city}")
    public ResponseEntity<Object> locationWeather(@PathVariable("city") String city) {
        return ResponseEntity.ok(locationService.getWeatherInfo(city));
    }
}
