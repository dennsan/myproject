package com.tms.main.web;

import com.tms.main.domain.UserDto;
import com.tms.main.service.UserService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/search/users")
public class UserController {
    private final UserService service;

    @GetMapping
    public ModelAndView getAll() {
        ModelAndView modelAndView = new ModelAndView("home");
        var users = service.findAll();
        modelAndView.addObject("users", users);
        return modelAndView;
    }
    @PostMapping
    public String save(UserDto userDto){
        service.save(userDto);
        return "home";
    }
    @PutMapping ("/{id}")
    public String update(@PathVariable(name = "id") Integer id,
                               @RequestParam String pass){

        service.updatePass(id, pass);

        return "home";
    }
}
