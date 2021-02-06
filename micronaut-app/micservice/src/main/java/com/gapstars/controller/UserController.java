package com.gapstars.controller;


import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.annotation.Status;

/**
 * User Resourse Controller Class
 * 
 * @author lahirua
 *
 */

@Controller("/user")
public class UserController {
    
    /**
     * HTTP GET Method
     * @return
     */
    @Get 
    @Produces(MediaType.TEXT_PLAIN) 
    @Status(HttpStatus.OK)
    public String getUser() {
        return "Hello World"; 
    }
}
