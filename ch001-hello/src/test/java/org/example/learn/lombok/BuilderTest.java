package org.example.learn.lombok;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;
import org.junit.Test;

public class BuilderTest {


    @Getter
    @Builder
    @ToString
    public static class User {

        // lombok 在编译时，会在生成的或你手动编写的构造器内部，插入一个显式的空值检查语句
        @NonNull
        private String name;
        private int age;
    }


    @Test(expected = NullPointerException.class)
    public void test(){
        User user = User.builder().build();
        System.out.println("user = " + user);
    }
}
