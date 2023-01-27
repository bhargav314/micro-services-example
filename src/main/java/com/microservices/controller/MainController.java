package com.microservices.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservices.core.WebConstants;
@RestController
@RequestMapping(WebConstants.HOME_URI)
public class MainController {

    private static final Logger log = LoggerFactory.getLogger(MainController.class);
    @GetMapping("getMessage")
    public String getWelcomeMessage()
    {
        log.info("Inside getWelcomeMessage()");
        return "Welcome!!!";
    }
}
