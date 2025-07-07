package org.example.exception;

public class Sleep {
    public static void main(String[] args) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Proqrami ishlemir:");
        }
    }

}class Sleep2{
    public static void main(String[] args) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Proqrami ishlemir:");
        }
    }
}
