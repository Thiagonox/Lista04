package concrete;

import abstracts.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB {

    public Pombo(String nome, int idade, double envergaduraAssa, double altura, double peso) {
        super(nome, "Pombo", idade, "Cidade", 2, envergaduraAssa, altura, peso);
    }

    @Override
    public void comer(double quantidadeComida) {
        this.quantidadeComidaIngerida += quantidadeComida;
        System.out.println(nome + " está comendo " + quantidadeComida + " kg de grãos.");
    }

    @Override
    public void moverse(double distancia) {
        voar(distancia);
    }

    @Override
    public void dormir(int horas) {
        this.horasDormidas += horas;
        System.out.println(nome + " está dormindo por " + horas + " horas no telhado.");
    }

    @Override
    public void voar(double distancia) {
        this.distanciaPercorrida += distancia;
        System.out.println(nome + " está voando " + distancia + " km.");
    }
}
