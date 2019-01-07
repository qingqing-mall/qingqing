package com.liaoyb.qingqing.security;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * 用户信息
 *
 * @author liaoyb
 */
public class Userdetail extends org.springframework.security.core.userdetails.User {
    private Long userId;

    public Userdetail(Long userId, String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        this.userId = userId;
    }

    public Userdetail(Long userId, String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
