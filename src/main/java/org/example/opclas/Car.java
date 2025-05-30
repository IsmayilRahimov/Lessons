package org.example.opclas;

 class Car {
     String color;
     String brand;
     int year;
     int speed;

     void start(){
         System.out.println(brand+" is starting");
     }
     void stop(){
         System.out.println(brand+" is stopping");
     }
     void run(){
         System.out.println(speed+" is speeding");
     }
     void reng(){
         System.out.println(" Masinin rengi: "+color);
     }
     void il(){
         System.out.println(" Masinin ili budur :"+year );
     }
}
