package org.example.learn.lombok.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = {"name"})
public class Address {

    private String name;

    private String alias;
}
