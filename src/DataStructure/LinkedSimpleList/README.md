# Data Structures - Linked Simple List

Esta seção contém uma implementação prática de uma lista simplesmente ligada. O objetivo é entender como funcionam as estruturas de dados dinâmicas em Java, explorando conceitos como nós, apontadores e manipulação de listas.

## 📚 O que é uma Lista Simplesmente Ligada?
Uma lista simplesmente ligada (ou singly linked list) é uma estrutura de dados linear onde cada elemento (chamado de nó) contém:
1. Um valor ou conteúdo.
2. Um ponteiro ou referência para o próximo nó na lista.

Características principais:
- Dinâmica: Diferente de arrays, as listas encadeadas não possuem um tamanho fixo. Isso significa que você pode adicionar ou remover elementos conforme necessário, sem necessidade de redimensionar a estrutura.
- Não sequencial em memória: Os nós não estão armazenados em locais contíguos de memória, mas conectados por meio de referências (ponteiros).
- Operações eficientes: Inserções e exclusões são rápidas, desde que você tenha o nó correto para operar. Não é necessário deslocar elementos, como ocorre em arrays.

Quando usar listas simplesmente ligadas?
- Quando o tamanho dos dados varia frequentemente.
- Para evitar problemas de redimensionamento que podem ocorrer ao usar arrays.
- Quando as operações de inserção e remoção são mais frequentes do que as de acesso aleatório.

## 📘 Arquivos e Funções

1. **[Baggage.java](Baggage.java)**:  
   Classe que representa uma bagagem com `code` (código identificador) e `weight` (peso).

2. **[LinkedList.java](LinkedList.java)**:  
   Implementação da estrutura de lista simplesmente ligada. Inclui:
    - Método para verificar se a lista está vazia.
    - Adicionar um novo nó à lista.
    - Calcular o peso total das bagagens.
    - Imprimir o conteúdo da lista.

3. **[Nodo.java](Nodo.java)**:  
   Representa um nó da lista, contendo:
    - Um objeto `Baggage` como conteúdo.
    - Uma referência para o próximo nó.

4. **[AirportTest.java](AirportTest.java)**:  
   Classe de teste que demonstra:
    - Criação de uma lista vazia.
    - Adição de bagagens.
    - Impressão da lista e cálculo do peso total.

---

## 📝 Notas Importantes

### Estrutura da Lista Simplesmente Ligada

- Cada nó armazena dois elementos:
    1. O conteúdo (no caso, uma instância de `Baggage`).
    2. Uma referência para o próximo nó.

- A lista começa com o nó inicial (`Beginning`) e percorre os nós até encontrar `null`, que indica o final da lista.

### Exemplo de Uso

#### Adicionar Bagagens:
```java
LinkedList list = new LinkedList();
list.newBaggage(new Baggage("001", 10));
list.newBaggage(new Baggage("002", 15));
```

#### Imprimir Lista:

```java
list.printList();
```
#### Calcular Peso Total:
```java
System.out.println("Peso total: " + list.totalWeight());
```

#### Saída do Teste:
```java
Inicio da Lista
Posição: 0 005 -> 30 -> 004 -> 20 -> 003 -> 25 -> 002 -> 15 -> 001 -> 10 -> null
Posição: 1 004 -> 20 -> 003 -> 25 -> 002 -> 15 -> 001 -> 10 -> null
Posição: 2 003 -> 25 -> 002 -> 15 -> 001 -> 10 -> null
Posição: 3 002 -> 15 -> 001 -> 10 -> null
Posição: 4 001 -> 10 -> null
Final da Lista
Peso total: 100
```