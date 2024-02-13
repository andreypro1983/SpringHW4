package ru.geekbrains.SpringHW4.controllers;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Log
@RequestMapping("/location")
public class LocationController {
    //Вывод информации местоположения
    @GetMapping()
    public String info(){
        log.info("Произведен запрос местоположения");
        return "location.html";
    }

}
