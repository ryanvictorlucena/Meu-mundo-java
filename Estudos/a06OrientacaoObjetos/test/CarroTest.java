package test;

import dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro("Renault Boreal", "Evolution", 2026);
        System.out.println(c.getNome() + " " + c.getModelo() + " " + c.getAno());     
    }
}
