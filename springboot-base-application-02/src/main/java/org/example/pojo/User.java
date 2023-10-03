package org.example.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 读取配置的方式1: @Value
 * 直接可以在属性上添加即可
 * <p>
 * &#064;Value(key必须写全了)
 * &#064;value只能读取单个值  批量配置读取:
 * &#064;ConfigurationProperties(prefix  = "qlh.user") 通用的前缀
 * 实体类
 * 属性名 = 最后一个key的值
 * 优势1: 方便 不用一个一个读取
 * 优势2: 可以给集合类型赋值
 */
@Data
@Component
@ConfigurationProperties(prefix = "qlh.user")
public class User {
    private String username; //等于key
    private String password;
    private List<String> gfs;
}
