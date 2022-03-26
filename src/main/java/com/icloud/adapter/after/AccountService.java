package com.icloud.adapter.after;

import com.icloud.adapter.after.security.UserDetails;
import com.icloud.adapter.after.security.UserDetailsService;

public class AccountService implements UserDetailsService {

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    @Override
    public UserDetails loadUser(String username) {
        return this.findAccountByUsername(username);
    }
}
