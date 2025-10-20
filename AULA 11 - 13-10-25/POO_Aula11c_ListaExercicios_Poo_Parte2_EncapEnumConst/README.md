# POO - Aula 11c - Lista de Exercícios - POO Parte 2 - Encapsulamento, Enumeradores e Construtores

Este projeto contém quatro exercícios de Programação Orientada a Objetos implementados em Java, focados em encapsulamento, enumeradores e construtores.

## Estrutura do Projeto

### Q1 - Produtos (Encapsulamento)
- **Program.java** - Classe principal com demonstração
- **Produtos.java** - Classe com encapsulamento completo

### Q2 - Alunos (Enumeradores e Consistência)
- **Program.java** - Classe principal com demonstração
- **Alunos.java** - Classe com validações de consistência
- **EControleAtivacao.java** - Enumerador para controle de ativação
- **EControleRelatorio.java** - Enumerador para controle de relatório

### Q3 - Cliente (Enumerador e Validações)
- **Program.java** - Classe principal com demonstração
- **Cliente.java** - Classe com validações e prefixos automáticos
- **EnumSexo.java** - Enumerador para controle de sexo

### Q4 - Carros (Validações)
- **Program.java** - Classe principal com demonstração
- **Carros.java** - Classe com validações específicas

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

#### Q2 - Alunos
```bash
cd Q2_Alunos
javac *.java
java Program
```

#### Q3 - Cliente
```bash
cd Q3_Cliente
javac *.java
java Program
```

#### Q4 - Carros
```bash
cd Q4_Carros
javac *.java
java Program
```

## Descrição dos Exercícios

### Q1 - PRODUTOS (Encapsulamento)
- **Objetivo**: Implementar encapsulamento adequado com atributos privados e métodos públicos
- **Atributos**: CodigoEAN, Descricao, PrecoCusto, MargemLucro, PrecoVenda, SaldoEstoque
- **Funcionalidades**:
  - Construtores padrão e parametrizado
  - Métodos getters e setters para todos os atributos
  - Método ImprimirFicha() para exibir todos os dados

### Q2 - ALUNOS (Enumeradores e Consistência)
- **Objetivo**: Implementar enumeradores e validações de consistência
- **Enumeradores**:
  - `EControleAtivacao`: caAtivo, caDesativado, caPendente
  - `EControleRelatorio`: crAnalitico, crSintetico
- **Atributos**: RA, NOME, MENSALIDADE, SITUACAO
- **Validações**:
  - NOME: não pode ser null ou ter menos de 10 caracteres
  - MENSALIDADE: deve ser maior que zero
- **Funcionalidades**:
  - Método ImprimirRelatorio() com formatos analítico e sintético

### Q3 - CLIENTE (Enumerador e Validações)
- **Objetivo**: Implementar enumerador, construtor e validações com prefixos automáticos
- **Enumerador**: `EnumSexo`: Fem, Masc
- **Atributos**: Codigo, Nome, Sexo, Idade
- **Validações**:
  - Idade: deve ser maior ou igual a 21 anos
- **Funcionalidades**:
  - Construtor que recebe sexo como parâmetro
  - Prefixo automático: "Sr." para masculino, "Sra." para feminino
  - Método ImprimirFicha() para exibir todos os dados

### Q4 - CARROS (Validações)
- **Objetivo**: Implementar validações específicas para atributos
- **Atributos**: Placa, CapacidadeTanque, Marca, Modelo, NumeroPortas
- **Validações**:
  - Placa: deve ter pelo menos 7 caracteres
  - CapacidadeTanque: deve ser pelo menos 35 litros
  - NumeroPortas: deve ser pelo menos 2 portas
- **Funcionalidades**:
  - Avisos informativos para valores inadequados
  - Método ImprimirFicha() para exibir todos os dados

## Características Técnicas

### Conceitos de POO Utilizados
- **Encapsulamento**: Atributos privados com métodos getters e setters
- **Construtores**: Padrão e parametrizado para todas as classes
- **Enumeradores**: Para controle de estados e tipos
- **Validações**: Implementação de regras de consistência
- **Métodos**: Para operações específicas de cada classe

### Validações Implementadas
- Validação de entrada do usuário
- Verificação de valores nulos e vazios
- Validação de tamanhos e limites
- Mensagens informativas para o usuário
- Prefixos automáticos baseados em enumeradores

### Estruturas de Dados
- **Enumeradores**: Para controle de estados e tipos
- **Strings**: Para validação de tamanhos e conteúdo
- **Números**: Para validação de limites e faixas

## Comentários e Documentação

Todos os códigos estão extensivamente comentados em português, incluindo:
- Comentários de classe e método usando JavaDoc
- Explicação de atributos e métodos
- Documentação de parâmetros e validações
- Comentários inline para lógica complexa

## Professor
Marçal, 2025
