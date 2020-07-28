package com.kscapser.rest.api.spock.client;

import com.kscapser.rest.api.spock.client.mdoel.Codebeautify;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "LocationClient", url = "http://api.openweathermap.org/data/2.5")
public interface IlocationClient {

    @RequestMapping(method = RequestMethod.GET, value = "/weather?q={city}&appid={appId}")
    Codebeautify getWeatherInfo(@RequestParam(value = "city") final String city, @RequestParam(value = "appid") String appId);
}
