# Resolução da Questão 3: Site de Notícias

Este documento descreve a solução para a Questão 3 da avaliação prática, focada em um sistema de notificações para assinantes de tópicos.

---

## Problema

> Um site de notícias deseja implementar um recurso onde os leitores podem se inscrever em determinados tópicos (política, esportes, tecnologia). Sempre que uma nova notícia for publicada em um tópico, todos os leitores interessados devem receber uma notificação automática.

---

## Padrão de Projeto Implementado: Observer

A solução foi desenvolvida utilizando o Padrão de Projeto **Observer**.

### Justificativa da Escolha

O padrão **Observer** foi projetado exatamente para resolver este tipo de problema, onde o estado de um objeto (`Subject`) deve ser propagado para uma lista de objetos dependentes (`Observers`).

* **Relacionamento Um-Para-Muitos:** O padrão gerencia a relação entre um tópico de notícia (`Subject`) e seus múltiplos assinantes (`Observers`) de forma eficiente e automática.
* **Acoplamento Fraco:** O `Subject` (tópico) não conhece as classes concretas de seus `Observers` (leitores). Ele apenas sabe que eles respondem a uma interface comum. Isso permite adicionar novos tipos de notificadores (ex: notificação por SMS) sem alterar o `Subject`.
* **Mecanismo de Broadcast:** Quando uma nova notícia é publicada, o `Subject` simplesmente itera sobre sua lista de `Observers` e os notifica, garantindo que todos recebam a atualização.

### Estrutura da Implementação

* **`Observer.java`** e **`Subject.java`**: As interfaces que definem os contratos para os observadores e observados.
* **`LeitorAssinante.java`**: O `ConcreteObserver`, que representa um leitor e reage às notificações.
* **`TopicoNoticias.java`**: O `ConcreteSubject`, que representa um tópico, mantém a lista de assinantes e os notifica quando seu estado muda.
* **`Main.java`**: O código cliente que cria tópicos, inscreve leitores e simula a publicação de notícias.

---

## Como Executar

Para compilar e executar a solução, navegue até o diretório desta questão e utilize os seguintes comandos no terminal:

```bash
# Compilar todos os arquivos Java
javac *.java

# Executar a classe principal para ver a demonstração
java Main
```