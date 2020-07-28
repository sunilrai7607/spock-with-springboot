package com.kscapser.rest.api.spock.service;

public interface ILocationService {

    /**
     * Method to get the weather information of a city
     *
     * @param city
     * @return
     */
    Object getWeatherInfo(final String city);
}
