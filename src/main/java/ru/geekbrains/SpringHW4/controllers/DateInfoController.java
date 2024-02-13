package ru.geekbrains.SpringHW4.controllers;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalTime;


@Controller
@Log
@RequestMapping("/date")
public class DateInfoController {
    //Вывод информации по текущей дате и времени сервера
    @GetMapping
    public String getCurrentTime(Model model){
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        model.addAttribute("date",currentDate);
        model.addAttribute("time",currentTime);
        log.info("Произведен запрос текущей даты и времени");
        return "date";
    }
}
