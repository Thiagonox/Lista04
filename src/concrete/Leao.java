package concrete;

import abstracts.AnimalTerrestreAB;

public class Leao extends AnimalTerrestreAB {

    public Leao(String nome, int idade, double altura, double peso) {
        super(nome, "Leão", idade, "Savana", 4, altura, peso);
    }

    @Override
    public void comer(double quantidadeComida) {
        this.quantidadeComidaIngerida += quantidadeComida;
        System.out.println(nome + " está comendo " + quantidadeComida + " kg de carne.");
    }

    @Override
    public void moverse(double distancia) {
        this.distanciaPercorrida += distancia;
        System.out.println(nome + " está caçando por " + distancia + " km na savana.");
    }

    @Override
    public void dormir(int horas) {
        this.horasDormidas += horas;
        System.out.println(nome + " está dormindo por " + horas + " horas na sombra.");
    }
}
