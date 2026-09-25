# Modificador Final

## Tipo Primitivo

Atributos podem ser modificados, mas se você definir uma variável do tipo primitivo com o modificador final esse atributo vai receber um único valor constante ao ser inicializado, ou seja, único e imutável.

Quando o modificador final é acompanhado de um static (static final) a inicialização deve acontecer na própria declaração.

    private static final double velocidadeMax = 300;

Caso só tenha o modificador final, pode ser inicializado no construtor ou no bloco de inicialização.

    private final double velocidadeMax;

    public Carro() {
        velocidadeMax = 300;
    }

## Tipo Referência

Em objetos, o final impede que a referência seja alterada, mas os atributos internos do objeto anda podem ser modificados, a menos que também sejam final. Em resumo, aqui você não pode alterar a referência ao objeto.

## Final em Classes e Métodos

Se uma classe for final, ela não pode ser extendida e consequentemente não terá nenhum acesso a sobrescrita dos métodos. Logo, se um método for definido como final, esse metodo não poderá ser sobrescrito.
