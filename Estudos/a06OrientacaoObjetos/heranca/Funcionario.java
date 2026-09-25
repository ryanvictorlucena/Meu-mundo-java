package heranca;
public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(double salario) {
        this.salario = salario;
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }
    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
