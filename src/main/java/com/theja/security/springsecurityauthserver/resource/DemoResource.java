package com.theja.security.springsecurityauthserver.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/api")
public class DemoResource {

    @RequestMapping( value = "/hello",method = RequestMethod.GET)
    public String hello()
    {
        return "Hello World";
    }
}


