package javacore.POO.introducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void print() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            return;
        } else {
            this.idade = idade;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}
