package org.example.learn.lombok;

import lombok.*;
import org.junit.Test;

/**
 * builder模式期望对象一次成型,所以没有无参构造器.
 * 如果你同时需要一个无参构造器,那么你违反了builder模式的思想,可能仅仅是图@Builder提供的.prop(propValue)的链式方法
 *
 * 这里主要是为了演示链式方法
 */
public class BuilderChainCallTest {


    @Builder
    @NoArgsConstructor  // 可以主动声明一个无参构造器
    @AllArgsConstructor // 为了builder,还必须声明一个全参构造器
    @Getter
    @ToString
    public static class Order {
        private Long id;
        private String productName;
        private Integer quantity;
    }


    /**
     * 这里主要是为了演示链式方法
     */
    @Test
    public void test0(){
        Order order = Order.builder().id(1L).productName("iphone").quantity(100).build();
        System.out.println("order = " + order);
    }
}
