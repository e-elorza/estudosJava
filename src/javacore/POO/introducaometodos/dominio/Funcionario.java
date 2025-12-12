package javacore.POO.introducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media = 0;

    public void print() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (this.salarios != null) {
            for (double aux : this.salarios) {
                System.out.print(aux + " ");
            }
        }
    }

    public void mediaSalarios(double salarios[]) {
        if (salarios == null) {
            return;
        }
        for (double aux : salarios) {
            this.media += aux;
        }
        this.media /= salarios.length;
        System.out.println("Média salarial: " + this.media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}
