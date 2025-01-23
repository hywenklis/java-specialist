# Object-Oriented Programming (OOP)

A pasta **`ObjectOrientedProgramming`** contém exemplos práticos para explorar os conceitos fundamentais de programação orientada a objetos (POO) em Java, como classes, composição, criação de objetos e acesso a atributos. POO é um paradigma de programação que organiza o código em torno de "objetos"—instâncias de classes que encapsulam dados e comportamentos relacionados. Essa abordagem oferece benefícios como maior modularidade, reutilização de código e facilidade na manutenção de aplicações complexas, tornando-a amplamente adotada na indústria.

---

## 📘 Estrutura e Conceitos

1. **[Classs](Classs)**
    - Apresenta como criar e instanciar classes e objetos em Java, explicando o papel central de classes como modelos para objetos e de objetos como instâncias que encapsulam dados e comportamentos. Inclui conceitos como encapsulamento, que protege os dados internos de acesso direto, e abstração, que simplifica a complexidade ao expor apenas os detalhes essenciais.

   **Arquivos:**
    - `Car.java`
    - `Main.java`

   **Conceitos abordados:**
    - Definição de classes com atributos.
    - Instanciação de objetos.
    - Impressão de valores dos atributos de um objeto.

   **Exemplo:**
   ```java
   Car myCar = new Car();
   myCar.manufacturer = "Honda";
   myCar.model = "HR-V";
   System.out.printf("Model: %s\n", myCar.model);
   ```

---

2. **[Composition](Composition)**
    - Introduz o conceito de composição, onde uma classe pode conter outras classes como parte de sua estrutura. Por exemplo, no mundo real, um 'Carro' pode ser composto por um 'Motor', ilustrando como objetos podem ser utilizados como atributos de outros objetos para representar relações "tem-um". Esse conceito é essencial para criar sistemas modulares e reutilizáveis.

   **Arquivos:**
    - `Car.java`
    - `Person.java`
    - `Main.java`

   **Conceitos abordados:**
    - Composição de classes.
    - Relacionamento "tem-um" entre objetos.
    - Atribuição de um objeto como atributo de outro.

   **Exemplo:**
   ```java
   Person owner = new Person();
   owner.name = "João";

   Car car = new Car();
   car.owner = owner;
   System.out.println("Owner: " + car.owner.name);
   ```

---

3. **[InstantiatingObjectsAccessingAttributes](challenge/InstantiatingObjectsAccessingAttributes)**
    - Explora como instanciar múltiplos objetos e acessar seus atributos, abordando a diferença entre instâncias únicas e múltiplas. Discute também o impacto no gerenciamento de memória ao criar diversas instâncias, destacando como essa prática pode influenciar o desempenho e a eficiência do programa.

   **Arquivos:**
    - `Dog.java`
    - `Main.java`

   **Conceitos abordados:**
    - Criação e manipulação de múltiplos objetos.
    - Utilização de atributos para armazenar informações específicas de cada instância.

   **Exemplo:**
   ```java
   Dog dog1 = new Dog();
   dog1.name = "Rex";
   dog1.age = 3;
   System.out.println("Dog Name: " + dog1.name + ", Age: " + dog1.age);
   ```
---