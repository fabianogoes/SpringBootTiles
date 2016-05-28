package com.eprogramar.springboot.web;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    private Log log = LogFactory.getLog(this.getClass());
    
    @Autowired
    private ApplicationProperties applicationProperties;

    @RequestMapping
    public String get(HttpSession session) {
    	log.info( "get()..." );
    	session.setAttribute("application", applicationProperties);
        return "index";
    }

}
