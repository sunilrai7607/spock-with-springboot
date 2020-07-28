package com.kscapser.rest.api.spock

import com.kscapser.rest.api.spock.SpockApplication
import org.apache.catalina.core.ApplicationContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(classes = SpockApplication.class)
class ApplicationSpecification extends Specification {

    @Autowired
    ApplicationContext context

//    def "it should boot application Successfully"() {
//        expect: "application context exists"
//        context != null
//    }

}
