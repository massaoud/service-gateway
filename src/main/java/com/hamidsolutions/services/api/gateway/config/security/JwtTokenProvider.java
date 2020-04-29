package com.hamidsolutions.services.api.gateway.config.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Base64;

@Component
public class JwtTokenProvider {
    @Autowired
    Environment environment;
    private String secretkey;

   @PostConstruct
    protected void init(){
       secretkey = Base64.getEncoder().encodeToString(environment.getProperty("token.secret").getBytes());
   }

}


