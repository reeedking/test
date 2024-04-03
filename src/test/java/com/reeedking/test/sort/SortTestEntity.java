package com.reeedking.test.sort;

import lombok.*;
import org.jetbrains.annotations.NotNull;

/**
 * @Author wanghong
 * @Date 2024/4/3
 * @Description 用于排序测试的实体类
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SortTestEntity implements Comparable<SortTestEntity> {

    private int age;

    private String name;

    @Override
    public int compareTo(@NotNull SortTestEntity o) {
        if (this.getAge() == o.getAge()) {
            return this.getName().compareTo(o.getName());
        }
        return this.getAge() - o.getAge();
    }

    @Override
    public String toString() {
        return "SortTestEntity{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
