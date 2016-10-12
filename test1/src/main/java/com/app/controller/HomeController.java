package com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dev-camiloh on 10/11/16.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello World";
    }

}
