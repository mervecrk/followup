package com.veterinary.followup.service;

import com.veterinary.followup.dto.UserRegistrationDto;
import com.veterinary.followup.dto.UserUpdateDto;
import com.veterinary.followup.model.User;

import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface UserService extends UserDetailsService {
    User findByEmail(String email);

    Optional<User> findById(Long id);

    void save(UserRegistrationDto registration);

    void update(UserUpdateDto userUpdate, User user);

    List<User> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);
}
