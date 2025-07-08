package org.example.pytn;

import java.util.Scanner;

public class Nurlana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eded daxil et:");
        int number = scanner.nextInt();
        int sum = 0;
        System.out.println("Diger ededi daxil et:");
        int number2 = scanner.nextInt();
        sum = number + number2;
        System.out.println("Toplam: "+sum);





    }
    class Nurlanaclass {



            int number;
            int number2;
            int sum;
            Nurlanaclass( int number, int number2){
                this.number = number;
                this.number2 = number2;
                sum = number + number2;
                System.out.println("Toplam: " + sum);
            }
        }

}
