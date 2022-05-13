package com.joaodcpjunior.user.repository;

import com.joaodcpjunior.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
