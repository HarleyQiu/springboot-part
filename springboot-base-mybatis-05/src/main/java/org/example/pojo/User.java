package org.example.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @TableName user
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String username;
    private String password;
}