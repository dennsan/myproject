package com.tms.main.client;

import com.tms.main.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "user-service", url = "http://127.0.0.1:8081", path = "/users")
public interface UserClient {

    @PostMapping
    public UserDto save(@RequestBody UserDto request);

    @GetMapping
    public List<UserDto> getAll();

    @PutMapping("/{id}")
    public void update(@PathVariable(name = "id") Integer id,
                          @RequestBody String request);

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Integer id);
}
