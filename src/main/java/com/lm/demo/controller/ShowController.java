package com.lm.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName ShowController
 * @Description TODO
 * @Author Admin
 * @DATE 2018/12/29 10:39
 **/
@Controller
public class ShowController {

    @GetMapping("/one")
    public String showOne () {
        return "one";
    }

    @GetMapping("/two")
    public String showTwo () {
        return "two";
    }

    @GetMapping("/form")
    public String showForm () {
        return "form";
    }

    @GetMapping("/page")
    public String showPage () {
        return "page";
    }

    @GetMapping("/data")
    public String showData () {
        return "data";
    }
}
