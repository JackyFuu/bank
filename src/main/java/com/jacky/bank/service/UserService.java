package com.jacky.bank.service;

import com.jacky.bank.model.Result;
import com.jacky.bank.model.User;

public interface UserService {
    Result login(String username, String password);

    Result register(User user);

    Result getProfiles(String userId);
}
