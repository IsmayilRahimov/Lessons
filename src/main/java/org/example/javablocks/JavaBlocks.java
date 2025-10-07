package org.example.javablocks;

public class JavaBlocks {
    {
        System.out.println("Bu blok ");
    }

    static {
        System.out.println("Class yuklenir");
    }

    public static void main(String[] args) {
        JavaBlocks a = new JavaBlocks();
        System.out.println(a);
    }
}
