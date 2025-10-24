# POO - Aula 06b - Lista de Exercícios
## Comandos de Repetição - Parte 2

**Professor:** Marçal  
**Disciplina:** Programação Orientada a Objetos  
**Fonte:** Manzano, 2005

---

## 📋 Lista de Exercícios

### Q1 - Série Fibonacci
- **Arquivo:** `Q1_Fibonacci.java`
- **Descrição:** Apresenta a série Fibonacci até o 15º termo
- **Conceitos:** Loop for, sequência matemática
- **Funcionalidades:** Calcula e exibe cada termo da série

### Q2 - Conversão de Graus
- **Arquivo:** `Q2_ConversaoGraus.java`
- **Descrição:** Converte graus Celsius para Fahrenheit de 10 em 10 graus
- **Conceitos:** Loop for, cálculos de temperatura
- **Funcionalidades:** Tabela de conversão de 10°C a 100°C

### Q3 - Grãos de Trigo no Tabuleiro
- **Arquivo:** `Q3_GraosTrigoTabuleiro.java`
- **Descrição:** Calcula grãos de trigo em tabuleiro de xadrez (8x8)
- **Conceitos:** Loop for, exponenciação, somatória
- **Funcionalidades:** Dobra grãos a cada quadrado, calcula total

### Q4 - Somar 5 Fatoriais
- **Arquivo:** `Q4_Somar5Fatoriais.java`
- **Descrição:** Lê 5 valores e soma seus fatoriais
- **Conceitos:** Loop for aninhado, fatorial, acumulador
- **Funcionalidades:** Calcula fatorial de cada valor e soma

### Q5 - Somar 6 Valores e Média
- **Arquivo:** `Q5_Somar6ValoresMedia.java`
- **Descrição:** Lê 6 valores, calcula soma e média
- **Conceitos:** Loop for, acumulador, média aritmética
- **Funcionalidades:** Soma valores e calcula média

### Q6 - Somar Valores Positivos até Aparecer Negativo
- **Arquivo:** `Q6_SomarValoresPositivos.java`
- **Descrição:** Lê valores positivos até aparecer um negativo
- **Conceitos:** Loop while, condicionais, acumulador
- **Funcionalidades:** Para quando encontra valor negativo, calcula soma e média

### Q7 - Somar Fatoriais dos Ímpares de 1 a 20
- **Arquivo:** `Q7_SomarFatoriaisImpares.java`
- **Descrição:** Soma fatoriais dos números ímpares de 1 a 20
- **Conceitos:** Loop for, condicionais, fatorial, acumulador
- **Funcionalidades:** Identifica ímpares, calcula fatorial e soma

---

## 🚀 Como Executar

1. **Compilar:** `javac NomeDoArquivo.java`
2. **Executar:** `java NomeDoArquivo`

### Exemplo:
```bash
javac Q1_Fibonacci.java
java Q1_Fibonacci
```

---

## 📝 Conceitos Abordados

### Estruturas de Repetição
- **for:** Para loops com contador
- **while:** Para loops com condição
- **for aninhado:** Para cálculos complexos

### Sequências Matemáticas
- **Fibonacci:** F(n) = F(n-1) + F(n-2)
- **Exponenciação:** 2^n (dobro a cada termo)
- **Fatorial:** n! = n × (n-1) × ... × 1

### Cálculos e Conversões
- **Conversão de temperatura:** F = (C × 9/5) + 32
- **Somatória:** Soma de valores
- **Média aritmética:** Soma ÷ quantidade

### Controle de Fluxo
- **Condicionais:** Para filtrar valores
- **Acumuladores:** Para somas e produtos
- **Contadores:** Para estatísticas

---

## 🎯 Objetivos de Aprendizagem

### Estruturas de Repetição Avançadas
- Compreender diferentes tipos de loops
- Aplicar loops aninhados corretamente
- Usar acumuladores e contadores

### Matemática Aplicada
- Implementar sequências matemáticas
- Calcular fatoriais e somatórias
- Realizar conversões de unidades

### Lógica de Programação
- Filtrar valores com condicionais
- Controlar fluxo com loops
- Organizar cálculos sequenciais

---

## 💡 Dicas Importantes

### Q1 - Fibonacci
- Inicie com 1, 1
- Cada termo é soma dos dois anteriores
- Use variáveis para armazenar termos

### Q2 - Conversão de Graus
- Use loop de 10 a 100, incremento de 10
- Aplique fórmula: F = (C × 9/5) + 32
- Exiba tabela formatada

### Q3 - Grãos de Trigo
- Comece com 1 grão
- Dobra a cada quadrado
- Some todos os grãos
- Cuidado com números grandes!

### Q4 - Somar 5 Fatoriais
- Use loop para ler 5 valores
- Calcule fatorial de cada um
- Some todos os fatoriais

### Q5 - Somar 6 Valores
- Use loop para ler 6 valores
- Some todos os valores
- Calcule média: soma ÷ 6

### Q6 - Valores Positivos
- Use loop while com condição
- Pare quando valor for negativo
- Calcule soma e média

### Q7 - Fatoriais dos Ímpares
- Use loop de 1 a 20
- Verifique se é ímpar com %
- Calcule fatorial e some

---

## 🔧 Fórmulas Utilizadas

### Fibonacci
- **Fórmula:** F(n) = F(n-1) + F(n-2)
- **Início:** F(1) = 1, F(2) = 1

### Conversão de Temperatura
- **Fórmula:** F = (C × 9/5) + 32
- **Onde:** C = Celsius, F = Fahrenheit

### Fatorial
- **Fórmula:** n! = n × (n-1) × (n-2) × ... × 1
- **Casos especiais:** 0! = 1, 1! = 1

### Média Aritmética
- **Fórmula:** Média = Soma ÷ Quantidade

### Exponenciação
- **Fórmula:** 2^n (dobro a cada termo)
- **Exemplo:** 1, 2, 4, 8, 16, 32, ...
