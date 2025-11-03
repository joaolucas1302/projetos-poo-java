# Questão 01 - Sobrecarga de Métodos Somar

## 📝 Descrição
Implementação de uma classe `Calculos` com métodos estáticos sobrecarregados para realizar operações de soma e encontrar o maior valor.

## 🏗️ Estrutura

### Classe Calculos
Todos os métodos são **estáticos** (podem ser chamados sem instanciar a classe).

### Métodos Sobrecarregados:

1. **Somar(double, double): double**
   - Soma dois valores Double
   - Exemplo: `Calculos.Somar(10.5, 20.3)` → 30.8

2. **Somar(int, int, double): double**
   - Soma dois valores Int e um Double
   - Exemplo: `Calculos.Somar(10, 20, 5.5)` → 35.5

3. **Somar(double[]): double**
   - Soma todos os valores de um array
   - Exemplo: `Calculos.Somar([10.0, 20.0, 30.0])` → 60.0

4. **Somar(int, double): double**
   - Soma um Int e um Double
   - Exemplo: `Calculos.Somar(10, 20.5)` → 30.5

5. **Maior(double[]): double**
   - Retorna o maior valor do array
   - Exemplo: `Maior([10.0, 50.0, 30.0])` → 50.0

## 🚀 Como executar:

```powershell
cd "AULA 12 - 20-10-2025\POO_Aula12c_ListaExercicios_Poo_Parte4_Sobrecarga\Q1_Sobrecarga_Somar"
javac *.java
java SistemaCalculos
```

## 📊 Exemplo de Uso:

```
=== SISTEMA DE CÁLCULOS - MENU ===
1 - Somar(Double, Double)
2 - Somar(Int, Int, Double)
3 - Somar(Array de Double)
4 - Somar(Int, Double)
5 - Maior(Array de Double)
0 - Sair

Escolha uma opção: 3

=== SOMAR ARRAY DE VALORES DOUBLE ===
Quantos valores você deseja somar? 4

Digite os valores:
Valor 1: 10.5
Valor 2: 20.3
Valor 3: 15.7
Valor 4: 8.2

✅ Soma total: 54.7
```

## 💡 Conceitos Aplicados:

- ✅ **Sobrecarga de Métodos** (Method Overloading)
- ✅ **Métodos Estáticos** (static)
- ✅ **Arrays**
- ✅ **Diferentes tipos de parâmetros** (int, double, double[])

## 🎯 O que é Sobrecarga?

Sobrecarga permite criar múltiplos métodos com o **mesmo nome** mas com **assinaturas diferentes**:
- Número diferente de parâmetros
- Tipos diferentes de parâmetros
- Ordem diferente dos parâmetros

```java
// Todos são válidos - mesmo nome, assinaturas diferentes
public static double Somar(double a, double b) { }
public static double Somar(int a, int b, double c) { }
public static double Somar(double[] valores) { }
```
