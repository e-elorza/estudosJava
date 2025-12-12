package javacore.POO.contrutores.test;

import javacore.POO.contrutores.dominio.Serie;

public class SerieTest {
    static void main() {
        Serie serie = new Serie("House M.D", "Medical Series", 20, "Drama"  );
        serie.print();
        System.out.println("=====================");
        Serie serie2 = new Serie("House M.D", "Medical Series", 20, "Drama", "Netflix");
        serie2.print();
    }
}
