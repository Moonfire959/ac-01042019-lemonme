package it.nextre.academy.lemonme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("/")
    //@GetMapping({"/","/index","/home"})
    public String getHome(){
        return "index.html";
    }

    //esempio redirect
    @GetMapping({"/index","/home"})
    public static String redirectHome(){
        return "redirect:/";
    }
}