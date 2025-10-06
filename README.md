# Avaliação Prática - Padrões de Projeto em Java

Este repositório contém a resolução da **Avaliação Prática sobre Padrões de Projeto (Design Patterns)**, focada na aplicação de soluções robustas e flexíveis para problemas de software comuns utilizando a linguagem Java.

O projeto foi entregue em **06 de Outubro de 2025**, conforme o prazo estipulado.

---

##  Objetivo

O objetivo desta avaliação foi aplicar os conhecimentos sobre os Padrões de Projeto do "Gang of Four" (GoF) para resolver cinco cenários distintos, demonstrando a capacidade de escolher e implementar o padrão mais adequado para cada requisito.

---

##  Estrutura do Repositório

O projeto está organizado em diretórios separados. Cada diretório corresponde a uma das questões da avaliação e contém uma solução completa e independente.

* ` questao1/`: **Sistema de Logística**
    * **Padrão Implementado:** `Strategy`
    * **Descrição:** Permite a seleção de diferentes algoritmos de cálculo de frete (terrestre, aéreo) de forma dinâmica.

* ` questao2/`: **Plataforma de Pagamentos**
    * **Padrão Implementado:** `Factory Method`
    * **Descrição:** Centraliza a criação de objetos de processamento de pagamento (PIX, Boleto, Cartão), desacoplando o cliente da implementação concreta.

* ` questao3/`: **Site de Notícias**
    * **Padrão Implementado:** `Observer`
    * **Descrição:** Implementa um sistema de assinatura onde múltiplos leitores são notificados automaticamente sobre novas notícias em um tópico.

* ` questao4/`: **Relatórios de Vendas**
    * **Padrão Implementado:** `Decorator`
    * **Descrição:** Adiciona funcionalidades (estatísticas, exportação PDF) a um relatório base de forma flexível e sem alterar o código original.

* ` questao5/`: **Modelos de Documentos**
    * **Padrão Implementado:** `Prototype`
    * **Descrição:** Permite a criação de novos documentos a partir da clonagem de modelos pré-existentes, otimizando a performance e a flexibilidade.

---

##  Como Navegar e Executar

Para analisar e executar cada solução, por favor, navegue até o diretório da questão desejada.

**Cada diretório (`/questao1`, `/questao2`, etc.) possui:**

1.   O **código-fonte em Java** da solução.
2.   Um **arquivo `README.md` próprio** com a justificativa detalhada da escolha do padrão e as instruções específicas para compilação e execução daquele módulo.

**Exemplo de Execução (dentro de qualquer pasta de questão):**
```bash
# Compile todos os arquivos .java
javac *.java

# Execute a classe principal de demonstração
java Main
```

---
**Autor:** Guilherme (Guiima)
