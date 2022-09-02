package com.devjaewoo.githubactiontest.entity;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @DisplayName("User 기본 권한이 Client로 설정되었는지")
    public void User_Constructor_DefaultAuthorityTest() {
        User user = new User("user");
        Assertions.assertThat(user.getAuthority()).isEqualTo(UserAuthority.ROLE_CLIENT);
    }

    @Test
    @DisplayName("단위테스트 실패 테스트케이스")
    public void failure() {
        Assertions.assertThat(1 == 1).isTrue();
    }
}