package org.example.mapper;

import org.example.pojo.User;

import java.util.List;

/**
 * @author 21055
 * @description 针对表【user】的数据库操作Mapper
 * @createDate 2023-10-02 21:17:46
 * @Entity org.example.pojo.User
 */
public interface UserMapper {
    List<User> queryAll();

    Integer delete(int i);
}




