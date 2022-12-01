package com.example.demo.webControllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    protected final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = {"/", "/home", "/home.html"})
    public String home() {
        log.debug("WebController.home()");
        return "index";
    }//localhost:8080/home

    @RequestMapping(value = {"/page2"})
    public String page2(){
        log.debug("WebController.page2.()");
        return "page2";
    }//localHost8080/page2

    @RequestMapping(value = {"/about.html"})
    public String about(){
        log.debug("WebController.page2.()");
        return "about";
    }
}
