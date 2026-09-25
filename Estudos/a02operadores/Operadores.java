public class Operadores {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        System.out.println(number2 / number1);

        // relacionais

        int resto = 21 % 7;
        System.out.println(resto);

        // Logicos

        double nota = 7;
        String matricula = "0";
        boolean resultado = nota >= 7 && matricula != "";

        double dinheiro = 100;
        boolean cupom = true;
        boolean resultado2 = dinheiro >= 200 || cupom == true;
        System.out.println(resultado2);
    }
}
