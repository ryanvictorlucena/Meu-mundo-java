package modificadorFinal;

public class Carro {
    private String nome;
    private static final int velocidadeMax = 300;
    private final int numeroPassageiros;
    
    public Carro(String nome) {
        this.nome = nome;
        this.numeroPassageiros = 5;
    }

    public String getNome() {
        return nome;
    }

    public static int getVelocidademax() {
        return velocidadeMax;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }
}
