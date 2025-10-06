# Resolução da Questão 5: Modelos de Documentos

Este documento descreve a solução para a Questão 5 da avaliação prática, que trata da criação de documentos personalizáveis a partir de modelos.

---

## Problema

> Uma empresa de design oferece modelos de documentos (currículos, propostas comerciais, relatórios). Cada modelo pode ser personalizado para um cliente específico (mudança de cores, fontes e logotipo). O sistema deve permitir que, a partir de um modelo existente, seja possível gerar rapidamente uma nova cópia personalizável, sem precisar recriar toda a estrutura do documento do zero.

---

## Padrão de Projeto Implementado: Prototype

A solução foi desenvolvida utilizando o Padrão de Projeto **Prototype**.

### Justificativa da Escolha

O padrão **Prototype** é ideal quando o custo de criar um objeto do zero é maior do que o de copiá-lo. Ele permite criar novos objetos clonando uma instância existente.

* **Eficiência na Criação:** Em vez de instanciar um novo objeto e reconfigurar todos os seus atributos, o padrão cria uma cópia exata de um objeto pré-configurado ("protótipo"), o que é muito mais performático.
* **Redução da Complexidade:** O cliente não precisa conhecer a lógica complexa de construção de um documento. Ele simplesmente solicita um clone de um modelo existente a partir de um gerenciador (`ModelosManager`).
* **Flexibilidade:** Novos modelos de documentos podem ser criados e "registrados" no gerenciador de protótipos em tempo de execução, sem necessidade de alterar o código cliente.

### Estrutura da Implementação

* **`Documento.java`**: A classe `Prototype` abstrata que implementa `Cloneable` e define a interface de clonagem.
* **`Curriculo.java`**, **`PropostaComercial.java`**: As classes `ConcretePrototype` que representam os modelos de documentos.
* **`ModelosManager.java`**: Um `Prototype Registry` que armazena os protótipos pré-configurados e fornece clones deles sob demanda.
* **`Main.java`**: O código cliente que solicita clones dos modelos e os personaliza.

---

## Como Executar

Para compilar e executar a solução, navegue até o diretório desta questão e utilize os seguintes comandos no terminal:

```bash
# Compilar todos os arquivos Java
javac *.java

# Executar a classe principal para ver a demonstração
java Main
```