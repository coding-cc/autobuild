package com.autobuild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *  * @author cc
 * Created by cc on 2019/04/04
 */
@Controller
public class TestController {
    @GetMapping
    public String out(){
        return "hello jenkins";
    }
}
