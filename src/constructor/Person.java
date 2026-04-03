package src.constructor;

public class Person {
    private String nome;
    private int idade;
    private String email;

    // Construtor 1: nome e idade
    public Person(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.email = "nao.informado";
    }

    // Construtor 2: completo
    public Person(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    // Construtor 3: apenas nome (idade padrão)
    public Person(String nome) {
        this.nome = nome;
        this.idade = 0;
        this.email = "nao.informado";
    }
}