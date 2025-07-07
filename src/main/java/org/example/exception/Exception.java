package org.example.exception;

public class Exception {
    public static void main(String[] args) {
        try{
            int Result = 10 / 0;
            System.out.println(Result);
        }catch (RuntimeException e){
            System.out.println("Xeta bas verdi");
        }if (10/0 == 0){
            System.out.println("Xeta bas verdi. 0 -a bolmek mumkun deyil:");
        } else    {
            System.out.println("Problem yoxdur :");
        }
    }
}
