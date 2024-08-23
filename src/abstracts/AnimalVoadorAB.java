package abstracts;

public abstract class AnimalVoadorAB extends AnimalAB {
    protected int quantidadeAssas;
    protected double envergaduraAssa;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadeAssas, double envergaduraAssa, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, 2, altura, peso);
        this.quantidadeAssas = quantidadeAssas;
        this.envergaduraAssa = envergaduraAssa;
    }

    public abstract void voar(double distancia);
}
