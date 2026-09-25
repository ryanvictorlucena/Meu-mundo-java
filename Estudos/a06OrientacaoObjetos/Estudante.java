public class Estudante {
    private String nome;
    private int idade;
    private char sexo;
    private String cpf;

    public Estudante(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Estudante(String nome, int idade, char sexo, String cpf) {
    //quando esse construtor for chamado, ele vai chamar o outro que é respónsavel pelos parâmetros que se repetem e depois ele executa seus próprios parâmetros.
        this(nome, idade, sexo);
        this.cpf = cpf;
    }

    public String getNome() {return this.nome;}
    public int getIdade() {return this.idade;}
    public char getSexo() {return this.sexo;}
    public String getCpf() {return this.cpf;}
    public String toString() {
        return this.nome + " " + this.idade + " " + this.sexo + " " + this.cpf;
    }

    public static void main(String[] args) {
        Estudante e = new Estudante("Fulano", 21, 'M', "111111111-11");
        System.out.println(e.toString());
    }
}
