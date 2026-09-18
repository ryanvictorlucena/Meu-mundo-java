public class Professor {
    private String nome;
    private int idade;
    private char sexo;

    public Professor(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {return this.nome;}
    public int getidade() {return this.idade;}
    public char getSexo() {return this.sexo;}
}
