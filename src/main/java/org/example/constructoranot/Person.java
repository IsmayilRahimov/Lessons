package org.example.constructoranot;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor

@RequiredArgsConstructor

public class Person {
    int age;
    String name;
    String surname;

    public static void main(String[] args) {
        Person p = new Person(); // burda All args constructoru islenir butun fildler istifade
        p.age=20;
        p.name="Ayxan";
        p.surname="Rehimov";
        System.out.println(p.name+" "+p.surname+" "+p.age);

        Person p1 = new Person(); // burda istedyimiz fildler istifade olnuur(Required args)

        p1.age=23;
        System.out.println(p1.age);


        Person p3 =new Person(); // burda bow constructor yaradiriq hec bir fild istifade olunmur



    }

}
