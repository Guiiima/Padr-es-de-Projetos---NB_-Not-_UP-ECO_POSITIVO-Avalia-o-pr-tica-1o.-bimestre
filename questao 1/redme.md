# Resolução da Questão 1: Sistema de Logística

Este documento descreve a solução para a Questão 1 da avaliação prática, que aborda o cálculo de tarifas para diferentes modalidades de transporte.

---

## Problema

> Uma empresa de logística precisa desenvolver um sistema de cálculo de tarifas para diferentes tipos de transporte: terrestre, aéreo e marítimo. Cada modalidade tem regras próprias para determinar o valor da entrega (por exemplo, transporte terrestre leva em conta distância em quilômetros, enquanto aéreo utiliza peso da carga). Implemente uma solução que permita tratar todos os tipos de transporte de forma genérica, mas que ao mesmo tempo respeite as regras específicas de cada modalidade.

---

## Padrão de Projeto Implementado: Strategy

A solução foi desenvolvida utilizando o Padrão de Projeto **Strategy**.

### Justificativa da Escolha

O padrão **Strategy** foi escolhido por ser a solução mais adequada para encapsular algoritmos que podem ser trocados em tempo de execução.

* **Encapsulamento de Algoritmos:** Cada lógica de cálculo de tarifa (terrestre, aéreo, etc.) é encapsulada em sua própria classe (uma "estratégia"), tornando o sistema mais organizado.
* **Desacoplamento:** A classe principal, `CalculadoraDeTarifas`, não conhece os detalhes de como cada tarifa é calculada. Ela apenas colabora com um objeto que segue a interface `TransporteStrategy`. Isso reduz o acoplamento e facilita a manutenção.
* **Flexibilidade e Extensibilidade:** Adicionar uma nova modalidade de transporte (ex: ferroviário) é simples: basta criar uma nova classe que implemente `TransporteStrategy`, sem a necessidade de alterar o código já existente. Isso segue o Princípio Aberto/Fechado.

### Estrutura da Implementação

* **`TransporteStrategy.java`**: A interface `Strategy` que define o método comum `calcularTarifa`.
* **`TransporteTerrestre.java`**, **`TransporteAereo.java`**: As `ConcreteStrategy`, cada uma com sua própria implementação do cálculo.
* **`CalculadoraDeTarifas.java`**: O `Context`, que utiliza um objeto `Strategy` para realizar o cálculo.
* **`Main.java`**: O código cliente que demonstra a troca de estratégias para calcular diferentes tarifas.

---

## Como Executar

Para compilar e executar a solução, navegue até o diretório desta questão e utilize os seguintes comandos no terminal:

```bash
# Compilar todos os arquivos Java
javac *.java

# Executar a classe principal para ver a demonstração
java Main
```