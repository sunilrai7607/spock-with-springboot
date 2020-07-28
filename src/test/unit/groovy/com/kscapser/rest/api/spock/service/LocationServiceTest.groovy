package com.kscapser.rest.api.spock.service

import com.kscapser.rest.api.spock.client.IlocationClient
import com.kscapser.rest.api.spock.client.mdoel.Codebeautify
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class LocationServiceTest extends Specification {

    ILocationService locationService
    @Autowired IlocationClient ilocationClient
    Codebeautify codebeautify

    def setup() {
        locationService = new LocationService(ilocationClient)
        codebeautify = Mock(Codebeautify)
    }

    def cleanup() {
    }

    def "test getWeatherInfo"() {
        given:
        ilocationClient.getWeatherInfo(*_) >> codebeautify
        when: "Calling weather endpint"
        def response = locationService.getWeatherInfo(city)
        then: "Validate the reponse"
        response != null
        where:
        city | state | countery
        'Bridgeville' | 'PA' | 'USA'

    }
}
