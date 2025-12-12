package javacore.POO.introducaometodos.test;

import javacore.POO.introducaometodos.dominio.Carro;

public class CarroTest {

    static void main() {
        Carro carro1 = new Carro();
        carro1.marca = "Ford";
        carro1.modelo = "Ranger";
        carro1.ano = 2025;

        Carro carro2 = new Carro();
        carro2.marca = "Volkswagen";
        carro2.modelo = "Saveiro";
        carro2.ano = 2013;

        carro1.imprime();
        carro2.imprime();
    }
}
