# Estruturas de repetição

Como o próprio nome diz, é uma estrutura que garante um looping. É muito utilizado quando queremos ter uma contagem por exemplo ou ter varias execuções de alguma coisa.

## While

Uma das funções que permitem um loop. Sua estrutura se da como:

    while(condição de continuação) {
        bloco que entrara em loop
    }

    Também existem variações como o while True e o do While, onde:

    do {
        bloco de execeção do loop
    } while(condição de continuação)

A principal diferença do while pro do while é que o do while executa pelo menos uma vez, mesmo que a condição de continuação do while não seja atendida.

## For

Uma função de loop parecida com o while, a principal diferença é que no for existe uma condição de parada, enquanto que no while existe uma condição de continuação. Sua sitaxe é:

    for (int i = 0; i < k; i++) {
        bloco de execução em loop
    }

Os 3 passos do for:

- int i = 0: Uma declaração de variavel onde a variavel i começa com o valor 0. i representa a o indice que controla o loop do for.

- i < k: k pode receber o valor de qualquer número inteiro. Representa a quantidade de vezes que o for vai ser executado, por exemplo se k = 10, o for vai executar até que i seja igual a 10.

- i++: Representa o incremento de i. O mesmo que i = i + 1.

## Break

Não é um loop, mas é uma maneira de parar a qualquer momento, mesmo se ele ainda puder continuar executando. Só pode ser usado dentro de um loop ou swith.

## Continue

Ao contrário do break que para uma execução, o continue continua, exemplo:

Contar de 20 a 100, mas seu contador começa em 0

    for(;;){
        if (i < 20) continue;
        ...
    }
    Aqui ele vai retornar a partir de 20 e ignorar tudo abaixo.

## Foreach

Um loop usado em arrays:

    for(tipo n: nomeArray){
        ...
    }

Diferente do for tradicional, esse aqui não tem indices, você trabalha diretamente com cada valor que esta dentro do array.
Aqui n representa uma variável que vai receber os valores do array, a cada novo loop ela recebe um novo valor.
A variável nomeArray é um array com os valores que vão ser trabalhados.
