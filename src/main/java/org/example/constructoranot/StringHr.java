package org.example.constructoranot;

public class StringHr {


    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";

        String a1 = new String("Pop");
        String a2 = new String("Pop");

        System.out.println(s1 == s2); // burada String pool baxir gorur eyni "Java" oldugu ucun artiq yeni yaratmir eyni obyekte isare edir:
        System.out.println(s1.equals(s2));

        System.out.println(a1 == a2); // burada ise yeni obyektler yarandigi ucun

        String b1 = "Lol";
        String b2 = new String("Lol");

        System.out.println(b1 == b2);
    }
}
