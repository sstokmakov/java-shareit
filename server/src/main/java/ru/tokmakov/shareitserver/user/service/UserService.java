package ru.tokmakov.shareitserver.user.service;

import ru.tokmakov.user.dto.UserDto;
import ru.tokmakov.shareitserver.user.model.User;

import java.util.List;

public interface UserService {
    User save(User user);

    User findById(long userId);

    List<User> findAll();

    User update(long userId, UserDto userDto);

    void deleteById(long userId);
}
