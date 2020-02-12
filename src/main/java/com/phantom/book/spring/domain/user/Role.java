package com.phantom.book.spring.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "guest"),
    USER("ROLE_USER", "norm_user");

    private final String key;
    private final String title;
}
