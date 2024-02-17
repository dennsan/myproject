package com.tms.registration.repository;

import com.tms.registration.domain.User;
import com.tms.registration.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Modifying
    @Query(value = "update User set password =:pass where id=:id")
void updatePass (Integer id, String pass);
}
