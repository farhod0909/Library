package com.example.library.service;

import com.example.library.dto.UserForm;
import com.example.library.entity.User;


public interface UserService {
    User add(UserForm form);
}
