package com.veterinary.followup.repository;

import com.veterinary.followup.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository {

    User findByEmail(String email);

    List<User> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);

    Optional<User> findById(Long id);

    void save(User user);
}
