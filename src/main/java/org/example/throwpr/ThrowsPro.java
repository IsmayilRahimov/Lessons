package org.example.throwpr;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ThrowsPro {

    public static void readfile() throws IOException {

        File file = new File("test.txt");
        Scanner reader = new Scanner(file);
    }

    public static void main(String[] args) {
        try {
            readfile();
        } catch (IOException e) {
            System.out.println("Fayl non :");
        }
    }
}
