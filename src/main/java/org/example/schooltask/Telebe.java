package org.example.schooltask;


public class Telebe {
    private int id;
    private String name;
    private int grade;

    public Telebe(int id, String name, int grade) {
        this.id = id;
        this.name = name;

        this.grade = grade;
    }

    public String toString() {
        return   " Id: " + id +" Name: " + name+ " Grade: " + grade;

    }

}
