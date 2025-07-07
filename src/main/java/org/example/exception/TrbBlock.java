package org.example.exception;

public class TrbBlock {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Xeta bas verdi");
        } finally {
            System.out.println("Musteriye bildiris gonderildi:Novbeti merheleye kece bilersiz:");
        }
    }
}
