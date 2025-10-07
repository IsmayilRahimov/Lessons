package org.example.scannerin;

public class Methodpr {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Methodpr a1 = new Methodpr();
        a1.add(1, 2);
        a1.add("1", "2");
    }
}
