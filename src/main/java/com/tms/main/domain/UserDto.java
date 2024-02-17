package com.tms.main.domain;

import lombok.*;

@Data@AllArgsConstructor@NoArgsConstructor
public class UserDto {
    private Integer id;
    private String email;
    private Role role;
    private String password;
}