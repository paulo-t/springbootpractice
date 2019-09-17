package com.paulo.service;

import com.paulo.dataobject.User;

import java.util.List;

public interface UserService {
    int add(User user);
    int deleteById(long id);
    int update( User user);
    User findById( long id);
    List<User> findByName(String name);
}
