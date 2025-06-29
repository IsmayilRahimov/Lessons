package org.example.taskStudent;


public class Student {


    String getStatus(String name, int grade) {
        if (grade >= 90) {
            return "Ela";
        } else if (grade >= 70) {
            return "Yaxsi";
        } else if (grade >= 50) {
            return "Kafi";
        } else {
            return "Zeif";
        }

    }


}

