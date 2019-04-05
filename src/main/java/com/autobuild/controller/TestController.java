package com.autobuild.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  * @author cc
 * Created by cc on 2019/04/04
 */
@RestController
public class TestController {
    @GetMapping
    public String out(){
        return "hello jenkins";
    }

}
