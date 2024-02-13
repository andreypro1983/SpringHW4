package ru.geekbrains.SpringHW4.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.geekbrains.SpringHW4.model.User;
import ru.geekbrains.SpringHW4.services.UserService;
import java.util.List;

@Controller
@AllArgsConstructor
@Log
public class UserController {
    UserService userService;

    // Запрос всех пользователей
    @GetMapping("/users")
    public String getUsers(Model model){
    List<User> users = userService.getUsers();
    model.addAttribute("users",users);
        return "serverUsers";
    }

    // Добавление нового пользователя
    @PostMapping("/users")
    public String addUser(User user,Model model){
        userService.addUser(user);
        model.addAttribute("users",userService.getUsers());
        log.info("Пользователь " + user + " успешно добавлен");
        return "redirect:/users";
    }
}
