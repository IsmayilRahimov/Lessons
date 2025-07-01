package org.example.encaps;

public class Main {
    public static void main(String[] args) {
        Students student = new Students();
        student.setName("Ragimov Ismayil");
        student.setAge(110);
        if (student.getAge() > 18 && student.getAge()<100 ) {

            System.out.println("Tebrikler " + student.getName());
            System.out.println(student.getAge());
        }else {
            System.out.println("Duzgun data daxil edin:");
        }
    }
}
