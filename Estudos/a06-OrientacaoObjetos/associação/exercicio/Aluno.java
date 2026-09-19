package associação.exercicio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {return this.nome;}
    
    public int getIdade() {return this.idade;}

    public void setIdade(int idade) {this.idade = idade;}

    public Seminario getSeminario() {return this.seminario;}

    public void setSeminario(Seminario seminario) {this.seminario = seminario;}
}
