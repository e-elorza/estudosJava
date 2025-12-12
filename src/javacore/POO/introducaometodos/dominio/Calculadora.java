package javacore.POO.introducaometodos.dominio;

public class Calculadora {

    public int soma(int a, int b){
        return a + b;
    }

    public int subtracao(int a, int b){
        return a - b;
    }

    public int multiplicacao(int a, int b){
        return a * b;
    }
    public double divisao(double a, double b){
            return a / b;
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
