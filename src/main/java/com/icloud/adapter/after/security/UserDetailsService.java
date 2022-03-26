package com.icloud.adapter.after.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
