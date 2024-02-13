package ru.geekbrains.SpringHW4.repository;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;
import ru.geekbrains.SpringHW4.model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    @Getter
    @Setter
    private static List<User> users = new ArrayList<>();

    public static User addUser(User user){
        users.add(user);
        return user;
    }
}
