package com.tms.registration.service;

import com.tms.registration.domain.User;
import com.tms.registration.dto.UserDto;

import java.util.List;

public interface UserService {
UserDto save (UserDto dto);
void update(Integer id, String pass);
List<UserDto> findAll();
void deleteById(Integer id);
}
