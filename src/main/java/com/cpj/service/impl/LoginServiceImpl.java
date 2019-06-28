package com.cpj.service.impl;

import com.cpj.entities.User;
import com.cpj.mapper.LoginMapper;
import com.cpj.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author PengjuCao
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginMapper loginMapper;
    @Override
    public User loginUser(String username, String password) {
        System.out.println("我已经做了查询service");
        return loginMapper.loginUser(username,password);
    }
}
