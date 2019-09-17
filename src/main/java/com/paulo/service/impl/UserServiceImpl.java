package com.paulo.service.impl;

import com.paulo.dataobject.User;
import com.paulo.mapper.UserMapper;
import com.paulo.service.UserService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public int add(User user) {
        return userMapper.add(user);
    }

    @Override
    public int deleteById(long id) {
      return userMapper.deleteById(id);
    }

    @Override
    public int update(User user) {
       return userMapper.update(user);
    }

    @Override
    public User findById(long id) {
       return userMapper.findById(id);
    }

    @Override
    public List<User> findByName(String name) {
        return userMapper.findByName(name);
    }
}
