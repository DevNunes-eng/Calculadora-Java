# 🧮 Calculadora Java: Evolução para Programação Funcional

Este projeto é uma evolução de uma calculadora simples em Java, agora reimplementada utilizando conceitos avançados de **Programação Funcional**, **Java Streams API** e o **Strategy Pattern** através de Enums.

## 💡 A Inovação do Projeto

Diferente de calculadoras tradicionais que realizam operações apenas entre dois números ($a$ e $b$), esta versão foi projetada para ser **n-ária**. 

### O que mudou?
* **Processamento em Lote:** Agora é possível inserir uma lista de números (ex: `10, 20, 30, 40`) e a calculadora processará todos de uma vez utilizando o método `reduce`.
* **Desacoplamento:** A lógica matemática não está mais "espalhada" no código principal. Ela foi encapsulada em uma **Interface Funcional** (`Calculate`) e implementada de forma concisa dentro de um **Enum** (`Operation`).
* **Uso de Lambdas:** As operações são definidas como expressões lambda, tornando o código mais limpo e fácil de manter.

## 📂 Fluxo de Trabalho (Git)

Em vez de criar um novo repositório, esta evolução foi desenvolvida em uma **nova branch**. 
> Isso demonstra a aplicação de boas práticas de versionamento, permitindo comparar a evolução do código antigo com a nova arquitetura funcional sem perder o histórico do projeto.

---

## 🛠️ Tecnologias e Recursos Utilizados

* **Java 17+**
* **Java Streams API:** Uso de `LongStream` para manipulação eficiente de arrays.
* **Interfaces Funcionais:** Criação da interface `@FunctionalInterface Calculate`.
* **Expressões Lambda:** Para definição das operações matemáticas.
* **Scanner & Arrays:** Para entrada e tratamento dinâmico de dados.

---

## 🏗️ Arquitetura do Código

O projeto está dividido em três pilares principais:

1.  **`Calculate.java` (Interface):** Define o contrato funcional para as operações.
2.  **`Operation.java` (Enum):** Onde a mágica acontece. Cada constante (SOMA, SUBTRACAO, etc.) recebe uma implementação lambda específica e um símbolo visual.
3.  **`Main.java`:** Gerencia a entrada do usuário, faz o parse dos dados e invoca a operação selecionada.

### Exemplo de Implementação:
```java
MULTIPLICACAO(lista -> LongStream.of(lista).reduce((long n1, long n2) -> n1 * n2).orElse(0L), "X")
