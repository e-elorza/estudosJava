package javacore.POO.sobrecargametodos.test;

import javacore.POO.sobrecargametodos.dominio.Serie;

public class SerieTest {
    static void main() {
        Serie serie = new Serie();
        serie.init("House M.D", "Medical Series", 20, "Drama");
        Serie serie2 = new Serie();

        serie.print();
        serie2.print();
    }
}
