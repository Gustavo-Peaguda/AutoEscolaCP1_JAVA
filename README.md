# 🚦 Checkpoint 1 - Sistema de Gestão de Autoescola
**Disciplina:** Domain Driven Design (DDD)  
**Professora:** Damiana Costa

## 👥 Group Members
* **Enzo Fernandes** - RM563705
* **Felipe Cerazi** - RM562746
* **Gustavo Peaguda** - RM562923
* **Lorenzo Coque** - RM563385

---

## 📊 Part 2 - Class Diagram (UML)

O diagrama abaixo representa a arquitetura do sistema, utilizando os padrões oficiais da UML:

* **Dependency:** O `Main` possui dependências (dashed lines) com as classes `Aluno`, `AutoEscola`, `Instrutor` e `Veiculo`, pois as utiliza para instanciar objetos.
* **Aggregation:** A classe `AutoEscola` possui uma agregação com `Aluno` (empty diamond), representando que a escola gerencia um conjunto de alunos.
* **Multiplicity:** Definida como `0..4` para a relação de alunos, conforme a regra de negócio do projeto.

> **Note:** [Insira a imagem do seu diagrama aqui ou anexe-a ao repositório]

---

## 📝 Part 3 - Theoretical Questions

### 1. Classes vs. Objects
A **Classe** funciona como um "molde" ou projeto (blueprint), definindo os atributos (dados) e métodos (comportamentos) que todos os objetos daquele tipo possuirão. No sistema, a classe `Aluno` define a estrutura comum. O **Objeto** é a materialização dessa classe na memória (**instância**). Por exemplo, `aluno1` (Enzo) é um objeto real com estado próprio, criado a partir do molde `Aluno`.

### 2. Object Interaction
* **A) Execution:** Ao executar `aluno1.agendarAulaPratica()`, o Java utiliza a referência do objeto para localizar seu endereço de memória e invoca o comportamento definido no método.
* **B) Modified Attribute:** O atributo modificado é o **`aulasPraticas`**. Isso ocorre porque o método acessa o **estado interno** da instância específica e incrementa seu valor através da lógica de negócio.

### 3. System Logic
O método `realizarExame()` opera como um validador de requisitos mínimos. Ele utiliza uma **estrutura condicional (`if-else`)** combinada com o **operador lógico AND (`&&`)** para verificar se os atributos `aulasTeoricas` e `aulasPraticas` atingiram o valor mínimo exigido (5 aulas). A aprovação (`approved = true`) só é processada se ambos os critérios forem atendidos simultaneamente.

### 4. Diagram Evolution (Electric Bike)
Para adicionar uma "Bicicleta Elétrica", aplicaríamos o conceito de **Herança (Inheritance)**. Criaríamos uma nova classe `BicicletaEletrica` que estende (`extends`) a classe pai `Veiculo`. No diagrama, isso seria representado por uma linha com uma seta de ponta triangular vazia (especialização). A nova classe herdaria automaticamente os atributos `modelo` e `placa`, permitindo adicionar apenas campos específicos, como `autonomiaBateria`, evitando redundância de código.
