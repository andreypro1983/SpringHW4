package ru.geekbrains.SpringHW4.services;

import org.springframework.stereotype.Service;
import ru.geekbrains.SpringHW4.model.User;
import ru.geekbrains.SpringHW4.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    // Получение списка всех пользователей
    public List<User> getUsers(){
        return UserRepository.getUsers();
    }
    // Добавление пользователя
    public void addUser(User user){
        UserRepository.addUser(user);
    }
}
