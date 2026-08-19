package org.example.learn.lombok;

import lombok.Data;
import org.junit.Test;

/**
 * @Data Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
 */
public class DataTest {

    @Data
    public static class User {
        private String name;
        private int age;
    }


    @Test
    public void test(){
        User user = new User();
        System.out.println(user);
        System.out.println("@Data");
        user.setName("zhangSan");
        user.setAge(18);
        System.out.println(user);
    }
}
