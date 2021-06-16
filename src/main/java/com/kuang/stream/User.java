package com.kuang.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 有参，无参构造，get、set、toString方法！
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Comparable<User> {

    private int id;
    private String name;
    private int age;

    @Override
    public int compareTo(User o) {
        return -name.compareTo(o.name);
    }
}
