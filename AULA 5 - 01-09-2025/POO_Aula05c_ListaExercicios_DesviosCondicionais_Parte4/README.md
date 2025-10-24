# POO - Aula 05c - Lista de Exercícios
## Desvios Condicionais - Parte 4

**Professor:** Marçal  
**Disciplina:** Programação Orientada a Objetos  
**Fonte:** Marçal, J. 2020

---

## 📋 Lista de Exercícios

### Q1 - Figuras Geométricas
- **Arquivo:** `Q1_FigurasGeometricas.java`
- **Descrição:** Calcula área de 4 figuras geométricas (retângulo, triângulo, quadrado, círculo)
- **Conceitos:** Cálculos de área, comparações, ordenação
- **Funcionalidades:**
  - Calcula área de cada figura
  - Identifica figura com menor área
  - Identifica figura com maior área
  - Exibe áreas em ordem crescente

### Q2 - Cálculo de Dinheiro para Viagem
- **Arquivo:** `Q2_CalculoDinheiroViagem.java`
- **Descrição:** Calcula informações financeiras para 4 amigos em intercâmbio
- **Conceitos:** Conversão de moedas, comparações, ordenação
- **Funcionalidades:**
  - Soma total em reais
  - Identifica amigo com maior/menor quantidade
  - Converte para dólar, euro e libra
  - Ordena valores do menor para o maior

### Q3 - Cálculo de Nota dos Alunos
- **Arquivo:** `Q3_CalculoNotaAlunos.java`
- **Descrição:** Calcula médias de 3 alunos com pesos específicos
- **Conceitos:** Média ponderada, contadores, ordenação
- **Funcionalidades:**
  - Calcula média com pesos (30%, 40%, 30%)
  - Verifica aprovação (média >= 7.0)
  - Conta aprovados e reprovados
  - Ordena por média

---

## 🚀 Como Executar

1. **Compilar:** `javac NomeDoArquivo.java`
2. **Executar:** `java NomeDoArquivo`

### Exemplo:
```bash
javac Q1_FigurasGeometricas.java
java Q1_FigurasGeometricas
```

---

## 📝 Conceitos Abordados

### Cálculos Matemáticos
- **Áreas geométricas:** Retângulo, triângulo, quadrado, círculo
- **Conversão de moedas:** Dólar, euro, libra esterlina
- **Média ponderada:** Com pesos específicos

### Estruturas Condicionais Avançadas
- **Múltiplas comparações:** Para encontrar maior/menor
- **Condicionais aninhadas:** Para classificação
- **Contadores:** Para estatísticas

### Ordenação e Classificação
- **Ordenação sem arrays:** Usando apenas condicionais
- **Classificação por critérios:** Área, valor, média
- **Identificação de extremos:** Maior e menor valores

### Validação e Controle
- **Verificação de aprovação:** Média >= 7.0
- **Contagem de resultados:** Aprovados vs reprovados
- **Cálculos estatísticos:** Média geral

---

## 🎯 Objetivos de Aprendizagem

### Matemática Aplicada
- Calcular áreas de figuras geométricas
- Realizar conversões monetárias
- Aplicar médias ponderadas

### Lógica de Programação
- Implementar ordenação sem estruturas de dados
- Aplicar múltiplas condições
- Usar contadores para estatísticas

### Resolução de Problemas Complexos
- Integrar múltiplos cálculos
- Organizar informações de forma lógica
- Apresentar resultados de forma clara

---

## 💡 Dicas Importantes

### Q1 - Figuras Geométricas
- **Retângulo:** base × altura
- **Triângulo:** (base × altura) ÷ 2
- **Quadrado:** lado²
- **Círculo:** π × raio²
- Use comparações para encontrar maior/menor
- Ordene sem usar arrays

### Q2 - Cálculo de Dinheiro
- Solicite cotações das moedas
- Armazene nomes e valores dos amigos
- Converta cada valor para as 3 moedas
- Ordene valores do menor para o maior

### Q3 - Cálculo de Notas
- Aplique pesos: 30%, 40%, 30%
- Verifique aprovação com média >= 7.0
- Conte aprovados e reprovados
- Ordene por média calculada

---

## 🔧 Fórmulas Utilizadas

### Áreas Geométricas
- **Retângulo:** A = b × h
- **Triângulo:** A = (b × h) / 2
- **Quadrado:** A = l²
- **Círculo:** A = π × r²

### Conversão de Moedas
- **Dólar:** Valor ÷ Cotação Dólar
- **Euro:** Valor ÷ Cotação Euro
- **Libra:** Valor ÷ Cotação Libra

### Média Ponderada
- **Média:** (Nota1 × 0.30) + (Nota2 × 0.40) + (NotaPluri × 0.30)
