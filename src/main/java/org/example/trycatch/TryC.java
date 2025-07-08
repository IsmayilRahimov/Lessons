package org.example.trycatch;

public class TryC {
    public static void main(String[] args) {
        try{
            int result = 10/0;
            System.out.println("a = " + result);
        }catch (ArithmeticException e){
            System.out.println("Xeta  var");
        }finally {
            System.out.println("Finally");
        }
    }
}
