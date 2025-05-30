package org.example.constructorlesson1;

public class KamazOverloading {
   String transport (String qum){
       return "Kamaz "+qum+"Getirir";

   }
   String transport (String wuwe,String pencere){
       return "Kamaz "+ wuwe + pencere+ " getirir ";
   }

    public static void main(String[] args) {
        KamazOverloading kamaz = new KamazOverloading();
     String ilk =kamaz.transport("qum ");
        System.out.println(ilk);
        String ikinci=kamaz.transport(" wuwe ","pencere");
        System.out.println(ikinci);
    }
}
