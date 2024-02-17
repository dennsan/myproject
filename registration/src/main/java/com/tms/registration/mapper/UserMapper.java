package com.tms.registration.mapper;

import com.tms.registration.domain.User;
import com.tms.registration.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto (User userEntity);
    User toEntity(UserDto dto);
//    @Mapping(target = "id", ignore = true)
//    @Mapping(target = "email", ignore = true)
//    void updateById(@MappingTarget User user, UserDto dto);
    List<UserDto> toDtos(List<User> userEntities);
}
