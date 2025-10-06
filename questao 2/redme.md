# Resolução da Questão 2: Plataforma de Pagamentos

Este documento descreve a solução para a Questão 2 da avaliação prática, que aborda a integração com múltiplos meios de pagamento.

---

## Problema

> Uma plataforma de pagamentos deve permitir a integração com diferentes meios, como cartão de crédito, boleto bancário e PIX. A escolha do meio de pagamento deve ser configurável e o sistema precisa instanciar dinamicamente o processador correspondente sem que o código principal da aplicação precise conhecer detalhes da criação de cada objeto.

---

## Padrão de Projeto Implementado: Factory Method

A solução foi desenvolvida utilizando o Padrão de Projeto **Factory Method** (implementado através de uma *Simple Factory*).

### Justificativa da Escolha

O padrão **Factory Method** é ideal para cenários onde a criação de objetos precisa ser centralizada e desacoplada do cliente.

* **Encapsulamento da Lógica de Criação:** A responsabilidade de decidir qual classe concreta (`PixProcessador`, `BoletoProcessador`, etc.) instanciar é totalmente encapsulada dentro da classe `PagamentoFactory`.
* **Desacoplamento do Cliente:** O código cliente não precisa saber o nome das classes concretas de processadores. Ele apenas solicita um objeto à fábrica através de um identificador (uma string como "pix"), tornando o código cliente mais limpo e independente de mudanças na implementação dos processadores.
* **Instanciação Dinâmica:** O padrão permite que a decisão sobre qual objeto criar seja tomada em tempo de execução, atendendo perfeitamente ao requisito do problema.

### Estrutura da Implementação

* **`ProcessadorPagamento.java`**: A interface `Product` que define as operações de todos os processadores.
* **`CartaoCreditoProcessador.java`**, **`PixProcessador.java`**, etc: As classes `ConcreteProduct` que implementam a lógica de cada meio de pagamento.
* **`PagamentoFactory.java`**: A `Factory` que contém o método estático `criarProcessador()` para instanciar os produtos.
* **`Main.java`**: O código cliente que utiliza a `Factory` para obter e usar os processadores de pagamento.

---

## Como Executar

Para compilar e executar a solução, navegue até o diretório desta questão e utilize os seguintes comandos no terminal:

```bash
# Compilar todos os arquivos Java
javac *.java

# Executar a classe principal para ver a demonstração
java Main
```