package com.tms.main.service;

import com.tms.main.domain.UserDto;

import java.util.List;

public interface UserService {
    UserDto save (UserDto dto);
    List<UserDto> findAll();
    void deleteById(Integer id);
    void updatePass(Integer id, String pass);
}
