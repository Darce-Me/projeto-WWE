package WWE;

import java.util.Scanner;

public class Lutador {

    Scanner scan = new Scanner(System.in);
//    Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrottas;
    private int empates;

//    Funções
    public void apresentar() {
        System.out.println("Nome: " + getNome() + "\nNacionalidade: " + getNacionalidade() + "\nIdade: " + getIdade() + "\nAltura: " + getAltura() + "\nPeso: " + getPeso() + "\nCategoria: " + getCategoria());
    }

    public void status() {
        System.out.println("Vitórias: " + getVitorias() + "\nDerrotas: " + getDerrottas() + "\nEmpates: " + getEmpates());
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrottas(getDerrottas() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
    
//  Contructor
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrottas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrottas = derrottas;
        this.empates = empates;
    }

//  Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCategoria() {
         if (getPeso() < 52) {
            this.categoria = "Inválido";
        } else if (getPeso() <= 70) {
            this.categoria = "Peso leve";
        } else if (getPeso() <= 83) {
            this.categoria = "Peso médio";
        } else if (getPeso() <= 110) {
            this.categoria = "Peso pesado";
        } else {
            this.categoria = "Inválido";
        }
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrottas() {
        return derrottas;
    }

    public void setDerrottas(int derrottas) {
        this.derrottas = derrottas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
