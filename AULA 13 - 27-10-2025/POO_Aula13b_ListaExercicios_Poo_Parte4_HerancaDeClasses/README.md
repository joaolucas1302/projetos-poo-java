# PROGRAMAÇÃO ORIENTADA A OBJETOS (POO)
**Professor:** Me. Marçal  
**Data:** 27/10/2025

## LISTA DE EXERCÍCIOS - POO (Herança)

---

## 📋 Questão 01 - Sistema Veterinário

Um determinado veterinário após abrir sua clínica necessita de um sistema para fazer o controle dos animais que irão ser atendidos. Este veterinário atende animais de pequeno e médio porte entre mamíferos e repteis.

### Requisitos:

**A. Dados comuns de cada animal:**
- Nome
- Peso
- Idade
- Sexo
- Data de entrada
- Motivo atendimento do animal
- Nome responsável
- CPF responsável
- Telefone contato responsável

**B. Para os mamíferos:**
- Tipo (gato, cachorro, porco, coelho, outro)
- Cor
- Alimentação (Carnívoro, Herbívoro)

**C. Para os répteis:**
- Classificação (Escamados, Crocodilianos, Lacertílios)
- Tipo reprodução (Ovípara, Fecundação)
- Tipo de habitat (Aquático, Terrestre)

**D. Sistema:**
- Cadastro com código gerado automaticamente
- Base de dados (vetor ou List)
- Funcionalidades:
  - Inserção
  - Pesquisa (por código)
  - Exclusão (por código)
  - Relatório (imprimir todos animais cadastrados)
- **Fundamental:** Utilizar o conceito de Herança

### 📂 Localização:
`Q1_Veterinario/`

### 🏃 Como executar:
```bash
cd "Q1_Veterinario"
javac *.java
java SistemaVeterinario
```

---

## 📋 Questão 02 - Sistema de Folha de Pagamento

A empresa Tecnologia Ao Seu Alcance LTDA irá desenvolver seu próprio sistema de folha de pagamento.

### Requisitos:

**A. Dados comuns de todos os colaboradores:**
- Código interno
- Nome
- CPF
- Data de admissão
- Salário

**Regras de validação:**
- ❌ Salário não pode ser negativo ou zero
- ✅ Nome deve ter mais de 10 caracteres
- 🔢 Código interno gerado automaticamente no formato YYMMSSS:
  - YY = ano
  - MM = mês
  - SSS = código randômico
- 📝 CPF não pode conter letras e deve ter exatamente 11 dígitos

**B. Engenheiros:**
- Tipo (Civil, Ambiental, Produção, Outro)
- Nível (Estagiário, Junior, Pleno, Senior)

**C. Diretores:**
- Área (Administrativo, Comercial, Marketing, Financeiro, Faturamento, outro)
- Data da posse

**D. Geral:**
- Cargo (Limpeza, Secretaria, Controle acesso, Segurança, outro)
- Área (Fiscal, Comercial, Financeira, Vendas, outra)

**E. Funcionalidades do Sistema:**
- `Inserir(Valor)` – Insere um novo registro
- `Alterar(Codigo, NovoValor)` – Recebe o código do colaborador e novas informações
- `Excluir(Codigo)` – Remove o colaborador pelo código
- `Pesquisar(Codigo)` – Localiza colaborador pelo código
- `Pesquisar(NomeParcial)` – Localiza colaboradores por parte do nome
- `Relatório` – Imprime informações de todos os colaboradores

### 📂 Localização:
`Q2_Colaboradores/`

### 🏃 Como executar:
```bash
cd "Q2_Colaboradores"
javac *.java
java SistemaFolhaPagamento
```

---

## 📚 Conceitos Abordados:
- ✅ Herança
- ✅ Encapsulamento
- ✅ Enumerações (Enum)
- ✅ Validações
- ✅ Manipulação de Datas
- ✅ Geração de números aleatórios
- ✅ CRUD completo
- ✅ ArrayList/List

---

## 💡 Dicas:
- Use `LocalDate` para trabalhar com datas
- Use `Random` para gerar códigos aleatórios
- Use `String.contains()` para pesquisa parcial de nomes
- Use `ArrayList<T>` para armazenar os registros
- Crie classes de Enum para tipos e categorias
