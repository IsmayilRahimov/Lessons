package org.example.trycathfinall;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
        Scanner filereader = null;

        try {
            filereader = new Scanner(new File("test.txt"));
            System.out.println("Fayl oxundu:");
        } catch (FileNotFoundException e) {
            System.out.println("Fayl tapilmadi:");
        } finally {
            if (filereader != null) {
                filereader.close();
                System.out.println("Fayl baglandi:");
            }
        }
    }
}
