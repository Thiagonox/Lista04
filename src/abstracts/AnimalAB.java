package abstracts;

import interfaces.AnimalIF;

public abstract class AnimalAB implements AnimalIF {
    protected String nome;
    protected String tipoAnimal;
    protected int idade;
    protected String habitat;
    protected int quantidadePatas;
    protected double altura;
    protected double peso;

    protected double quantidadeComidaIngerida;
    protected double distanciaPercorrida;
    protected int horasDormidas;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, double altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.quantidadePatas = quantidadePatas;
        this.altura = altura;
        this.peso = peso;
        this.quantidadeComidaIngerida = 0;
        this.distanciaPercorrida = 0;
        this.horasDormidas = 0;
    }

    @Override
    public abstract void comer(double quantidadeComida);

    @Override
    public abstract void moverse(double distancia);

    @Override
    public abstract void dormir(int horas);

    public void exibirEstado() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de Animal: " + tipoAnimal);
        System.out.println("Idade: " + idade);
        System.out.println("Habitat: " + habitat);
        System.out.println("Quantidade de Patas: " + quantidadePatas);
        System.out.println("Altura (Mts): " + altura);
        System.out.println("Peso (Kg): " + peso);
        System.out.println("Quantidade de Comida Ingerida (Kg): " + quantidadeComidaIngerida);
        System.out.println("Distância Percorrida (Km): " + distanciaPercorrida);
        System.out.println("Horas Dormidas: " + horasDormidas);
    }
}
