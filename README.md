# 🧮 Calculadora Java (Enum & BigDecimal)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)

Projeto focado em demonstrar o uso de **Programação Funcional** em Java, utilizando `Enums` para encapsular lógica de negócio e `BigDecimal` para garantir precisão aritmética absoluta.

## 🛠️ Funcionalidades

* **Operações Básicas:** Suporte completo para Soma, Subtração, Multiplicação e Divisão.
* **Segurança de Arredondamento:** Implementação de `RoundingMode.HALF_UP` na divisão para evitar erros de dízimas periódicas ou precisão de ponto flutuante.
* **UX no Terminal:** Fluxo de controle inteligente que permite ao usuário digitar `"voltar"` a qualquer momento para retornar ao menu principal sem encerrar a aplicação.

## 📁 Estrutura do Projeto

O projeto segue uma organização simples e modular:
* `MainEnumBigDecimal.java`: Responsável pela interface com o usuário (CLI), entrada de dados via `Scanner` e fluxo de repetição do programa.
* `OperationEnumBigDecimal.java`: O "core" da aplicação. Utiliza `BiFunction` para definir a lógica de cada operação aritmética diretamente dentro das constantes do Enum.

## 💻 Como Executar

Para rodar este projeto localmente, siga os passos abaixo:

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/DevNunes-eng/Calculadora-Java.git](https://github.com/DevNunes-eng/Calculadora-Java.git)
    ```
2.  **Compile os arquivos:**
    ```bash
    javac Enumeration/*.java
    ```
3.  **Inicie a aplicação:**
    ```bash
    java Enumeration.MainEnumBigDecimal
    ```

## 🛡️ Gestão de Repositório (Boas Práticas)

Este projeto utiliza um arquivo `.gitignore` configurado especificamente para o ecossistema Java e a IDE **IntelliJ IDEA**. 

### Por que isso é importante?
Para manter um repositório profissional, evitamos subir arquivos que não pertencem ao código-fonte, como:
* `.idea/`: Configurações pessoais do IntelliJ (que podem conflitar com outros desenvolvedores).
* `*.class`: Arquivos compilados (o Git deve rastrear o código, não o binário gerado).
* `out/` ou `target/`: Pastas de build geradas automaticamente pela IDE.

Isso garante que o histórico de commits permaneça limpo e focado apenas na evolução do código.

---
Desenvolvido por **Matheus Nunes** (DevNunes-eng) 🎓
