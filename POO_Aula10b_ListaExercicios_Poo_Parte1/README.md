# POO - Aula 10b - Lista de Exercícios - POO Parte 1

Este projeto contém três exercícios de Programação Orientada a Objetos implementados em C#, organizados em arquivos separados seguindo a estrutura da pasta 13-10.

## Estrutura do Projeto

### Q1 - Alunos
- **Program.cs** - Classe principal (main)
- **Aluno.cs** - Classe de domínio com propriedades
- **MenuAluno.cs** - Interface do usuário e lógica do menu

### Q2 - Alunos com Persistência
- **Program.cs** - Classe principal (main)
- **Aluno.cs** - Classe de domínio
- **MenuAluno.cs** - Interface do usuário
- **AlunoBanco.cs** - Sistema de persistência com vetor

### Q3 - Produtos
- **Program.cs** - Classe principal (main)
- **Produto.cs** - Classe de domínio
- **MenuProduto.cs** - Interface do usuário
- **ProdutoBanco.cs** - Sistema de persistência com vetor

## Como Executar

### Pré-requisitos
- .NET Framework ou .NET Core instalado
- Visual Studio ou Visual Studio Code (opcional)

### Compilação e Execução

Para cada exercício, você pode compilar e executar individualmente:

#### Q1 - Alunos
```bash
cd Q1_Alunos
csc *.cs
Program.exe
```

#### Q2 - Alunos com Persistência
```bash
cd Q2_Alunos_Persistencia
csc *.cs
Program.exe
```

#### Q3 - Produtos
```bash
cd Q3_Produtos
csc *.cs
Program.exe
```

## Descrição dos Exercícios

### Q1 - ALUNOS
- **Objetivo**: Criar uma classe `Aluno` com propriedades públicas
- **Atributos**: RA, Nome, Idade, CPF, Sexo, E-mail, Telefone
- **Funcionalidades**:
  - Adicionar aluno
  - Exibir dados do aluno
  - Menu interativo

### Q2 - ALUNOS 2 - PERSISTÊNCIA
- **Objetivo**: Sistema de persistência de dados usando vetor
- **Funcionalidades**:
  - Cadastrar aluno
  - Exibir todos os alunos
  - Remover aluno por RA
  - Localizar aluno por RA
  - Controle de capacidade (até 100 alunos)

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
- **Encapsulamento**: Atributos privados com propriedades públicas
- **Construtores**: Padrão e parametrizado
- **Propriedades**: get/set para controle de acesso
- **Propriedades Somente Leitura**: Preço de Venda calculado automaticamente
- **Métodos**: Para operações específicas de cada classe

### Validações Implementadas
- Validação de entrada do usuário
- Verificação de duplicatas (RA e Código)
- Validação de tipos de dados
- Confirmação para operações destrutivas

### Estruturas de Dados
- **Vetores**: Para persistência em memória
- **Contadores**: Para controle de quantidade de itens
- **Busca Linear**: Para localizar itens nos vetores

## Comentários e Documentação

Todos os códigos estão extensivamente comentados em português, incluindo:
- Comentários de classe e método
- Explicação de atributos e propriedades
- Documentação de parâmetros
- Comentários inline para lógica complexa

## Professor
Marçal, 2025
