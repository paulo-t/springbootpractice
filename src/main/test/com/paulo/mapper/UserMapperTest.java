package com.paulo.mapper;

import com.paulo.dataobject.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void add() {
        User user = new User();
        user.setId(0L);
        user.setName("joe");
        user.setAge(20);
        int result = userMapper.add(user);
        Assert.assertTrue(result > 0);
    }

    @Test
    public void deleteById() {
        int result = userMapper.deleteById(1);
        Assert.assertTrue(result > 0);
    }

    @Test
    public void update() {
        User user = new User();
        user.setId(2L);
        user.setName("paulo");
        user.setAge(19);
        int result = userMapper.update(user);
        Assert.assertTrue(result > 0);
    }

    @Test
    public void findById() {
        User user = userMapper.findById(2);
        Assert.assertTrue(user != null);
    }

    @Test
    public void findByName() {
        List<User> userList = userMapper.findByName("paulo");
        Assert.assertTrue(userList != null && userList.size() >0);
    }
}
