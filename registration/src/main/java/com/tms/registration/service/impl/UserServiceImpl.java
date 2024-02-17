package com.tms.registration.service.impl;

import com.tms.registration.domain.User;
import com.tms.registration.dto.UserDto;
import com.tms.registration.mapper.UserMapper;
import com.tms.registration.repository.UserRepository;
import com.tms.registration.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserMapper mapper;
    private final UserRepository repository;
    @Override
    public UserDto save(UserDto dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Override
    @Transactional
    public void update(Integer id, String pass) {
        var userId = repository.findById(id).orElseThrow(RuntimeException::new);
        repository.updatePass(userId.getId(), pass);
//        mapper.updateById(user, dto);
//        return mapper.toDto(userId);
    }

    @Override
    public List<UserDto> findAll() {
        return mapper.toDtos(repository.findAll());
    }

    @Override
    public void deleteById(Integer id) {
        var user = repository.findById(id).orElseThrow(RuntimeException::new);
        repository.delete(user);
    }
}
