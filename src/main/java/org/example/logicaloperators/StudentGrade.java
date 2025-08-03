package org.example.logicaloperators;

public class StudentGrade {
    public static void main(String[] args) {
        int grade = 51;
        boolean isNotPass = grade < 50 && grade > 40;

        System.out.println(isNotPass);
    }
}
