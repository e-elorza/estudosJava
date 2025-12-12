package javacore.POO.modificadorstatic.test;

import javacore.POO.modificadorstatic.dominio.Anime;

public class AnimeTest {
    static void main() {
        Anime a1 = new Anime("BunnyGirl");
        Anime a2 = new Anime("Haikyuu");
        a1.print();
        a2.print();
    }
}
