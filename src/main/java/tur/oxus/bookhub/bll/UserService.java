package tur.oxus.bookhub.bll;

import tur.oxus.bookhub.bo.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> loadAllUsers();
    void updateUser(long userId);
    void removeUser(long userId);
}
