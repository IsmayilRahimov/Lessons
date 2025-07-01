package org.example.encaps;

public class Students {
    private String name;   // gilzi fild
    private int age;     // fildi gizledirik private edirik

    public String getName() {  // burda ad elde etmek demekdir
        return name;
    }
    public void setName(String name) {  // set ad teyin etmekdir:
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
