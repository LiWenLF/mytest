package com.faisco.mysql.repository;

import com.faisco.mysql.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<User, Long> {
}
