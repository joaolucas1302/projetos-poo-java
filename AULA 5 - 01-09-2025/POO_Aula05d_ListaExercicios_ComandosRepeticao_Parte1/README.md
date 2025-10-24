# POO - Aula 05d - Lista de Exercícios
## Comandos de Repetição - Parte 1

**Professor:** Marçal  
**Disciplina:** Programação Orientada a Objetos  
**Fonte:** Manzano, 2005

---

## 📋 Lista de Exercícios

### Q1 - Quadrado dos Números
- **Arquivo:** `Q1_Quadrado.java`
- **Descrição:** Percorre números de 15 a 50 e apresenta o quadrado de cada um
- **Conceitos:** Loop for, cálculos matemáticos
- **Funcionalidades:** Exibe quadrado de cada número na sequência

### Q2 - Tabuada
- **Arquivo:** `Q2_Tabuada.java`
- **Descrição:** Apresenta tabuada de um número fornecido pelo usuário
- **Conceitos:** Loop for, entrada do usuário
- **Funcionalidades:** Multiplica número de 1 a 10

### Q3 - Soma dos Valores de 1 a 100
- **Arquivo:** `Q3_Soma100Valores.java`
- **Descrição:** Soma todos os valores de 1 a 100
- **Conceitos:** Loop for, acumulador
- **Funcionalidades:** Calcula soma total da sequência

### Q4 - Somar Números Pares
- **Arquivo:** `Q4_SomarPares.java`
- **Descrição:** Soma todos os números pares de 1 a 500
- **Conceitos:** Loop for, condicionais, operador módulo
- **Funcionalidades:** Identifica pares e soma

### Q5 - Exibir Números Ímpares
- **Arquivo:** `Q5_ExibirImpares.java`
- **Descrição:** Exibe todos os números ímpares de 1 a 20
- **Conceitos:** Loop for, condicionais, operador módulo
- **Funcionalidades:** Identifica e exibe ímpares

### Q6 - Números Divisíveis por 4
- **Arquivo:** `Q6_DivisiveisPor4.java`
- **Descrição:** Exibe números divisíveis por 4 de 1 a 200
- **Conceitos:** Loop for, condicionais, operador módulo
- **Funcionalidades:** Identifica divisibilidade por 4

### Q7 - Potências de 3
- **Arquivo:** `Q7_Potencia.java`
- **Descrição:** Apresenta potências de 3 (expoente 0 a 15)
- **Conceitos:** Loop for aninhado, cálculos de potência
- **Funcionalidades:** Calcula 3^0 até 3^15

### Q8 - Base e Expoente
- **Arquivo:** `Q8_BaseExpoente.java`
- **Descrição:** Calcula potência de base e expoente fornecidos pelo usuário
- **Conceitos:** Loop for, entrada do usuário, cálculos
- **Funcionalidades:** Calcula B^E

### Q9 - Fatorial
- **Arquivo:** `Q9_Fatorial.java`
- **Descrição:** Calcula fatorial de um número fornecido pelo usuário
- **Conceitos:** Loop for, cálculos matemáticos
- **Funcionalidades:** Calcula n! = n × (n-1) × ... × 1

### Q10 - Somatória de Fatoriais
- **Arquivo:** `Q10_SomatoriaFatorial.java`
- **Descrição:** Calcula somatória dos fatoriais de 5 valores
- **Conceitos:** Loop for aninhado, acumulador
- **Funcionalidades:** Lê 5 valores, calcula fatorial de cada um e soma

---

## 🚀 Como Executar

1. **Compilar:** `javac NomeDoArquivo.java`
2. **Executar:** `java NomeDoArquivo`

### Exemplo:
```bash
javac Q1_Quadrado.java
java Q1_Quadrado
```

---

## 📝 Conceitos Abordados

### Estruturas de Repetição
- **for:** Para loops com contador
- **for aninhado:** Para cálculos complexos
- **Acumuladores:** Para somas e produtos

### Operadores Matemáticos
- **% (módulo):** Para verificar divisibilidade
- *** (multiplicação):** Para cálculos
- **+= (soma acumulativa):** Para somas

### Cálculos Matemáticos
- **Quadrado:** n²
- **Potência:** base^expoente
- **Fatorial:** n! = n × (n-1) × ... × 1
- **Somatória:** Soma de valores

### Controle de Fluxo
- **Condicionais:** Para filtrar valores
- **Loops:** Para repetir operações
- **Acumuladores:** Para somar resultados

---

## 🎯 Objetivos de Aprendizagem

### Estruturas de Repetição
- Compreender o uso do loop for
- Aplicar loops aninhados
- Usar acumuladores corretamente

### Matemática Aplicada
- Calcular quadrados e potências
- Implementar fatorial
- Realizar somatórias

### Lógica de Programação
- Filtrar valores com condicionais
- Acumular resultados
- Organizar cálculos sequenciais

---

## 💡 Dicas Importantes

### Q1 - Quadrado
- Use loop for de 15 a 50
- Calcule quadrado: i * i
- Exiba resultado para cada número

### Q2 - Tabuada
- Solicite número do usuário
- Use loop de 1 a 10
- Exiba multiplicação e resultado

### Q3 - Soma 100 Valores
- Use acumulador (soma += i)
- Loop de 1 a 100
- Exiba soma total

### Q4 - Somar Pares
- Use operador módulo (%)
- Verifique se i % 2 == 0
- Some apenas os pares

### Q5 - Exibir Ímpares
- Use operador módulo (%)
- Verifique se i % 2 != 0
- Exiba apenas os ímpares

### Q6 - Divisíveis por 4
- Use operador módulo (%)
- Verifique se i % 4 == 0
- Exiba apenas os divisíveis

### Q7 - Potências de 3
- Use loop aninhado
- Calcule 3^expoente
- Exiba cada potência

### Q8 - Base e Expoente
- Solicite base e expoente
- Use loop para calcular potência
- Exiba resultado

### Q9 - Fatorial
- Solicite número do usuário
- Use loop para calcular fatorial
- Exiba resultado e cálculo

### Q10 - Somatória de Fatoriais
- Use loop para ler 5 valores
- Calcule fatorial de cada um
- Some todos os fatoriais

---

## 🔧 Fórmulas Utilizadas

### Quadrado
- **Fórmula:** n² = n × n

### Potência
- **Fórmula:** base^expoente = base × base × ... × base (expoente vezes)

### Fatorial
- **Fórmula:** n! = n × (n-1) × (n-2) × ... × 2 × 1
- **Casos especiais:** 0! = 1, 1! = 1

### Soma de Sequência
- **Fórmula:** 1 + 2 + 3 + ... + n = n × (n + 1) / 2
