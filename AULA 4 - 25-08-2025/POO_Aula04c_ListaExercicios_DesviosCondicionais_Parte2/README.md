# POO - Aula 04c - Lista de Exercícios
## Desvios Condicionais - Parte 2

**Professor:** Marçal  
**Disciplina:** Programação Orientada a Objetos  
**Fonte:** Manzano, 2005

---

## 📋 Lista de Exercícios

### Q1 - Maior e Menor entre 5 Valores
- **Arquivo:** `Q1_MaiorMenor5Valores.java`
- **Descrição:** Identifica o maior e menor valor entre 5 números sem usar ordenação, vetores ou repetição
- **Conceitos:** Comparações sequenciais, estruturas condicionais
- **Restrições:** Não usar ordenação, vetores ou comandos de repetição

### Q2 - Verificar se Número é Par ou Ímpar
- **Arquivo:** `Q2_ParImpar.java`
- **Descrição:** Verifica se um número é par ou ímpar
- **Conceitos:** Operador módulo (%), condicionais simples
- **Operador:** % (módulo) para verificar resto da divisão por 2

### Q3 - Verificar Faixa Permitida (1 a 9)
- **Arquivo:** `Q3_FaixaPermitida.java`
- **Descrição:** Verifica se valor está na faixa de 1 a 9 com mensagens específicas
- **Conceitos:** Operadores de comparação, operador lógico AND (&&)
- **Mensagens:** "O valor está na faixa permitida!" ou "O valor informado não é permitido pois não está na faixa de 1 a 9"

### Q4 - Valor Não Maior que 3 (Usando Apenas NOT)
- **Arquivo:** `Q4_ValorNaoMaiorQue3.java`
- **Descrição:** Apresenta valor apenas se não for maior que 3, usando apenas operador NOT
- **Conceitos:** Operador lógico NOT (!), negação de condições
- **Restrições:** Usar apenas operador NOT, não usar operadores relacionais

---

## 🚀 Como Executar

1. **Compilar:** `javac NomeDoArquivo.java`
2. **Executar:** `java NomeDoArquivo`

### Exemplo:
```bash
javac Q1_MaiorMenor5Valores.java
java Q1_MaiorMenor5Valores
```

---

## 📝 Conceitos Abordados

### Estruturas Condicionais
- **if/else:** Decisões simples e complexas
- **Condicionais sequenciais:** Múltiplas verificações sem repetição
- **Lógica de comparação:** Maior, menor, igual

### Operadores Lógicos
- **! (NOT):** Inverte o resultado da condição
- **&& (AND):** Ambas condições devem ser verdadeiras
- **|| (OR):** Pelo menos uma condição deve ser verdadeira

### Operadores Matemáticos
- **% (módulo):** Resto da divisão
- **Comparações:** >, <, >=, <=, ==, !=

### Operadores de Comparação
- **== (igual):** Verifica igualdade
- **!= (diferente):** Verifica diferença
- **> (maior):** Maior que
- **< (menor):** Menor que
- **>= (maior ou igual):** Maior ou igual
- **<= (menor ou igual):** Menor ou igual

---

## 🎯 Objetivos de Aprendizagem

### Lógica de Programação
- Compreender estruturas condicionais avançadas
- Aplicar operadores lógicos corretamente
- Resolver problemas com restrições específicas

### Operadores Específicos
- **Operador NOT (!):** Negação de condições
- **Operador Módulo (%):** Verificação de divisibilidade
- **Comparações sequenciais:** Sem uso de estruturas de repetição

### Resolução de Problemas
- Identificar maior e menor valores sem ordenação
- Verificar propriedades matemáticas (par/ímpar)
- Validar faixas de valores
- Usar apenas operadores específicos conforme restrições

---

## 💡 Dicas Importantes

### Q1 - Maior e Menor
- Use variáveis para armazenar maior e menor
- Compare cada valor sequencialmente
- Não use arrays ou loops

### Q2 - Par ou Ímpar
- Use operador módulo (%) com 2
- Se resto for 0, é par; senão, é ímpar

### Q3 - Faixa Permitida
- Use operador AND (&&) para verificar faixa
- Mensagens específicas conforme especificação

### Q4 - Operador NOT
- Use !(condição) para negar
- !(valor > 3) significa valor <= 3
- Não use operadores relacionais diretamente
