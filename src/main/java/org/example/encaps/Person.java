package org.example.encaps;

public class Person {
    private String name;
    private int age;
    private String address;
    private String phone;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Eliyev");
        person.setAge(30);
        person.setAddress("Gence");
        person.setPhone("05555555555");
        System.out.println(person.getName() + " " + person.getAge() + " " + person.getAddress() + " " + person.getPhone() );
    }
}
