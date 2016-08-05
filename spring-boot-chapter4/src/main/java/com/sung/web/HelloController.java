package com.sung.web;

import com.sung.exception.MyException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sungang on 2016/8/2.
 */
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello() throws Exception {
        throw new Exception("发生错误");
    }

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }


    @RequestMapping("/")
    public String index(Model map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return "index";
    }
}
