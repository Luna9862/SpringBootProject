package org.carolina.springbootproject.service;

import org.carolina.springbootproject.model.User;
import org.springframework.security.core.Authentication;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findUserById(Long id, Authentication authentication);
    List<User> findAllUsers(Authentication authentication);
    User updateUser(Long id, User user, Authentication authentication);
    void deleteUser(Long id, Authentication authentication);
}