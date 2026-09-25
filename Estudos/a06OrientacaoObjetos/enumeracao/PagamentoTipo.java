package enumeracao;

public enum PagamentoTipo {
    DEBITO {
        @Override 
        public double calcularDesconto(double valor) {
            // TODO Auto-generated method stub
            return valor * 0.1;
        }
    }, 
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            // TODO Auto-generated method stub
            return valor * 0.5;
        }
    };

    public abstract double calcularDesconto(double valor);
}
