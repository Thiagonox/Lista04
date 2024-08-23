package concrete;

import abstracts.AnimalTerrestreAB;

public class Elefante extends AnimalTerrestreAB {

    public Elefante(String nome, int idade, double altura, double peso) {
        super(nome, "Elefante", idade, "Selva", 4, altura, peso);
    }

    @Override
    public void comer(double quantidadeComida) {
        this.quantidadeComidaIngerida += quantidadeComida;
        System.out.println(nome + " está comendo " + quantidadeComida + " kg de folhas.");
    }

    @Override
    public void moverse(double distancia) {
        this.distanciaPercorrida += distancia;
        System.out.println(nome + " está caminhando " + distancia + " km lentamente.");
    }

    @Override
    public void dormir(int horas) {
        this.horasDormidas += horas;
        System.out.println(nome + " está dormindo por " + horas + " horas seguidas.");
    }
}
