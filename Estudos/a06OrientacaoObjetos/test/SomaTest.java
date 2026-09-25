package test;
import dominio.Soma;

public class SomaTest {
    public static void main(String[] args) {
        Soma s =  new Soma();
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(s.somaArray(numeros));
        System.out.println(s.somaVarArgs(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        //em varArgs você pode passar os números como parâmetro além de uma lista já definida.
    }
}
