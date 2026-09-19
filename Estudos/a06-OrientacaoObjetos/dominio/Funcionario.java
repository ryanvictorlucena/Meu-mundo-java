package dominio;

public class Funcionario {
    
    private String nome;
    private int idade;
    private double[] salarios;

    public void printDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(double n : salarios) {
            System.out.print(n + " ");
        }
    }

    public double mediaSalarios() {
        int media = 0;
        for (double n : this.salarios) {
            media += n;
        }
        return media/salarios.length;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade; 
    }

    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setNome("Fulano");
        f.setIdade(20);
        f.salarios = new double[]{1200, 3000, 2500};
        System.out.println(f.getNome());
        System.out.println(f.getIdade());
        System.out.println(f.mediaSalarios());
    }
}
