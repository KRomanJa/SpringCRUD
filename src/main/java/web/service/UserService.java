package web.service;

import web.model.User;

import java.util.List;


public interface UserService {
    void add(User user);
    List<User> userList();
    void delete(int id);
    User getUser(int id);
    User updateUser(User user, int id);
}