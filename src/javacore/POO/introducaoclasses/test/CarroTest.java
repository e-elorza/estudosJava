package javacore.POO.introducaoclasses.test;

import javacore.POO.introducaoclasses.dominio.Carro;

public class CarroTest {

    public static String printClass(Carro carro) {
        return carro.marca + "\n" + carro.modelo + "\n" + carro.ano;
    }

    static void main() {
        Carro carro1 = new Carro();
        carro1.marca = "Ford";
        carro1.modelo = "Ranger";
        carro1.ano = 2025;

        Carro carro2 = new Carro();
        carro2.marca = "Volkswagen";
        carro2.modelo = "Saveiro";
        carro2.ano = 2013;

        System.out.println(printClass(carro1));
        System.out.println("\n");
        System.out.println(printClass(carro2));
    }
}
