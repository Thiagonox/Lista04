package concrete;

import abstracts.AnimalTerrestreAB;

public class Cachorro extends AnimalTerrestreAB {

    public Cachorro(String nome, int idade, double altura, double peso) {
        super(nome, "Cachorro", idade, "Doméstico", 4, altura, peso);
    }

    @Override
    public void comer(double quantidadeComida) {
        this.quantidadeComidaIngerida += quantidadeComida;
        System.out.println(nome + " está comendo " + quantidadeComida + " kg de ração.");
    }

    @Override
    public void moverse(double distancia) {
        this.distanciaPercorrida += distancia;
        System.out.println(nome + " está correndo " + distancia + " km pelo parque.");
    }

    @Override
    public void dormir(int horas) {
        this.horasDormidas += horas;
        System.out.println(nome + " está dormindo por " + horas + " horas.");
    }
}
