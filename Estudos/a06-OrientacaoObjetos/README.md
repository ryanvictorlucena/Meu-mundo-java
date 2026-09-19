# OO

Orientação a objeto tem a função de mapear mundo real para o computacional, podendo agrupar variáveis como por exemplo um aluno e suas notas, ou uma pessoa e suas credênciais, todas essas variáveis guardadas em espaços de memória que fazem referência a algo em comum (notas a aluno e credênciais a pessoa).

## Classe

Uma classe é usada para fazer exatamente isso, agrupar dados do mundo real para objetos. A classe pessoa tem atributos como nome, idade e sexo. A classe carro, tem placa, ano e dono.

Cada classe deve ser responsável somente por ela mesma, por exemplo, a classe Estudante só é responsável por ela e a classe Professor só é responsável por ela.

Em uma classe, ao definir variáveis do tipo primitivo, podemos deixar essas variáveis como públicas (public), privadas (private). Estruturadas da seguinte maneira:

    private String nome;
    public int idade;

- Cada atributo de classe é criado e inicializado com valor default ou com o valor passado.

Quando queremos acessar métodos de outra classe(do mesmo pacote) usamos a seguinte estrutura:

    NomeClasse variavel = new NomeClasse();
    Dessa forma que é criado um objeto

## Métodos

Métodos são funções que podem ou não retornar algo. Estrutura:

    public tipoDoRetorno nomeMetodo(tipo parametro parametro) {código que esse método executa}
    (public void setNome(String novoNome){...})

- Tipos de retorno:

        String = retorna uma string;
        int = retorna um inteiro;
        int[] = retorna uma lista de inteiros;
        void = não retorna nada.

- Parâmetros são as variáveis que serão usadas por métodos.
- Métodos gets e sets são usados para acessar e modificar respectivamente, uma determinada variável privada.

O return é uma forma de retornar o resultado de um método não void. Pode ser usado em um método void, mas como um método void não retorna nada não é boa prática. Também é possível retornar o resultado de um método usando um system.out.print();

O return pode ser usado como um break, quando é necessário forçar uma parada de uma execução de um if, por exemplo.

## Construtor

Um construtor não possui uma tipagem.
    Estrutura

    public nomeClasse(parâmetros) {}

Pode existir dois construtores com o mesmo nome, se o tipo de parâmetro for diferente. Uma coisa interessante que acontece e que caso os construtores tenham alguns dos parâmetros parecidos, você pode delegar a respónsabilidade de ficar com os parâmetros parecidos a só um e o outro ganha um this(parâmetros similares) mais os seus parâmetros pessoais.

Ao passar parâmetros no construtor, os dados referêntes a cada atributo presente ali, deve ser atendido. Se eu tenho um construtor com o parâmetro nome, ao inicializar-lo devo passar um nome do mesmo tipo.

No construtor podemos inicializar váriaveis mesmo que as mesmas não sejam parâmetro dele.

Exemplo

    public Estudante(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Estudante(String nome, int idade, char sexo, String cpf) {
        this(nome, idade, sexo);
        this.cpf = cpf;
    }

Quando esse segundo construtor for chamado, ele vai chamar o primeiro que é respónsavel pelos parâmetros que se repetem e depois ele executa seus próprios parâmetros.

## Modificador Static

Usado quando queremos fazer referência a classe em si e não somente a instância. Quando atribuimos um modificador static a uma variável, sempre que modificarmos ela por um método set, por exemplo, todas as instâncias que fazem referência a essa classe serão alteradas e não somente aquela que você referênciou.
Por exemplo, se você inicializa uma váriavel da classe Carro

    private double limiteVelocidade = 300;

isso quer dizer que a cada novo objeto da classe Carro criado o limite de velocidade por default será 300. Mas caso eu queira modificar esse limite para um dos objetos somente ele será alterado enquanto que os outros respeitarão o valor inicializado na váriavel local.

    Carro c1 = new Carro("Mercedes", 275);
    Carro c2 = new Carro("Audi", 290);
    Carro c3 = new Carro("BMW", 280);
    c1.setVelocidadeLim(280);
    c1.imprime();
    c2.imprime();
    c3.imprime();

    //Saída

    -------------------------
    Nome: Mercedes
    Velocidade máxima: 275.0    
    Velocidade limite: 280.0
    -------------------------
    Nome: Audi
    Velocidade máxima: 290.0
    Velocidade limite: 300.0
    -------------------------
    Nome: BMW
    Velocidade máxima: 280.0
    Velocidade limite: 300.0

Por outro lado, se a váriavel for static essa alteração será atribuida a todos os objetos da classe Carro

    private static double limiteVelocidade = 300;

    ...

    //saída

    -------------------------
    Nome: Mercedes
    Velocidade máxima: 275.0
    Velocidade limite: 280.0
    -------------------------
    Nome: Audi
    Velocidade máxima: 290.0
    Velocidade limite: 280.0
    -------------------------
    Nome: BMW
    Velocidade máxima: 280.0
    Velocidade limite: 280.0

Em um método static, não é possível acessar uma váriavel que não seja static, mas o contrário é possível. Isso ocorre por que o método static é criado antes da váriavel não static existir em memória. O mesmo ocorre para blocos de inicialização estáticos.

- Blocos de inicialização estáticos são executados apenas uma vez, quando a JVM carregar a classe. Já blocos de inicialização não estáticos são executados sempre que um novo objeto é criado.

## Associação

É um relacionamento entre dois objetos. Pode existir diferentes tipos de associação, podendo ser

    de 1 para 1;
    de 1 para N;
    de N para 1;
    de N para M;

## Leitura de dados

Usando uma biblioteca chamada scanner é possivel ler dados introduzidos em uma main.

    import.java.util.Scanner;
    assim importa a biblioteca

    Scanner sc = new Scanner(System.in);

Dependendo do tipo do dado a ser lido, existe uma função expecifica, por exemplo

- Para ler um inteiro usamos

    int idade = sc.nextInt();

- Para ler uma String usamos

    //ler uma linha inteira
    String nome = sc.nextLine();

    //ler somente a primeira palavra
    String nome = sc.next();

## Herança

Em uma herança, uma classe pode herdar métodos e atributos de uma outra classe. É usada quando você quer extender a funcionalidade de uma classe mas mantendo um relacionamento.

Usamos extends para indicar que uma classe herda métodos e atributos de outra

    public class filho extends mae {
    }
