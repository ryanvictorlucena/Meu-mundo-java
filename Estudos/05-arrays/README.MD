# Arrays são listas do tipo reference que podem guardar valores de todos os tipos, e até mesmo outras listas. Cada espaço dentro de um array é representado por um indice e é por esses indices que podemos adicionar, acessar ou remover o conteúdo que está la dentro. Os indices vão de 0 a k-1, onde k é o tamanho máximo do array.

Formas de declarar um array:
- tipo[] nomeReferencia = null; (somente variáveis do tipo referência e strings podem iniciar com null)
    Ao declarar um array, a quantidade de espaço que ele tera deve ser definido na inicialização ou ser null.
    int[] caixa = new int[k]; (onde k pode ser qualquer inteiro)
    
    Outra forma seria colocar os valores diretamente
    int[] numeros = {1, 2, 3, 4, 5};
    mas, se considerarmos uma quantidade muito grande de números, fazer dessa maneira não é interessante.

Cada caixinha referente a cada indice ao ser inicializada tem um valor definido, para inteiros é 0 e para strings é null.

- Adição em um array: Você precisa dizer o indice no qual você quer adicionar um determinado valor (do tipo do array). Sempre que você adiciona um novo valor a uma posição do array, na verdade você so está sustituindo um valor que já estava la.
    nomeLista[i] = valor; (i = indice/posição inteiro)

- Remoção: Aqui você não remove realmente o valor, não é possivel. Então para representar uma remoção, o valor daquela determinada posição é substituido pelo valor default, ou seja, null para string e 0 para inteiro.
    intList[i] = 0;
    stringList[i] = null;

- length: Uma função que retorna o tamanho total do array. Observação -> Os indices de um array começam em 0, então ao retornar o ultimo indice de um array de tamanho 10, o valor retornado sera 9. O length retorna exatamente o tamanho 10.