package com.tms.main.service.impl;

import com.tms.main.client.UserClient;
import com.tms.main.domain.UserDto;
import com.tms.main.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service

public class UserServiceImpl implements UserService {
    private final UserClient client;
    @Override
    public UserDto save(UserDto dto) {
        return client.save(dto);
    }

    @Override
    public List<UserDto> findAll() {
        return client.getAll();
    }

    @Override
    public void deleteById(Integer id) {
        client.delete(id);
    }

    @Override
    public void updatePass(Integer id, String pass) {
        client.update(id, pass);
    }
}
