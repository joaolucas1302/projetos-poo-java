# POO - Aula 04d - Lista de Exercícios
## Desvios Condicionais - Parte 3

**Professor:** Marçal  
**Disciplina:** Programação Orientada a Objetos  
**Fonte:** Marçal, J. 2020

---

## 📋 Lista de Exercícios

### Q1 - Ordenar 3 Valores
- **Arquivo:** `Q1_Ordenar3Valores.java`
- **Descrição:** Solicita 3 valores inteiros e os apresenta ordenados
- **Conceitos:** Ordenação sem uso de arrays, estruturas condicionais complexas
- **Funcionalidades:** Identifica menor, meio e maior valor

### Q2 - Maior Valor com Validação
- **Arquivo:** `Q2_MaiorComValidacao.java`
- **Descrição:** Solicita dois valores e exibe o maior, validando se são iguais
- **Conceitos:** Validação de entrada, estruturas condicionais
- **Validação:** Não permite valores iguais

### Q3 - Classificar por Idade
- **Arquivo:** `Q3_ClassificarPorIdade.java`
- **Descrição:** Classifica idade em faixas etárias com mensagens específicas
- **Conceitos:** Múltiplas condições, faixas etárias
- **Faixas:** 0-10, 11-14, 15-18, 19-21, >21

### Q4 - Cálculo do IMC
- **Arquivo:** `Q4_CalculoIMC.java`
- **Descrição:** Calcula Índice de Massa Corporal e classifica
- **Conceitos:** Cálculos matemáticos, classificação por faixas
- **Fórmula:** IMC = Peso / (Altura)²

### Q5 - Aprovado/Reprovado com Pesos
- **Arquivo:** `Q5_AprovadoReprovado.java`
- **Descrição:** Calcula média com pesos específicos e classifica aprovação
- **Conceitos:** Média ponderada, múltiplas condições
- **Pesos:** AV1 (30%), AV2 (40%), Trabalho (30%)

### Q6 - Ordenar sem Valores Repetidos
- **Arquivo:** `Q6_OrdenarSemRepetidos.java`
- **Descrição:** Ordena 3 valores sem permitir repetidos
- **Conceitos:** Validação de entrada, ordenação
- **Restrição:** Não permite valores iguais

### Q7 - Contar Pares e Ímpares
- **Arquivo:** `Q7_ContarParesImpares.java`
- **Descrição:** Conta quantidade de números pares e ímpares
- **Conceitos:** Contadores, operador módulo, comparações
- **Saída:** Quantidade de cada tipo e qual foi mais fornecido

---

## 🚀 Como Executar

1. **Compilar:** `javac NomeDoArquivo.java`
2. **Executar:** `java NomeDoArquivo`

### Exemplo:
```bash
javac Q1_Ordenar3Valores.java
java Q1_Ordenar3Valores
```

---

## 📝 Conceitos Abordados

### Estruturas Condicionais Avançadas
- **if/else aninhados:** Múltiplas condições
- **Múltiplas condições:** Faixas de valores
- **Validação de entrada:** Verificação de dados

### Operadores e Cálculos
- **Operador módulo (%):** Para verificar par/ímpar
- **Cálculos matemáticos:** IMC, média ponderada
- **Comparações complexas:** Ordenação sem arrays

### Validação e Controle
- **Validação de entrada:** Valores únicos, faixas válidas
- **Contadores:** Para pares e ímpares
- **Mensagens específicas:** Conforme classificação

### Classificações e Faixas
- **Faixas etárias:** Diferentes mensagens por idade
- **Classificação IMC:** Abaixo do peso, normal, sobrepeso, obesidade
- **Classificação acadêmica:** Reprovado, aprovado, excelência

---

## 🎯 Objetivos de Aprendizagem

### Lógica de Programação
- Implementar ordenação sem estruturas de dados
- Aplicar validações de entrada
- Resolver problemas com múltiplas condições

### Cálculos e Classificações
- Realizar cálculos matemáticos (IMC, média ponderada)
- Implementar classificações por faixas
- Aplicar pesos em cálculos

### Controle de Fluxo
- Usar contadores para estatísticas
- Implementar validações de dados
- Criar mensagens específicas por situação

---

## 💡 Dicas Importantes

### Q1 - Ordenar 3 Valores
- Use comparações para encontrar menor, meio e maior
- Trate casos de valores iguais
- Não use arrays ou estruturas de repetição

### Q2 - Maior com Validação
- Valide se valores são iguais antes de comparar
- Exiba mensagem de erro se valores forem iguais

### Q3 - Classificar por Idade
- Use faixas etárias específicas
- Mensagens exatas conforme especificação

### Q4 - Cálculo do IMC
- Use a fórmula: IMC = Peso / (Altura)²
- Classifique conforme tabela padrão do IMC

### Q5 - Aprovado/Reprovado
- Aplique pesos específicos: 30%, 40%, 30%
- Use faixas de classificação: 0-4.99, 5.00-7.49, >7.50

### Q6 - Ordenar sem Repetidos
- Valide cada valor antes de aceitar
- Não permita valores iguais

### Q7 - Contar Pares e Ímpares
- Use contadores para cada tipo
- Determine qual tipo foi mais fornecido
