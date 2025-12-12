package javacore.POO.introducaometodos.test;

import javacore.POO.introducaometodos.dominio.Pessoa;

public class PessoaTest {
    static void main() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Enrico");
        pessoa.setIdade(18);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
