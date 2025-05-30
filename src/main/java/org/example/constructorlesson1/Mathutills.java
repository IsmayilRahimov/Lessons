package org.example.constructorlesson1;

public class Mathutills {
    int add (int a,int b){
        return a+b;

    }
    double  add (double b,double c){
        return b/c;
    }

    public static void main(String[] args) {
        Mathutills mathutills =new Mathutills();
        int p=mathutills.add(1000,200);
        System.out.println(p);
        double l=mathutills.add(200.34,20.2);
        System.out.println(l);
    }

}

