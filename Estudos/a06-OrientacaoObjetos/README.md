# OO

Orientação a objeto tem a função de mapear mundo real para o computacional, podendo agrupar variáveis como por exemplo um aluno e suas notas, ou uma pessoa e suas credênciais, todas essas variáveis guardadas em espaços de memória que fazem referência a algo em comum (notas a aluno e credênciais a pessoa).

Uma classe é usada para fazer exatamente isso, agrupar dados do mundo real para objetos. A classe pessoa tem atributos como nome, idade e sexo. A classe carro, tem placa, ano e dono.

Cada classe deve ser responsável somente por ela mesma, por exemplo, a classe Estudante só é responsável por ela e a classe Professor só é responsável por ela.

Em uma classe, ao definir variáveis do tipo primitivo, podemos deixar essas variáveis como públicas (public), privadas (private). Estruturadas da seguinte maneira:
    private String nome;
    public int idade;

Quando queremos acessar métodos de outra classe(do mesmo pacote) usamos a seguinte estrutura:
    NomeClasse variavel = new NomeClasse();
