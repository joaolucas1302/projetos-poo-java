# Questão 03 - Sobrecarga de Construtor

## 📝 Descrição
Implementação de uma classe `Cliente` com **sobrecarga de construtores** para atender diferentes módulos do sistema.

## 🏗️ Estrutura

### Classe Cliente
Contém todos os atributos de um cliente, mas pode ser instanciada de 3 formas diferentes.

### Atributos:
- `codigo` (int)
- `nome` (String)
- `idade` (int)
- `salario` (double)
- `cpf` (String)
- `rg` (String)
- `situacao` (EnumSituacao)

### Enum Situacao:
- `ORCAMENTO`
- `CLIENTE`
- `PEDIDO`

## 🔧 Construtores Sobrecarregados

### 1️⃣ Módulo Orçamento (Cadastro Rápido)
```java
public Cliente(String nome)
```
- **Recebe:** Apenas o nome
- **Define:** Situação = ORCAMENTO
- **Uso:** Cadastro rápido para orçamentos

### 2️⃣ Módulo Cliente (Cadastro Completo)
```java
public Cliente(int codigo, String nome, int idade, double salario, String cpf, String rg)
```
- **Recebe:** Todos os dados
- **Define:** Situação = CLIENTE
- **Uso:** Cadastro completo de clientes

### 3️⃣ Módulo Pedido (Cadastro Simplificado)
```java
public Cliente(int codigo, String nome, String cpf)
```
- **Recebe:** Código, Nome e CPF
- **Define:** Situação = PEDIDO
- **Uso:** Cadastro rápido para pedidos

## 🚀 Como executar:

```powershell
cd "AULA 12 - 20-10-2025\POO_Aula12c_ListaExercicios_Poo_Parte4_Sobrecarga\Q3_Sobrecarga_Construtor"
javac *.java
java SistemaCliente
```

## 📊 Exemplos de Uso:

### Exemplo 1: Módulo Orçamento
```
=== MÓDULO ORÇAMENTO ===
(Cadastro rápido - apenas nome)

Nome do cliente: João Silva

✅ Cliente cadastrado no módulo ORÇAMENTO!

=== DADOS DO CLIENTE ===
Situação: ORCAMENTO
Nome: João Silva
```

### Exemplo 2: Módulo Cliente Completo
```
=== MÓDULO CLIENTE ===
(Cadastro completo - todos os dados)

Código: 100
Nome: Maria Santos
Idade: 35
Salário: R$ 5500.00
CPF: 123.456.789-01
RG: 12.345.678-9

✅ Cliente cadastrado no módulo CLIENTE!

=== DADOS DO CLIENTE ===
Situação: CLIENTE
Código: 100
Nome: Maria Santos
Idade: 35 anos
Salário: R$ 5500.00
CPF: 123.456.789-01
RG: 12.345.678-9
```

### Exemplo 3: Módulo Pedido
```
=== MÓDULO PEDIDO ===
(Cadastro para pedido - código, nome e CPF)

Código: 200
Nome: Carlos Oliveira
CPF: 987.654.321-00

✅ Cliente cadastrado no módulo PEDIDO!

=== DADOS DO CLIENTE ===
Situação: PEDIDO
Código: 200
Nome: Carlos Oliveira
CPF: 987.654.321-00
```

## 💡 Conceitos Aplicados:

- ✅ **Sobrecarga de Construtores**
- ✅ **Encapsulamento** (getters/setters)
- ✅ **Enumerações** (Enum)
- ✅ **toString() personalizado**
- ✅ **Diferentes contextos de uso**

## 🎯 Por que Sobrecarga de Construtor?

A sobrecarga de construtores permite criar objetos de diferentes formas dependendo do contexto:

```java
// Mesmo construtor, diferentes necessidades
Cliente c1 = new Cliente("João Silva");                    // Orçamento
Cliente c2 = new Cliente(100, "Maria", 35, 5500, "123", "456"); // Completo
Cliente c3 = new Cliente(200, "Carlos", "987.654.321");    // Pedido
```

**Vantagens:**
- ✅ Flexibilidade na criação de objetos
- ✅ Código mais limpo e legível
- ✅ Evita parâmetros desnecessários
- ✅ Cada módulo usa apenas os dados necessários

## 🔍 Diferença entre Sobrecarga de Métodos e Construtores

| Aspecto | Métodos | Construtores |
|---------|---------|--------------|
| Nome | Pode ser qualquer nome | Sempre o nome da classe |
| Retorno | Tem tipo de retorno | Não tem retorno |
| Chamada | `objeto.metodo()` ou `Classe.metodo()` | `new Classe()` |
| Objetivo | Executar operações | Inicializar objetos |

Ambos permitem **múltiplas assinaturas** com diferentes parâmetros!
