package org.example.trycatch;

import java.util.Scanner;

public class TryScanCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = null;

         try {
             System.out.println("Yazini daxil edin: null saxlamaq ucun entere vurun : ");
             input = scanner.nextLine();
             if (input.equals("")) {
                 input = null;
                 System.out.println("Sizin metnininiz: "+ null);
             }else {
                 System.out.println("Sizin metnininiz: "+ input);
             }
         }catch (NullPointerException e){
             System.out.println("Metnin girilmedi");
         }finally {
             System.out.println("Tesekkurler");
         }
    }
}
