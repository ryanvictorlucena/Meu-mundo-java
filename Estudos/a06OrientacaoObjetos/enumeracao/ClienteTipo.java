package enumeracao;

public enum ClienteTipo {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    private int valor;

    ClienteTipo(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
