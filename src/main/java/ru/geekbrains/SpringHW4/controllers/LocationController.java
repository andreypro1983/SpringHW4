package ru.geekbrains.SpringHW4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/location")
public class LocationController {
    @GetMapping()
    public String info(){
        return "location.html";
    }
}
