package org.example.exception;

public class TryEx {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Xeta bas verdi: Emeliyyat icra olunmadi>");
        } finally {
            System.out.println("Musteriye bildiris gonderildi:Novbeti merheleye kece bilersiz:");
        }
    }
}
