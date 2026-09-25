package heranca;

public class Test {
    public static void main(String[] args) {
        Endereco e = new Endereco("Rua dos desejos", "22222-000");
        Funcionario f = new Funcionario(2000);
        f.setNome("Luffy");
        f.setCpf("111111111-11");
        f.setEndereco(e);
        f.setSalario(3000);
        System.out.println("\n---------------\n");
        f.imprime();
    }

}
