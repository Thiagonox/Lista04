package concrete;

import abstracts.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {

    public Peixe(String nome, int idade, double altura, double peso) {
        super(nome, "Peixe", idade, "Água", altura, peso);
    }

    @Override
    public void comer(double quantidadeComida) {
        this.quantidadeComidaIngerida += quantidadeComida;
        System.out.println(nome + " está comendo " + quantidadeComida + " kg de algas.");
    }

    @Override
    public void moverse(double distancia) {
        nadar(distancia);
    }

    @Override
    public void dormir(int horas) {
        this.horasDormidas += horas;
        System.out.println(nome + " está descansando no fundo do aquário por " + horas + " horas.");
    }

    @Override
    public void nadar(double distancia) {
        this.distanciaPercorrida += distancia;
        System.out.println(nome + " está nadando " + distancia + " metros.");
    }
}
