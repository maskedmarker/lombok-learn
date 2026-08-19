package org.example.learn.lombok;

import lombok.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * builder模式期望对象一次成型,所以没有无参构造器.
 * 如果你同时需要一个无参构造器,那么你违反了builder模式的思想,可能仅仅是图@Builder提供的.prop(propValue)的链式方法
 *
 * {@code @Builder和@Getter配合比较好,尽量避免@Setter}
 */
public class BuilderTest {


    @Builder
    @Getter @ToString // @Builder并不会提供getter方法和toString方法
    public static class User {

        // lombok 在编译时，会在生成的或你手动编写的构造器内部，插入一个显式的空值检查语句
        @NonNull
        private String name;
        private int age;
    }


    @Test(expected = NullPointerException.class)
    public void test0(){
        User user = User.builder().build();
        System.out.println("user = " + user);
    }

    @Test
    public void test1(){
        Arrays.stream(User.class.getDeclaredConstructors()).forEach(System.out::println);
        Assert.assertEquals("@Builder的build()方法需要一次生成完整的User,所以需要一个包含所有属性的constructor", 1, User.class.getDeclaredConstructors().length);
    }
}
