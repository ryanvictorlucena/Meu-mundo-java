package modificadorEstatico;

public class Carro {
    private String nome;
    private double velocidadeMax;
    private double velocidadeLim = 300;

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public void imprime() {
        System.out.println("-------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade máxima: " + this.velocidadeMax);
        System.out.println("Velocidade limite: " + this.velocidadeLim);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return this.velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public double getVelocidadeLim() {
        return this.velocidadeLim;
    }

    public void setVelocidadeLim(double velocidadeLim) {
        this.velocidadeLim = velocidadeLim;
    }

    public static void main(String[] args) {
        Carro c1 = new Carro("Mercedes", 275);
        Carro c2 = new Carro("Audi", 290);
        Carro c3 = new Carro("BMW", 280);
        c1.setVelocidadeLim(280);
        c1.imprime();
        c2.imprime();
        c3.imprime();
        /*System.out.println(Carro.velocidadeLim);
        Carro.velocidadeLim = 280;
        System.out.println(Carro.velocidadeLim); */

    }
}
