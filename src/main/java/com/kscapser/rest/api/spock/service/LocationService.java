package com.kscapser.rest.api.spock.service;

import com.kscapser.rest.api.spock.client.IlocationClient;
import com.kscapser.rest.api.spock.client.mdoel.Codebeautify;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LocationService implements ILocationService {


    private final IlocationClient locationClient;

    @Autowired
    public LocationService(IlocationClient locationClient) {
        this.locationClient = locationClient;
    }

    /**
     * Method to get the weather information of a city
     *
     * @param city
     * @return
     */
    @Override
    public Object getWeatherInfo(final String city) {
        //@GetMapping("/weather?q=Bridgeville&appid=3888f75a86e1f7c9b624809b4dfee42b")
        Codebeautify codebeautify = locationClient.getWeatherInfo(city, "3888f75a86e1f7c9b624809b4dfee42b");
        log.info("Weather information : {} ", codebeautify);
        return codebeautify.getWeather();
    }
}
