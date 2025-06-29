package org.example.taskStudent;

import java.util.Scanner;

public class Hesablama {

    public static void main(String[] args) {
        String result;
        do {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Adinizi giriniz: ");
            String name = scanner.nextLine();
            System.out.println("Qiymeti giriniz: ");
            int grade = scanner.nextInt();
            scanner.nextLine();
            Student student = new Student();

            switch (student.getStatus(name, grade)) {
                case "Ela":
                    System.out.println(name + " Ela");
                    break;
                case "Yaxsi":
                    System.out.println(name + " Yaxsi");
                    break;
                case "Kafi":
                    System.out.println(name + " Kafi");
                    break;
                case "Zeif":
                    System.out.println(name + " Zeif");
            }
            System.out.println("Devam etmek istiyor musunuz ? (beli/xeyr)");
             result=scanner.nextLine();
        } while (result.equals("beli"));
        System.out.println("Sagolun gule gule :)");
    }
}
