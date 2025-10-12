package org.example.getset;

import lombok.Getter;
import lombok.Setter;

public class SetAndGet {
    @Getter
    @Setter

    private String name;

    public static void main(String[] args) {
        SetAndGet s1 = new SetAndGet();
        s1.setName("ALi");
        System.out.println(s1.getName());
    }
}
