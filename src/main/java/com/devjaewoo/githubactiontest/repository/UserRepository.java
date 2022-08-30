package com.devjaewoo.githubactiontest.repository;

import com.devjaewoo.githubactiontest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
