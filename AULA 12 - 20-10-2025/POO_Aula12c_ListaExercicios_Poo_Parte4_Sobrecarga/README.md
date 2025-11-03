# PROGRAMAÇÃO ORIENTADA A OBJETOS (POO)
**Professor:** Marçal  
**Data:** 20/10/2025

## LISTA DE EXERCÍCIOS - POO (Sobrecarga)

---

## 📋 Questão 01 - Sobrecarga de Métodos Somar

Crie a classe **Calculos** respeitando as seguintes regras:

### Requisitos:

**a.** Os métodos deverão ser **estáticos** (static), ou seja, poderão ser acessados sem a necessidade de instanciar o objeto.

**b.** Os métodos devem estar **funcionais**, retornando o valor correspondente.

**c.** Crie um **menu de console** para utilizar cada um dos métodos.

**d.** Para a opção com vetor, solicite primeiro a quantidade de valores que o usuário irá digitar.

### Métodos Sobrecarregados:
```
+ Somar(valorA: Double, valorB: Double): Double
+ Somar(valorA: Int, valorB: Int, valorC: Double): Double
+ Somar(valores: Double[]): Double
+ Somar(valorA: Int, valorB: Double): Double
+ Maior(valores: Double[]): Double
```

### 📂 Localização:
`Q1_Sobrecarga_Somar/`

---

## 📋 Questão 02 - Desconto em Mensalidade

Implemente uma classe que permita calcular descontos na mensalidade usando **sobrecarga de métodos**.

### Cenário:
O setor financeiro da faculdade calcula descontos baseado em diferentes critérios.

### Regras de Desconto:

**a. Por Dias de Antecedência (int):**
- Até 5 dias: 3% de desconto
- Até 10 dias: 5% de desconto
- Acima de 10 dias: 8% de desconto

**b. Por Nota do ENEM (double):**
- 700.00 a 800.00: 5% de desconto
- 800.01 a 900.00: 8% de desconto
- Acima de 900.00: 10% de desconto
- Abaixo de 700.00: sem desconto

**c. Por Média das 3 Maiores Notas (double, double, double):**
- Se alguma média < 8.00: sem desconto
- Média calculada < 8.50: sem desconto
- Média entre 8.51 e 9.00: 5% de desconto
- Média acima de 9.00: 8% de desconto

### 📂 Localização:
`Q2_Desconto_Mensalidade/`

---

## 📋 Questão 03 - Sobrecarga de Construtor

Crie uma classe **Cliente** com sobrecarga de construtores para diferentes módulos do sistema.

### Atributos:
- Código (int)
- Nome (String)
- Idade (int)
- Salário (double)
- CPF (String)
- RG (String)
- Situação (EnumSituacao: ORCAMENTO, CLIENTE, PEDIDO)

### Construtores Sobrecarregados:

**a. Módulo Orçamento:**
- Recebe: Nome
- Define Situação: ORCAMENTO

**b. Módulo Cliente:**
- Recebe: Todos os dados
- Define Situação: CLIENTE

**c. Módulo Pedido:**
- Recebe: Código, Nome, CPF
- Define Situação: PEDIDO

### 📂 Localização:
`Q3_Sobrecarga_Construtor/`

---

## 🏃 Como executar:

### Windows (PowerShell)
```powershell
# Questão 1
cd "Q1_Sobrecarga_Somar"
javac *.java
java SistemaCalculos

# Questão 2
cd "..\Q2_Desconto_Mensalidade"
javac *.java
java SistemaDesconto

# Questão 3
cd "..\Q3_Sobrecarga_Construtor"
javac *.java
java SistemaCliente
```

---

## 📚 Conceitos Abordados:
- ✅ **Sobrecarga de Métodos** (Method Overloading)
- ✅ **Métodos Estáticos** (static)
- ✅ **Sobrecarga de Construtores**
- ✅ **Enumerações** (Enum)
- ✅ **Encapsulamento**
- ✅ **Arrays**
- ✅ **Validações e Regras de Negócio**

---

## 💡 Dica sobre Sobrecarga:

**Sobrecarga (Overloading)** permite criar múltiplos métodos com o **mesmo nome** mas com **assinaturas diferentes**:
- Diferente número de parâmetros
- Diferentes tipos de parâmetros
- Diferente ordem dos parâmetros

```java
// Exemplos de sobrecarga válida
public static double somar(double a, double b) { }
public static double somar(int a, int b, double c) { }
public static double somar(double[] valores) { }
```
