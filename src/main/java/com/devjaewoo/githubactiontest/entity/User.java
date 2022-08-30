package com.devjaewoo.githubactiontest.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private UserAuthority authority;

    public User(String name, UserAuthority authority) {
        this.name = name;
        this.authority = authority;
    }

    public User(String name) {
        this(name, UserAuthority.ROLE_CLIENT);
    }
}
