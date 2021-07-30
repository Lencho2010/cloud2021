package com.lencho.mybatis.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Lencho
 * @create 2021-07-30 22:40
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Integer id;

    private String name;

    private Integer age;

    private Integer no;
}
