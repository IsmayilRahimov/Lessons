package org.example.constructoranot;

public class ConstructorJava {
    String name;
    String surname;

    public ConstructorJava() {

    }

    public ConstructorJava(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public ConstructorJava(String surname) {
        this.surname = surname;
    }

    public static void main(String[] args) {
        ConstructorJava s1 = new ConstructorJava();
        ConstructorJava s2 = new ConstructorJava("Ragimov");
        ConstructorJava s3 = new ConstructorJava("Ismayil ", "Amirov");
        s3.surname = "Aliyeva";  //
        System.out.println(s3.surname);
        s3.name = new String("Anar");
        System.out.println(s3.name);
        s2.surname = "Anar";

    }
}
