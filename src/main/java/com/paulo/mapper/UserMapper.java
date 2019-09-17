package com.paulo.mapper;

import com.paulo.dataobject.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    @Insert("INSERT INTO user(`id`,`name`,`age`) VALUES(#{user.id},#{user.name},#{user.age})")
    int add(@Param("user") User user);
    @Delete("DELETE FROM user WHERE `id` = #{id}")
    int deleteById(@Param("id") long id);
    @Update("UPDATE user SET `name` = #{user.name}, `age` = #{user.age} WHERE `id` = #{user.id}")
    int update(@Param("user") User user);
    @Select("SELECT `id`,`name`,`age` FROM user WHERE id = #{id}")
    User findById(@Param("id") long id);
    @Select("SELECT `id`,`name`,`age` FROM user WHERE name = #{name}")
    List<User> findByName(@Param("name") String name);


}
