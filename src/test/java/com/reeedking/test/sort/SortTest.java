package com.reeedking.test.sort;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author wanghong
 * @Date 2024/4/3
 * @Description 测试java排序
 */
public class SortTest {

    private List<SortTestEntity> list;

    @BeforeEach
    public void init() {
        list = Lists.newArrayList();
        list.add(new SortTestEntity(3, "b2"));
        list.add(new SortTestEntity(5, "c3"));
        list.add(new SortTestEntity(1, "d4"));
        list.add(new SortTestEntity(6, "e1"));
        list.add(new SortTestEntity(6, "a1"));


    }

    @Test
    public void comparableTest() {
        Collections.sort(list);
        list.forEach(System.out::println);
    }


    @Test
    public void ComparatorTest() {
        // age 从小到大
        Collections.sort(list, Comparator.comparingInt(SortTestEntity::getAge));
        list.forEach(System.out::println);

        System.out.println();
        System.out.println("****************");
        System.out.println();

        // name 从小到大
        Collections.sort(list, Comparator.comparing(SortTestEntity::getName));
        list.forEach(System.out::println);
    }
}
