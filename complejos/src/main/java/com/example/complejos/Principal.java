package com.example.complejos;

public class Principal {
    public static void main(String[] main) {
        Complejo z, w;
        z = new Complejo(-1.5, 3.0);
        w = new Complejo(-1.2, 2.4);
        System.out.println("Complejo z: " + z.toString());
        System.out.println("Complejo w: " + w.toString());
        z.suma(w);
        System.out.println("Complejo suma z&w: " + z.toString());
    }
}
