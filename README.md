# 🖩 Java Calculator - Branch: novasatualizações3

Este repositório contém a evolução da calculadora Java, focada em precisão matemática e processamento de dados moderno. Esta versão específica, integrada na branch `novasatualizações2`, introduz a migração completa para `BigDecimal` e o uso extensivo de `Java Streams`.

---

## 📢 Atualização Recente (Branch: `novasatualizações3`)

Diferente das versões iniciais que utilizavam tipos primitivos (`long`, `double`), esta atualização foca na **estabilidade do backend** e na **exatidão dos cálculos**. 

### O que mudou?
* **Migração para BigDecimal:** Substituição de tipos numéricos simples para evitar erros de arredondamento em dízimas periódicas.
* **Processamento Funcional:** Utilização de Streams para conversão e filtragem de entradas.
* **Gerenciamento de Memória:** Implementação de arrays de objetos (`BigDecimal[]`) em vez de arrays primitivos.

---

## 🛠️ Detalhes Técnicos da Versão

### 1. Precisão Arbitrária
Em Engenharia da Computação, sabemos que o ponto flutuante padrão pode falhar. Com `BigDecimal`, garantimos que o resultado de $10 / 3$ seja controlado e não quebre a aplicação:

```java
.reduce((acc, elemento) -> acc.divide(elemento, 2, RoundingMode.HALF_UP))
