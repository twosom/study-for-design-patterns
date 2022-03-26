package com.icloud.adapter.before.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
