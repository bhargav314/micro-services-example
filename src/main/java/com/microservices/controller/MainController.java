package com.microservices.controller;

import com.microservices.core.AllTicketsDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservices.core.WebConstants;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(WebConstants.HOME_URI)
public class MainController {

    private static final Logger log = LoggerFactory.getLogger(MainController.class);

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("getMessage")
    public String getWelcomeMessage()
    {
        log.info("Inside getWelcomeMessage()");
        return "Welcome!!!";
    }

    @GetMapping("getTicketsInfo/{userId}")
    public ResponseEntity<?> getAllTicketsBookedByOneUser(@PathVariable Long userId)
    {
        log.info("Entered getAllTicketsBookedByOneUser()");
        ResponseEntity<?> response = null;
        try {
            AllTicketsDetails tickeDetails =restTemplate.getForObject("http://localhost:8080/fifa-worldcup-tickets-booking-app/getAllTicketsInfo/" + userId, AllTicketsDetails.class);
            response = new ResponseEntity<>(tickeDetails,HttpStatus.OK);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            response = new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return response;
    }
}
