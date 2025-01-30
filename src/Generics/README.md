# Generics em Java

A pasta **`Generics`** contém exemplos práticos para explorar o conceito de Generics em Java. Generics permitem a
criação de classes, interfaces e métodos parametrizados por tipo, promovendo **type safety** e evitando **erros em tempo
de execução**, já que os problemas de tipos são detectados **em tempo de compilação**. Isso torna o código mais
reutilizável, seguro e expressivo.

---

## 📘 Estrutura e Conceitos

### 1. [ListOfArgumentsWithVarargs](ListOfArgumentsWithVarargs)

- Explora o uso de **varargs** com e sem Generics para manipulação de listas de argumentos de tamanho variável.
- **Arquivos:**
    - [`TodoListVA.java`](ListOfArgumentsWithVarargs/TodoListVA.java)
    - [`TodoListWithoutVarArgs.java`](ListOfArgumentsWithVarargs/TodoListWithoutVarArgs.java)

📌 **Conceitos abordados:**

- Uso de **varargs** (`...`) para passar múltiplos argumentos de um tipo genérico.
- Como Generics tornam o código mais seguro e evitam `ClassCastException`.

---

### 2. [Method](Method)

- Apresenta métodos genéricos e métodos sem Generics, demonstrando a diferença entre eles.
- **Arquivo:**
    - [`ArrayUtilsWithoutGenerics.java`](Method/ArrayUtilsWithoutGenerics.java)

📌 **Conceitos abordados:**

- Métodos genéricos com `<T>`.
- Benefícios de usar Generics em comparação com arrays sem tipagem forte.

---

### 3. [UsingExample](UsingExample)

- Implementa uma estrutura de lista com e sem Generics.
- **Arquivos:**
    - [`List.java`](UsingExample/List.java)
    - [`ListWithoutGenerics.java`](UsingExample/ListWithoutGenerics.java)

📌 **Conceitos abordados:**

- Diferença entre **Listas Genéricas** e **Listas sem Generics**.
- Como evitar `ClassCastException` e a necessidade de conversões explícitas de tipo.

---

### 4. [WildcardTypes](WildcardTypes)

- Explica o uso de wildcards (`?`), destacando suas variações.
- **Arquivos:**
    - [`LowerBoundedWildcard.java`](WildcardTypes/LowerBoundedWildcard.java)
    - [`UnboundedWildcard.java`](WildcardTypes/UnboundedWildcard.java)
    - [`UpperBoundedWildcard.java`](WildcardTypes/UpperBoundedWildcard.java)

📌 **Conceitos abordados:**

- **Upper Bounded Wildcard (`? extends T`)** → Permite leitura de tipos desconhecidos que são subtipos de `T`.
- **Lower Bounded Wildcard (`? super T`)** → Permite escrita de tipos desconhecidos que são supertipos de `T`.
- **Unbounded Wildcard (`?`)** → **Evite o uso** em código real, pois aceita qualquer tipo, perdendo o benefício de *
  *type safety**.

---

### 5. [Wildcards](Wildcards)

- Demonstra o uso de Generics com hierarquia de classes e wildcards.
- **Arquivos:**
    - [`Animal.java`](Wildcards/Animal.java)
    - [`Cat.java`](/Wildcards/Cat.java)
    - [`Dog.java`](Wildcards/Dog.java)
    - [`GenericsWithWildcard.java`](Wildcards/GenericsWithWildcard.java)
    - [`GenericsWithoutWildcard.java`](Wildcards/GenericsWithoutWildcard.java)

📌 **Conceitos abordados:**

- Diferença entre **uso correto e incorreto de wildcards**.
- Exemplo prático com classes **`Animal`**, **`Dog`** e **`Cat`**, ilustrando a flexibilidade e limitações de Generics.

---

## 🔥 Benefícios dos Generics

- ✅ **Type Safety:** Erros de tipo são detectados em tempo de compilação, evitando `ClassCastException`.
- ✅ **Reutilização de Código:** Classes e métodos genéricos podem ser aplicados a diferentes tipos sem precisar de
  duplicação.
- ✅ **Melhor legibilidade e manutenção:** Código mais expressivo e fácil de entender.

- ⚠️ **Evite o uso de `?` (Unbounded Wildcard)**, pois ele **aceita qualquer tipo e perde o benefício de type safety**.
