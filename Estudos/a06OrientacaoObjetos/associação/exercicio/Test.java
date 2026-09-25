package associação.exercicio;

public class Test {
    public static void main(String[] args) {
        Local local = new Local("Rua São Pedro");
        Aluno aluno = new Aluno("Saitama", 22);
        Professor professor = new Professor("Jiraya Sensei", "Ninjutsu");
        Aluno[] alunos = {aluno};
        Seminario seminario = new Seminario("Aprendendo a arte do ninjutsu", local, alunos);
        Seminario[] seminariosDisp = {seminario};
        professor.setSeminarios(seminariosDisp);
        professor.imprimeSeminarios();
    }
}
