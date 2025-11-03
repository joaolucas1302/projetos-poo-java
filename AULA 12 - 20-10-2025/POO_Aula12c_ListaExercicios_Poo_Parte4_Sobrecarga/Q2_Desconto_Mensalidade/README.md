# Questão 02 - Desconto em Mensalidade

## 📝 Descrição
Sistema para calcular descontos em mensalidades baseado em diferentes critérios, usando **sobrecarga de métodos**.

## 🏗️ Estrutura

### Classe CalculoDesconto
Implementa o cálculo de mensalidade com desconto usando 3 métodos sobrecarregados.

## 📋 Regras de Desconto

### 1️⃣ Por Dias de Antecedência (int)
```java
calcularMensalidade(double valorMensalidade, int diasAntecedencia)
```

| Dias de Antecedência | Desconto |
|---------------------|----------|
| Até 5 dias          | 3%       |
| Até 10 dias         | 5%       |
| Acima de 10 dias    | 8%       |

### 2️⃣ Por Nota do ENEM (double)
```java
calcularMensalidade(double valorMensalidade, double notaEnem)
```

| Nota do ENEM      | Desconto |
|-------------------|----------|
| Abaixo de 700.00  | 0%       |
| 700.00 a 800.00   | 5%       |
| 800.01 a 900.00   | 8%       |
| Acima de 900.00   | 10%      |

### 3️⃣ Por Médias do Semestre (3 doubles)
```java
calcularMensalidade(double valorMensalidade, double media1, double media2, double media3)
```

| Condição                          | Desconto |
|-----------------------------------|----------|
| Alguma média < 8.00               | 0%       |
| Média calculada < 8.50            | 0%       |
| Média entre 8.51 e 9.00           | 5%       |
| Média acima de 9.00               | 8%       |

## 🚀 Como executar:

```powershell
cd "AULA 12 - 20-10-2025\POO_Aula12c_ListaExercicios_Poo_Parte4_Sobrecarga\Q2_Desconto_Mensalidade"
javac *.java
java SistemaDesconto
```

## 📊 Exemplo de Uso:

### Exemplo 1: Desconto por Dias de Antecedência
```
=== DESCONTO POR DIAS DE ANTECEDÊNCIA ===
Regras:
• Até 5 dias: 3% de desconto
• Até 10 dias: 5% de desconto
• Acima de 10 dias: 8% de desconto

Valor da mensalidade: R$ 1000.00
Dias de antecedência: 12

--- RESULTADO ---
Valor original: R$ 1000.00
Desconto (8.0%): R$ 80.00
✅ Valor final: R$ 920.00
```

### Exemplo 2: Desconto por Nota ENEM
```
=== DESCONTO POR NOTA DO ENEM ===
Valor da mensalidade: R$ 1000.00
Nota do ENEM: 850.0

--- RESULTADO ---
Valor original: R$ 1000.00
Desconto (8.0%): R$ 80.00
✅ Valor final: R$ 920.00
```

### Exemplo 3: Desconto por Médias
```
=== DESCONTO POR MÉDIAS DO SEMESTRE ===
Valor da mensalidade: R$ 1000.00

Digite as 3 maiores médias do semestre anterior:
Média 1: 9.5
Média 2: 9.2
Média 3: 9.8

--- RESULTADO ---
Média calculada: 9.50
Valor original: R$ 1000.00
Desconto (8.0%): R$ 80.00
✅ Valor final: R$ 920.00
```

## 💡 Conceitos Aplicados:

- ✅ **Sobrecarga de Métodos**
- ✅ **Diferentes tipos de parâmetros** (int vs double)
- ✅ **Validações e Regras de Negócio**
- ✅ **Cálculos percentuais**
- ✅ **Formatação de valores monetários**

## 🎯 Por que Sobrecarga?

A sobrecarga permite que o método `calcularMensalidade` seja chamado com diferentes tipos de dados:

```java
// Mesmo nome, diferentes assinaturas
calcularMensalidade(1000.0, 12);           // int = dias
calcularMensalidade(1000.0, 850.0);        // double = nota ENEM
calcularMensalidade(1000.0, 9.5, 9.2, 9.8); // 3 doubles = médias
```

O compilador identifica automaticamente qual método chamar baseado nos tipos dos argumentos!
