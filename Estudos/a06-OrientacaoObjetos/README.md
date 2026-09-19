# OO

Orientação a objeto tem a função de mapear mundo real para o computacional, podendo agrupar variáveis como por exemplo um aluno e suas notas, ou uma pessoa e suas credênciais, todas essas variáveis guardadas em espaços de memória que fazem referência a algo em comum (notas a aluno e credênciais a pessoa).

## Classe

Uma classe é usada para fazer exatamente isso, agrupar dados do mundo real para objetos. A classe pessoa tem atributos como nome, idade e sexo. A classe carro, tem placa, ano e dono.

Cada classe deve ser responsável somente por ela mesma, por exemplo, a classe Estudante só é responsável por ela e a classe Professor só é responsável por ela.

Em uma classe, ao definir variáveis do tipo primitivo, podemos deixar essas variáveis como públicas (public), privadas (private). Estruturadas da seguinte maneira:
    private String nome;
    public int idade;
Cada atributo de classe é criado e inicializado com valor default ou com o valor passado.

Quando queremos acessar métodos de outra classe(do mesmo pacote) usamos a seguinte estrutura:
    NomeClasse variavel = new NomeClasse();
    //assim que é criado um objeto

## Métodos

Métodos são funções que podem ou não retornar algo. Estrutura:
    public tipoDoRetorno nomeMetodo(tipo parametro parametro) {código que esse método executa}
    (public void setNome(String novoNome){...})

Tipos de retorno:
    String = retorna uma string;
    int = retorna um inteiro;
    int[] = retorna uma lista de inteiros;
    void = não retorna nada.

Parâmetros são as variáveis que serão usadas por métodos.

O return é uma forma de retornar o resultado de um método não void. Pode ser usado em um método void, mas como um método void não retorna nada não é boa prática. Também é possível retornar o resultado de um método usando um system.out.print();
O return pode ser usado como um break, quando é necessário forçar uma parada de uma execução de um if, por exemplo.

Métodos gets e sets são usados para acessar e modificar respectivamente, uma determinada variável privada.

## Construtor

Um construtor não possui uma tipagem.
    Estrutura -> public nomeClasse(parâmetros) {}
Pode existir dois construtores com o mesmo nome, se o tipo de parâmetro for diferente. Uma coisa interessante que acontece e que caso os construtores tenham alguns dos parâmetros parecidos, você pode delegar a respónsabilidade de ficar com os parâmetros parecidos a só um e o outro ganha um this(parâmetros similares) mais os seus parâmetros pessoais. Ao passar parâmetros no construtor, os dados referêntes a cada atributo presente ali, deve ser atendido.
Se eu tenho um construtor com o parâmetro nome, ao inicializar-lo devo passar um nome do mesmo tipo.
No construtor podemos inicializar váriaveis mesmo que as mesmas não sejam parâmetro dele.
