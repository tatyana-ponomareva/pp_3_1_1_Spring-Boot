package com.example.__1_1_SpringBoot.dao;

import com.example.__1_1_SpringBoot.entity.User;
import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void saveUser(User user);
    User getUserById(int id);
    void updateUser(User user);
    void deleteUser(int id);
}
