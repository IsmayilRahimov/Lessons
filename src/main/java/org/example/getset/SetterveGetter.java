package org.example.getset;

import lombok.Data;

@Data
public class SetterveGetter {
    private String name;

    public static void main(String[] args) {
        SetterveGetter s1 = new SetterveGetter();
        s1.setName("Anar");
        System.out.println(s1.getName());
    }

}
