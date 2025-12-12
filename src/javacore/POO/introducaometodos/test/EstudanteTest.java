package javacore.POO.introducaometodos.test;

import javacore.POO.introducaometodos.dominio.Estudante;

public class EstudanteTest {
    static void main() {

        Estudante enrico = new Estudante();
        enrico.nome = "Enrico";
        enrico.idade = 18;
        enrico.curso = "Computer Science";
        enrico.imprime();

        

    }
}