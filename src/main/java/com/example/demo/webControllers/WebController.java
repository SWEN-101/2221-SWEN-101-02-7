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
        log.debug("WebController.about.()");
        return "about";
    }

    @RequestMapping(value = {"/submitAPost.html"})
    public String submit(){
        log.debug("WebController.submit.()");
        return "submitAPost";
    }

    @RequestMapping(value = {"/viralVideos.html"})
    public String viralVideos(){
        log.debug("WebController.viralVideos.()");
        return "viralVideos";
    }

    @RequestMapping(value = {"/news.html"})
    public String news(){
        log.debug("WebController.news.()");
        return "news";
    }

    @RequestMapping(value = {"/postVideo.html"})
    public String postVideo(){
        log.debug("WebController.postVideo.()");
        return "postVideo";
    }

    @RequestMapping(value = {"/contact.html"})
    public String contact(){
        log.debug("WebController.contact.()");
        return "contact";
    }

    @RequestMapping(value = {"/more_info.html"})
    public String more_info(){
        log.debug("WebController.more_info.()");
        return "more_info";
    }

}

/**
 *
  @RequestMapping(value = {"/.html"})
      public String (){
          log.debug("WebController..()");
          return "";
      }
 */
