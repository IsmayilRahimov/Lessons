package org.example.throwpr;

public class ThrowProject {
    public static void checkage(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Yas 18 den kicik ola bilmez:");
        } else {
            System.out.println("Yas duzgundur: " + age);
        }

    }

    public static void chechkteam(int amount) {
        if (amount < 5000) {
            throw new IllegalArgumentException("Maas asagi oldugu ucun qebul edilmir:");
        }
        System.out.println("Sizi tebrik edirik: " + amount);
    }

    public static void main(String[] args) {
        checkage(19);
        chechkteam(5500);
        chechkteam(4900);

    }

}
