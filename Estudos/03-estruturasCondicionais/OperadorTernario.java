public class OperadorTernario {
     public static void main(String[] args) {
        double valor = 99;
        String mensagemTrue = "Vou comprar esse jogo.";
        String mensagemFalse = "Não tenho o suficiente, vou juntar e comprar depois.";

        String resultado = (valor >= 100) ? mensagemTrue : mensagemFalse;
        System.out.println(resultado);
     }
}
