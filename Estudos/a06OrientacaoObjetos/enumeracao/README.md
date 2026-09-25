# Enumeração

Para resolver o problema de inconsistência de dados, podemos limitar as opções de aceite para definir Strings usaveis para uma determinada situação. Fazemos isso usando um tipo de classe especial de java, a classe enum, que define um conjuto fixo de constantes nomeadas.

    public enum ClienteTipo {
        PESSOA_FISICA,
        PESSOA_JURIDICA   
    }

Em enum, não existe tipo String, essa classe define opções válidas para determinado uso.

## Construtores e Atributos

Uma classe do tipo enum possui um construtor "escondido" que sempre inicializa automaticamente os tipos criados. Contudo, podemos agregar numerações a esses tipos se criarmos um construtor passando o tipo (nesse caso int) como parâmetro.

    public enum ClienteTipo {
        PESSOA_FISICA(1),
        PESSOA_JURIDICA(2);

        private int valor;

        ClienteTipo(int valor) {
            this.valor = valor;
        } 
    }

Observação: Os atributos criados em uma classe do tipo enum nunca podem ir acima dos tipos, sempre devem ser criados abaixo deles.

## Sobrescrita de Métodos

Quando você cria um método que depende dos tipos, por exemplo na classe Pagamento, o valor do pagamento vai depender se você vai pagar no crédito ou no debito.

    pubslic enum PagamentoTipo {
        DEBITO {
            @Override 
            public double calcularDesconto(double valor) {
            return valor * 0.1;
            }
        }, 
        CREDITO {
            @Override
            public double calcularDesconto(double valor) {
            return valor * 0.5;
            }
        };

        public abstract double calcularDesconto(double valor);
    }

Quando você diz que um método é abstrato, ele não pode possuir um corpo, ele é um método criado para ser sobrescrito.
