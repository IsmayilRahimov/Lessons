package org.example.getset;

import lombok.Getter;
import lombok.Setter;

public class GetandSet {
    private String name;
    private double age;
    private long time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

}

class Mainsl {
    public static void main(String[] args) {
        GetandSet s1 = new GetandSet();
        s1.setAge(21.2);
        System.out.println(s1.getAge());
        s1.setName("Code");
        System.out.println(s1.getName());
        s1.setTime(99);
        System.out.println(s1.getTime());

    }
}
