package javacore.POO.modificadorstatic.test;

import javacore.POO.modificadorstatic.dominio.Carro;

public class CarroTest {
    static void main() {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        c1.print();
        Carro.setVelocidadeLimite(180);
        c2.print();

    }
}
