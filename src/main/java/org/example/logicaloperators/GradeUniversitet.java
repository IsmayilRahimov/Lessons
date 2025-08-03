package org.example.logicaloperators;
/*
logic &&
 */
public class GradeUniversitet {
    public static void main(String[] args) {
        int grade = 80;
//                         //true//           //true
        boolean isGradeB = grade > 40 && grade < 60;
        System.out.println(isGradeB);
        boolean isGradeC = grade > 50 && grade < 70;
        System.out.println(isGradeC);
        boolean isGradeA = grade > 71 && grade < 81;
        System.out.println(isGradeA);
        boolean isGradeFail = grade < 40 || grade > 80;
        System.out.println(isGradeFail);

    }
}
