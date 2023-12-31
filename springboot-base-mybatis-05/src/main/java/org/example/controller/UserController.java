package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.mapper.UserMapper;
import org.example.pojo.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/list")
    public List<User> list() {
        log.info("UserController.list");
        return userMapper.queryAll();
    }

    @GetMapping("delete")
    public String delete() {
        Integer delete = userService.delete();
        return delete.toString();
    }
}
