package javacore.POO.introducaometodos.test;

import javacore.POO.introducaometodos.dominio.Calculadora;

public class CalculadoraTest {
    static void main() {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};

//        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3);
    }
}
