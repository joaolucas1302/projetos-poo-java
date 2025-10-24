# POO - Aula 11d - Lista de Exercícios - POO Parte 3 - Cadastro de Produtos

Este projeto contém três exercícios de Programação Orientada a Objetos implementados em Java, organizados em arquivos separados seguindo a estrutura da pasta 13-10.

## Estrutura do Projeto

### Q1 - Produtos
- **Program.java** - Classe principal (main)
- **Produto.java** - Classe de domínio com propriedades
- **MenuProduto.java** - Interface do usuário e lógica do menu

### Q2 - Produtos com Persistência
- **Program.java** - Classe principal (main)
- **Produto.java** - Classe de domínio
- **MenuProduto.java** - Interface do usuário
- **ProdutoBanco.java** - Sistema de persistência com vetor

### Q3 - Produtos com Operações Avançadas
- **Program.java** - Classe principal (main)
- **Produto.java** - Classe de domínio
- **MenuProduto.java** - Interface do usuário
- **ProdutoBanco.java** - Sistema de persistência com vetor

## Como Executar

### Pré-requisitos
- Java Development Kit (JDK) 8 ou superior instalado
- IDE como Eclipse, IntelliJ IDEA ou Visual Studio Code (opcional)

### Compilação e Execução

Para cada exercício, você pode compilar e executar individualmente:

#### Q1 - Produtos
```bash
cd Q1_Produtos
javac *.java
java Program
```

#### Q2 - Produtos com Persistência
```bash
cd Q2_Produtos_Persistencia
javac *.java
java Program
```

#### Q3 - Produtos com Operações Avançadas
```bash
cd Q3_Produtos
javac *.java
java Program
```

## Descrição dos Exercícios

### Q1 - PRODUTOS
- **Objetivo**: Criar uma classe `Produto` com propriedades públicas
- **Atributos**: Código, Nome, Descrição, Quantidade em Estoque, Preço Custo, Margem Lucro
- **Propriedade Especial**: Preço de Venda (calculado automaticamente: Preço Custo × Margem Lucro)
- **Funcionalidades**:
  - Adicionar produto
  - Exibir dados do produto
  - Menu interativo

### Q2 - PRODUTOS 2 - PERSISTÊNCIA
- **Objetivo**: Sistema de persistência de dados usando vetor
- **Funcionalidades**:
  - Cadastrar produto
  - Exibir todos os produtos
  - Remover produto por código
  - Localizar produto por código
  - Controle de capacidade (até 100 produtos)

### Q3 - PRODUTOS
- **Objetivo**: Sistema de controle de produtos com 100+ itens
- **Atributos**: Código, Nome, Descrição, Quantidade em Estoque, Preço Custo, Margem Lucro
- **Propriedade Especial**: Preço de Venda (calculado automaticamente: Preço Custo × Margem Lucro)
- **Funcionalidades**:
  - Cadastrar produto
  - Pesquisar produto por código
  - Remover produto por código
  - Imprimir todos os produtos
  - Limpar base de dados
  - Contar produtos cadastrados
  - Exibir produto com maior preço de venda

## Características Técnicas

### Conceitos de POO Utilizados
- **Encapsulamento**: Atributos privados com métodos getters e setters
- **Construtores**: Padrão e parametrizado
- **Métodos**: Para operações específicas de cada classe
- **Composição**: Uso de objetos dentro de outras classes

### Validações Implementadas
- Validação de entrada do usuário usando Scanner
- Verificação de duplicatas (código)
- Validação de tipos de dados
- Confirmação para operações destrutivas

### Estruturas de Dados
- **Arrays**: Para persistência em memória
- **Contadores**: Para controle de quantidade de itens
- **Busca Linear**: Para localizar itens nos arrays

## Comentários e Documentação

Todos os códigos estão extensivamente comentados em português, incluindo:
- Comentários de classe e método usando JavaDoc
- Explicação de atributos e métodos
- Documentação de parâmetros
- Comentários inline para lógica complexa

## Professor
Marçal, 2025
