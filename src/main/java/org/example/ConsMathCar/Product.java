package org.example.ConsMathCar;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
public class Product {
    String name;
    int price;
    int quantity;

}
class Product2{
    public static void main(String[] args) {
        Product p = new Product("Meyve",100,10);
        System.out.println(p.name+" "+p.price+" "+p.quantity);

        Product p1 = new Product("Terevez",20,30);
        System.out.println(p1.name+" "+p1.price+" "+p1.quantity);

        Product p2 = new Product();
        p2.name="Koz";
        p2.price=100;
        System.out.println(p2.name+" "+p2.price);
    }
}
