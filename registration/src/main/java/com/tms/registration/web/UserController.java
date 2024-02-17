package com.tms.registration.web;

import com.tms.registration.domain.User;
import com.tms.registration.dto.UserDto;
import com.tms.registration.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;
    @PostMapping
    public UserDto save (@RequestBody UserDto request){
        return service.save(request);
    }
    @GetMapping
    public List<UserDto> getAll(){
        return service.findAll();
    }
    @PutMapping("/{id}")
    public void update(@PathVariable(name="id") Integer id,
                          @RequestBody String request){
        service.update(id,request);
    }
    @DeleteMapping("/{id}")
    public void delete (@PathVariable(name="id") Integer id){
        service.deleteById(id);
    }

}
