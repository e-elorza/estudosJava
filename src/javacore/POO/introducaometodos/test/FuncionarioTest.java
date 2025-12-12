package javacore.POO.introducaometodos.test;

import javacore.POO.introducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    static void main() {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.setNome("Enrico");
        funcionario01.setIdade(18);
        funcionario01.setSalarios(new double[]{1200,900,800});



        System.out.println("==================");
        funcionario01.print();
        System.out.println("\n==================");
        funcionario01.mediaSalarios(funcionario01.getSalarios());

    }
}
