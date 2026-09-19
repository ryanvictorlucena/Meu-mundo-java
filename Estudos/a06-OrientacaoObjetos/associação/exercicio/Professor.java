package associação.exercicio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome,  String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public String getNome() {return this.nome;}

    public String getEspecialidade() {return this.especialidade;}

    public void setEspecialidade(String especialidade) {this.especialidade = especialidade;}

    public void setSeminarios(Seminario[] seminario) {
        this.seminarios = seminario;
    }

    public void imprimeSeminarios() {
        System.out.println("---------------");
        System.out.println("Professor: " + this.nome);
        if (this.seminarios != null) {
            System.err.println("## Seminario ##");
            for(Seminario s : seminarios) {
                System.out.println(s.getTitulo());
                System.out.println(s.getLocal().getEndereco());
                if (s.getAlunos() != null) {
                    System.out.println("---Alunos---");
                    for (Aluno a : s.getAlunos()) {
                        System.out.println("Aluno: " + a.getNome() + " Idade: " + a.getIdade());
                    }
                }
            }
        }
    }
}
