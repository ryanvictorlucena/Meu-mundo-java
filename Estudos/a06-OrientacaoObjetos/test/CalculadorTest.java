package test;

import dominio.Calculador;

public class CalculadorTest {
    
    public static void main(String[] args) {
        Calculador c = new Calculador();
        System.out.println(c.somaDois(2, 3));
        c.subDois(3, 1);
    }
}
