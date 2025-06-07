package org.example.ConstructorThisname;

public class Personn {
    String name;
    String surname;
    int age;
    String gender;

    public String givename(String name1) {
        this.name = name1;
        System.out.println("Log1: Logumuz isledi ve " + name + " parametrini yerine yetirdi:");
        return name;
    }
      public void givesurname(String surname1){
        this.surname = surname1;
          System.out.println("Log3: Logumuz isledi ve " + surname + " parametrini yerine yetirdi:");
      }
      public int getAge (){
        age= 20;
          System.out.println("Log2: Logumuz isledi ve " + age + " parametrini yerine yetirdi:");
          return age;
      }
      public void givegender(){
        gender = "Male";

      }
       void  getname(){
        name="Eli";
           System.out.println("Wexsin adi :" + name);

      }

}
 class Main{
     public static void main(String[] args) {
         Personn p = new Personn();
         p.getAge();
         p.givegender();
         p.givesurname("Rehimov");
         p.givename("Ayxan");
         System.out.println(p.gender + " Wexsin cinsi ");
         p.getname();


     }

}
