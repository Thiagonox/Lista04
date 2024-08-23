package main;

import concrete.Cachorro;
import concrete.Gato;
import concrete.Elefante;
import concrete.Leao;
import concrete.Peixe;
import concrete.Pombo;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 5, 0.6, 25.0);
        Gato gato = new Gato("Lisp", 3, 0.3, 4.0);
        Elefante elefante = new Elefante("Dumbo", 10, 3.0, 5000.0);
        Leao leao = new Leao("Simba", 8, 1.2, 200.0);
        Peixe peixe = new Peixe("Nemo", 2, 0.2, 0.5);
        Pombo pombo = new Pombo("Correio", 1, 0.5, 0.4, 0.3);

        cachorro.comer(0.5);
        cachorro.moverse(2);
        cachorro.dormir(8);
        cachorro.exibirEstado();

        System.out.println("--------------------");

        gato.comer(0.2);
        gato.moverse(3);
        gato.dormir(12);
        gato.exibirEstado();

        System.out.println("--------------------");

        elefante.comer(100);
        elefante.moverse(10);
        elefante.dormir(6);
        elefante.exibirEstado();

        System.out.println("--------------------");

        leao.comer(15);
        leao.moverse(5);
        leao.dormir(8);
        leao.exibirEstado();

        System.out.println("--------------------");

        peixe.comer(0.2);
        peixe.nadar(50);
        peixe.dormir(12);
        peixe.exibirEstado();

        System.out.println("--------------------");

        pombo.comer(0.05);
        pombo.voar(20);
        pombo.dormir(10);
        pombo.exibirEstado();

        System.out.println("--------------------");
    }
}
