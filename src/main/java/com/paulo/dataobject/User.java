package com.paulo.dataobject;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class User implements Serializable {
    private static final long serialVersionUID = 3448981906726734188L;

    private long id;
    private String name;
    private int age;
}
