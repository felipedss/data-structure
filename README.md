# data-structure

## LinkedList

É um tipo de estrutura de dados que representa uma sequência de <b>nós</b>.

Em uma <b>singly linked list</b> cada nó aponta para o próximo nó na linked list. Ja na <b>double linked list</b> cada nó aponta para o próximo mas também para o nó anterior.

Abaixo o desenho de uma double linked list:

![alt text](./img/double-linked-list.png)

* Tempo constante para inserir e remover itens.
* Ao contrário do array, para acessar um item em determinada posição, o tempo é linear.

## Stack

//...

## Queue

//...

## Tree

### Tree x Binary Tree 

### Binary Tree x Binary Search Tree 

## Recursion and dynamic programming 
### Candidatos
- Implemente um algoritimo para computar os primeiros x...
- Escreva um código para listar os primeiros x...
- Implementa um método para computar todos...

### Abordagens
- Bottom-Up: É frequentemente mais intuitivo, começamos resolvendo o problema como um caso simples, exemplo uma lista de 1 elemento, depois encontramos como resolver para 2 elementos, 3 elementos e assim por diante. A chave aqui é pensar como resolver a solução a partir do caso anterior (ou vários casos anteriores).
- Top-Down: Pode ser mais complexa, mas muitas vezes é a melhor forma de pensar sobre o problema. Aqui nós pensamos como dividir o problema em subproblemas.
- Recursão x Iteração: Recursão pode ser ineficiente pensando em espaço. Cada chamada recursiva adiciona uma nova camada na stack, que significa que o algoritimo usa memória O(n). Por essa razão é melhor fazer um algortimo iterativo. <b>TODOS</b> os algoritimos recursivos podem ser implementados de forma iterativa. Embora algumas vezes o código fique muito mais complexo. (pense nos tradeoffs).
- Dynamic Programming e Memoization: Programação dinamica é na maioria das vezes pegar um algorítimo recursivo e encontrar os subproblemas sobrepostos (ou seja, as chamadas repetidas). Você então faz cache das chamadas para futuras chamadas recursivas.
