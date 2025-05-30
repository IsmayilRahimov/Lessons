package org.example.taskextends;

import lombok.Data;

@Data
public class Students extends Person {


   private String sdutendid;

    public  Students (String name, int age, String sdutendid) {

        super(name, age);
        this.sdutendid = sdutendid;
    }
    @Override
     public void printinfo() {
       super.printinfo();
        System.out.println(sdutendid);
    }
}

