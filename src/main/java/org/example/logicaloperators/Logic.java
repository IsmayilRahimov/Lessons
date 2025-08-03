package org.example.logicaloperators;

public class Logic {
    public static void main(String[] args) {
        int speed = 260;
        int year = 2001;
        double distance = 150.000d;
                          //  true          //false         true;
        boolean canbuy = speed > 240 || year > 2005 || distance > 10000;
        System.out.println(canbuy);
        //                    false           true              false
        boolean canNotbuy = speed < 240 || year < 2005 && distance < 10000;
        System.out.println(canNotbuy);

        int num = 0;
        boolean isEven = num % 2 == 0;
        System.out.println(isEven);

        int number = 0;   // true
        boolean flag = speed > 240 && ++number >1;
        System.out.println(number);
    }

}
