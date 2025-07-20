package org.example.schooltask;

import lombok.Data;
import org.example.task.Student;

import java.util.*;


public class Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Telebe> students = new ArrayList<>();
        Set<Telebe> set = new HashSet<>();
        Map<Integer, Telebe> map = new HashMap<>();

        for (int i = 0; i < 5; i++) {


            System.out.println("Telebelerin Id -sini daxil et:");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Telebelerin adini daxil et:");
            String name = scanner.nextLine();

            System.out.println("Telebelerin sinifini daxil et:");
            int grade = scanner.nextInt();
            scanner.nextLine();
            Telebe student = new Telebe(id, name, grade);

            students.add(student);


//            if (!map.containsKey(id)) {
//                set.add(student);
//
//            }
            map.put(id, student);


        }
        for (Telebe t : map.values())
            set.add(t);
        System.out.println(set);
        System.out.println(students);
        System.out.println(map);


    }


}




