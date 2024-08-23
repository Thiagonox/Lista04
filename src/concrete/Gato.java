package concrete;

import abstracts.AnimalTerrestreAB;

public class Gato extends AnimalTerrestreAB {

    public Gato(String nome, int idade, double altura, double peso) {
        super(nome, "Gato", idade, "Doméstico", 4, altura, peso);
    }

    @Override
    public void comer(double quantidadeComida) {
        this.quantidadeComidaIngerida += quantidadeComida;
        System.out.println(nome + " está comendo " + quantidadeComida + " kg de peixe.");
    }

    @Override
    public void moverse(double distancia) {
        this.distanciaPercorrida += distancia;
        System.out.println(nome + " está andando " + distancia + " metros no telhado.");
    }

    @Override
    public void dormir(int horas) {
        this.horasDormidas += horas;
        System.out.println(nome + " está dormindo por " + horas + " horas no sofá.");
    }
}
