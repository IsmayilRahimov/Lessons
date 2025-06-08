package org.example.constructors;

public class People {
    String name; // non static fildlere mutleqdirki obyekt yaradaq:
    String address;
    static int age;
    static String job; // static fildslere ehtiyac yoxdur: Birbawa clasdan cagirmag oliur:


    public static void setname(String name){
        System.out.println("Name: " + name);
    }
    public void getage(int age){
        System.out.println("Age: " + age);
    }
    public static void setjob(String job){
        System.out.println("Job: " + job);
    }
    void setaddress(String address){
        System.out.println("Address: " + address+ ": Unvan");
    }
}
class Student{
    public static void main(String[] args) {
        People insan = new People(); // burda obyekt yaradiliri non static metodlari cagirmag ucun:
        People.setjob("Student"); // burda static fild ve metod olduguna gore birbawa Clasdan cagirmag olur:

        insan.setaddress("Baki");// non-static oldugu ucun adres  metodunda Filde adres menimsedirik ve metoda adi yaz;

        insan.getage(22);
        People.setname("Anar");

    }
}