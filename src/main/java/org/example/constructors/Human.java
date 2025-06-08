package org.example.constructors;

public class Human {
    public static void main(String[] args) {
       Person9.name = "Ali";
       Person9.address = "Baki";
       Person9.age = 21;
       System.out.println(Person9.name + " " + Person9.age + " " + Person9.address);
       Person9 p = new Person9();
       p.job = "Developer";
       System.out.println(p.job);
        Person9.salary = 10000;
        System.out.println(Person9.salary+": Aldigi maaw");
    }
}
