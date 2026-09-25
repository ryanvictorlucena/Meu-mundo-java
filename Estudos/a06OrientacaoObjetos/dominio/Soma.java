package dominio;

public class Soma {
    
    public int somaArray(int[] numeros) {
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }
        return soma;
    }

    public int somaVarArgs(int... numeros) {
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }
        return soma;
    }
}
