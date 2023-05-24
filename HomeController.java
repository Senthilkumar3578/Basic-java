package com.example.Logger.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Homepage")
public class HomeController {

    Logger log= LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/message")
    public String mess(){
        log.info("info message");
        log.warn("warnig message");
        log.error("Error message");
        log.debug("Debug message");
        return "open console check log messages";
    }
}
