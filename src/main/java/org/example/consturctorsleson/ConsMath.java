package org.example.consturctorsleson;

public class ConsMath {
    int add (int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b, double c){
        return a+b+c;
    }
    long add(long a, long b, long c){
        return a+b+c;
    }
    float add(float a, float b, float c){
        return a+b+c;
    }
}

class useConsMath{
    public static void main(String[] args) {
        ConsMath consMath = new ConsMath();
        int x = consMath.add(10, 20, 30);
        System.out.println(x);
        double a = consMath.add(20.34, 20.2, 20.1);
        System.out.println(a);
        long b = consMath.add(20, 20, 20);
        System.out.println(b);
        float c = consMath.add(20.34f, 20.2f, 20.1f);
        System.out.println(c);
    }

}
