package org.example.gues;

import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secretnumber = (int) (Math.random() * 10) + 1;
        int guess; // istifadecinin texmin etdiyi eded
        int attempts = 0;  // nece defe cehd edirse

        System.out.println("Ededi tap oyunu basladi!");
        System.out.println("1 ile 10 arasinda bir eded tapmaga calis!");

        do {  // et
            System.out.println("Texminini yaz: ");
            guess = input.nextInt();    // texmin etdiyin ededi buna beraber edir=guess
            attempts++;          // cehdin sayini 1 vahid artirir  her novbeti cehdde artiracaq:
            if (guess == secretnumber) { // eger daxil edilen eded gizli edede beraberdirse?
                System.out.println("Tebrikler dogru ededi tapdiniz:");
                System.out.println("Cemi " + attempts + " cehd etdiniz:");
            } else if (guess > secretnumber) {  // yox eger deyil sertin icerisi dogurdursa?
                System.out.println("Cox boyuk eded dedin!: Daha kicik cehd et.");
            } else { // yox buda deyilse bunu et
                System.out.println("Cox kicik eded dedin! Daha boyuk cehd et.");
            }

        } while (guess != secretnumber); // daxil edilen eded gizli edede beraber olmuyana qeder
        System.out.println("Oyunun sonu .Gizli eded" + secretnumber);
        input.close();
    }
}
