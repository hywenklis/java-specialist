# Fundamentals of Language

Esta pasta contém exemplos práticos para ajudar a compreender fundamentos da linguagem Java, incluindo operadores
aritméticos, entrada de dados, conversão de tipos e manipulação de variáveis.

## 📘 Arquivos e Conceitos

1. **[ArithmeticPromotion.java](ArithmeticPromotion.java)**  
   Demonstra o uso da promoção aritmética em cálculos com tipos diferentes.
    - **Conceito**: A promoção aritmética acontece quando diferentes tipos de dados são usados em uma expressão. Nesse
      exemplo, os valores inteiros são automaticamente promovidos para `float` ao realizar a divisão.
    - **Exemplo**:
      ```java
      final float ageAverage = (agePerson1 + agePerson2 + agePerson3) / NUMBER_OF_PERSONS;
      ```
      O resultado da divisão será um valor de ponto flutuante (`float`), pois a constante `NUMBER_OF_PERSONS` é um
      `float`.

2. **[DataInput.java](DataInput.java)**  
   Aborda a **entrada de dados** usando a classe `Scanner` e realiza cálculos simples para gerar uma folha de pagamento.
    - **Conceito**: O programa solicita informações ao usuário, como nome, taxa horária, horas trabalhadas e descontos.
      Depois, calcula o salário total e o valor devido.
    - **Destaques**:
        - Uso de `nextLine()`, `nextDouble()` e `nextInt()` para diferentes tipos de entrada.
        - Formatação de saída com `printf()`:
          ```java
          System.out.printf("%d Horas x $%.2f = $%.2f%n", hoursWorked, hourlyRate, totalWages);
          ```

3. **[primitiveTypesConversion.java](primitiveTypesConversion.java)**  
   Mostra como realizar conversões explícitas (casting) entre tipos primitivos.
    - **Conceito**: A conversão explícita é usada para alterar o tipo de um valor. No exemplo, a soma de dois `double` é
      convertida para `int`, truncando os valores decimais.
    - **Exemplo**:
      ```java
      int totalWeightOfLoads = (int) (weightOfLoad1 + weightOfLoad2);
      ```
      Isso resulta na perda da parte decimal, deixando apenas a parte inteira.

4. **[VariablesArithmeticOperators.java](VariablesArithmeticOperators.java)**  
   Explica como usar operadores aritméticos básicos (+, -, *, /) em Java.
    - **Conceito**: O exemplo calcula a média de vendas de três produtos e demonstra o uso de constantes (`final`) para
      valores fixos.
    - **Exemplo**:
      ```java
      final double media = total / NUMBER_OF_PRODUCTS_SOLD;
      ```
      Esse cálculo utiliza a divisão para encontrar a média de valores.

---

## 📝 Notas Importantes

### 1. **Operadores Aritméticos em Java**

Os operadores aritméticos são usados para realizar cálculos matemáticos básicos.

- **Adição**: `+`
- **Subtração**: `-`
- **Multiplicação**: `*`
- **Divisão**: `/`
- **Módulo** (resto da divisão): `%`

Exemplo:

   ```java
   int a = 10;
int b = 3;
   System.out.

println("Divisão: "+(a /b));  // Resultado: 3
    System.out.

println("Módulo: "+(a %b));  // Resultado: 1
   ```

### 2. **Entrada de Dados com `Scanner`**

A classe `Scanner` é usada para capturar entradas do usuário no console.  
Métodos mais comuns:

- `nextLine()`: Lê uma linha inteira como `String`.
- `nextInt()`: Lê um número inteiro.
- `nextDouble()`: Lê um número decimal (`double`).

Exemplo:

   ```java
   Scanner scanner = new Scanner(System.in);
   System.out.

println("Digite um número:");

int numero = scanner.nextInt();
   System.out.

println("Você digitou: "+numero);
   ```

### 3. **Conversão de Tipos Primitivos**

Em Java, é possível realizar conversões entre tipos primitivos de forma:

- **Implícita** (automática): Quando não há perda de dados.
- **Explícita** (casting): Quando há possibilidade de perda de dados.

Exemplo de conversão explícita:

   ```java
   double valor = 9.7;
int inteiro = (int) valor;  // Resultado: 9
   ```

### 4. **Uso de `final`**

A palavra-chave `final` é usada para declarar constantes, ou seja, variáveis cujo valor não pode ser alterado após a
inicialização.  
Benefícios:

- Torna o código mais legível e fácil de manter.
- Evita alterações acidentais nos valores.

---

## 🔧 Exemplos de Execução

### **ArithmeticPromotion.java**

Saída:

```plaintext
Idade média: 43.333332
```

### **DataInput.java**

Entrada (exemplo):

```plaintext
Nome: João
Taxa horária: 50
Horas trabalhadas: 8
Valor do desconto: 20
```

Saída:

```plaintext
Folha de pagamento: João
8 Horas x $50.00 = $400.00
Discontos: $20.00
Total devido: $380.00
```

### **primitiveTypesConversion.java**

Saída:

```plaintext
Peso total das cargas: 1883
```

### **VariablesArithmeticOperators.java**

Saída:

```plaintext
50.0
```

---