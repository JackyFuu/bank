package com.jacky.bank.mapper;

import com.jacky.bank.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    User login(@Param("username") String username, @Param("password") String password);

    User findUserByName(String username);

    void register(User user);

    User getProfilesByUserId(String userId);
}
