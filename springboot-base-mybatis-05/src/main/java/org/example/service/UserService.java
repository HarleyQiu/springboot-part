package org.example.service;

import org.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    @Transactional
    public Integer delete() {
        Integer rows = userMapper.delete(1);
//        int i = 1 / 0;
        return rows;
    }
}
