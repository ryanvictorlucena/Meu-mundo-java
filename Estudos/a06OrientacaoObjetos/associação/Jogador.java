package associação;

public class Jogador {

    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
    }

    public Time getTime() {return this.time;}

    public void setTime(Time time) {this.time = time;}

    public String getNome() {return this.nome;}

    public void serNome(String nome) {this.nome = nome;}
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Lionel Messi");
        Jogador j2 = new Jogador("Cristiano Ronaldo");
        Jogador j3 = new Jogador("Neymar Jr");
        Jogador jogadores[] =  {j1, j2, j3};
        for (Jogador j : jogadores) {
            j.imprime();
        }
       /*Jogador j1 = new Jogador("Arrascaeta");
       Time t = new Time("Flamengo");
       j1.imprime(); */
    }
}
