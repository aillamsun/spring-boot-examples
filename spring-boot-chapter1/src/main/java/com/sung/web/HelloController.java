package com.sung.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sungang on 2016/8/2.
 */
@RestController
public class HelloController {


    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String index() {
        return "Hello World";
    }
}
