package associação.exercicio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public String getTitulo() {return this.titulo;}
    
    public void setTitulo(String titulo) {this.titulo = titulo;}
    
    public Aluno[] getAlunos() {return this.alunos;}

    public void setAlunos(Aluno[] alunos) {this.alunos = alunos;}
    
    public Local getLocal() {return this.local;}

    public void setLocal(Local local) {this.local = local;}
    
    public void imprimeAlunos() {
        for (Aluno x : alunos) {
            System.out.println("Aluno: " + x);
        }
    }
}
