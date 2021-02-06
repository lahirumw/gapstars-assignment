package com.gapstars.controller;


import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

/**
 * Test Class for User Controller
 * @author lahirua
 *
 */
@MicronautTest
public class UserControllerTest {

    @Inject
    UserController userController;

    @Inject
    @Client("/")
    RxHttpClient client; 

    /**
     * Test method for get user method
     */
    @Test
    public void testGet() {
	
	String result = client.toBlocking().retrieve(HttpRequest.GET("/user"));
	assertEquals("Hello World", result);
    }
}
