package com.cpj.service;

import com.cpj.entities.User;

/**
 * @author PengjuCao
 */

public interface LoginService {
    public User loginUser(String username, String password);
}
