package com.devjaewoo.githubactiontest.service;

import com.devjaewoo.githubactiontest.entity.User;
import com.devjaewoo.githubactiontest.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public Long join(User user) {
        if(user.getName().isEmpty()) {
            throw new IllegalArgumentException("유효한 회원명이 아닙니다.");
        }

        userRepository.save(user);

        return user.getId();
    }
}
