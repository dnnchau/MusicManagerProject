package com.tma.musicmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainRestController {
	@RequestMapping("/hello")
    @ResponseBody
    public String welcome() {
        return "Welcome to RestTemplate Example.";
    }
}
