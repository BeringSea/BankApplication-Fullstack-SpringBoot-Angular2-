package com.userfront.userfront.domain.security;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author David Mojicevic on 3/5/19.
 */
public class Authority implements GrantedAuthority{

    private final String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
