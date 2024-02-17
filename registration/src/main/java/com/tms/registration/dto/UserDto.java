package com.tms.registration.dto;

import com.tms.registration.domain.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private Integer id;
    private String email;
    private Role role;
    private String password;
}
