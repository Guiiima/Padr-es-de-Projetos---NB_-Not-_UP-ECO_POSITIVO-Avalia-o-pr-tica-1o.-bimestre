# Resolução da Questão 4: Relatórios de Vendas

Este documento descreve a solução para a Questão 4 da avaliação prática, que lida com a adição flexível de funcionalidades a relatórios.

---

## Problema

> Um sistema de pedidos online precisa gerar relatórios de vendas em diferentes formatos. Inicialmente, o relatório contém apenas informações básicas. Posteriormente, o gestor pode decidir adicionar funcionalidades adicionais, como estatísticas de faturamento, gráficos ou exportação em PDF. Esses recursos devem ser opcionais e adicionados de forma flexível, sem alterar o código existente do relatório básico.

---

## Padrão de Projeto Implementado: Decorator

A solução foi desenvolvida utilizando o Padrão de Projeto **Decorator**.

### Justificativa da Escolha

O padrão **Decorator** é a escolha perfeita para adicionar responsabilidades a objetos dinamicamente e de forma transparente.

* **Flexibilidade sobre Herança:** Em vez de criar uma hierarquia complexa de classes para cada combinação de funcionalidade, o `Decorator` permite "embrulhar" um objeto base com novas funcionalidades em tempo de execução.
* **Princípio Aberto/Fechado:** É possível adicionar novos decoradores (funcionalidades) sem modificar o código do objeto original (`RelatorioBasico`) ou de outros decoradores. O sistema está aberto para extensão, mas fechado para modificação.
* **Composição Dinâmica:** O cliente pode compor relatórios com qualquer combinação de funcionalidades de maneira flexível, como `new RelatorioExportadoPDF(new RelatorioComEstatisticas(new RelatorioBasico()))`.

### Estrutura da Implementação

* **`Relatorio.java`**: A interface `Component` que define o objeto a ser decorado.
* **`RelatorioBasico.java`**: O `ConcreteComponent`, a implementação base do relatório.
* **`RelatorioDecorator.java`**: A classe `Decorator` abstrata que serve como base para os decoradores concretos.
* **`RelatorioComEstatisticas.java`**, **`RelatorioExportadoPDF.java`**: As classes `ConcreteDecorator`, cada uma adicionando uma nova funcionalidade.
* **`Main.java`**: O código cliente que demonstra como compor diferentes tipos de relatórios.

---

## Como Executar

Para compilar e executar a solução, navegue até o diretório desta questão e utilize os seguintes comandos no terminal:

```bash
# Compilar todos os arquivos Java
javac *.java

# Executar a classe principal para ver a demonstração
java Main
```