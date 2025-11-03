# Questão 02 - Sistema de Folha de Pagamento

## 📝 Descrição
Sistema para gerenciar colaboradores de uma empresa com diferentes tipos: Engenheiros, Diretores e Colaboradores Gerais.

## 🏗️ Estrutura de Classes

### Hierarquia de Herança
```
Colaborador (classe base)
├── Engenheiro (herda de Colaborador)
├── Diretor (herda de Colaborador)
└── ColaboradorGeral (herda de Colaborador)
```

### Classes Criadas
- ✅ `Colaborador.java` - Classe base com validações
- ✅ `Engenheiro.java` - Classe para engenheiros
- ✅ `Diretor.java` - Classe para diretores
- ✅ `ColaboradorGeral.java` - Classe para colaboradores gerais
- ✅ `ColaboradorBanco.java` - Gerenciamento de dados (CRUD)
- ✅ `SistemaFolhaPagamento.java` - Sistema principal com menu

### Enumerações (Enum)
- ✅ `EnumTipoEngenheiro.java` - Tipos de engenharia
- ✅ `EnumNivel.java` - Níveis profissionais
- ✅ `EnumAreaDiretor.java` - Áreas de diretoria
- ✅ `EnumCargo.java` - Cargos gerais
- ✅ `EnumAreaGeral.java` - Áreas gerais

## 🚀 Como Compilar e Executar

### Windows (PowerShell)
```powershell
cd "AULA 13 - 27-10-2025\POO_Aula13b_ListaExercicios_Poo_Parte4_HerancaDeClasses\Q2_Colaboradores"
javac *.java
java SistemaFolhaPagamento
```

### Linux/Mac (Terminal)
```bash
cd "AULA 13 - 27-10-2025/POO_Aula13b_ListaExercicios_Poo_Parte4_HerancaDeClasses/Q2_Colaboradores"
javac *.java
java SistemaFolhaPagamento
```

## 📋 Funcionalidades

1. **Cadastrar Engenheiro**
   - Nome (> 10 caracteres)
   - CPF (11 dígitos)
   - Salário (> 0)
   - Tipo e Nível

2. **Cadastrar Diretor**
   - Dados comuns
   - Área e Data da Posse

3. **Cadastrar Colaborador Geral**
   - Dados comuns
   - Cargo e Área

4. **Pesquisar por Código**
   - Busca exata

5. **Pesquisar por Nome**
   - Busca parcial (contains)

6. **Excluir Colaborador**
   - Remoção por código

7. **Relatório Completo**
   - Lista todos os colaboradores

## ✅ Validações Implementadas

### Código Interno (Gerado Automaticamente)
- Formato: **YYMMSSS**
- YY = Ano (2 dígitos)
- MM = Mês (2 dígitos)
- SSS = Código aleatório (3 dígitos)
- Exemplo: `25110342` (Novembro/2025, código 342)

### Nome
- ✅ Deve ter **mais de 10 caracteres**
- ❌ Lança exceção se não atender

### CPF
- ✅ Deve ter **exatamente 11 dígitos**
- ✅ Remove caracteres não numéricos automaticamente
- ❌ Lança exceção se não atender

### Salário
- ✅ Deve ser **maior que zero**
- ❌ Lança exceção se negativo ou zero

## 💡 Conceitos Aplicados

- ✅ **Herança** - 3 tipos de colaboradores herdam da classe base
- ✅ **Encapsulamento** - Getters e Setters com validações
- ✅ **Polimorfismo** - Método toString() sobrescrito
- ✅ **Exceções** - IllegalArgumentException para validações
- ✅ **Enumerações** - Categorias padronizadas
- ✅ **ArrayList** - Armazenamento dinâmico
- ✅ **LocalDate** - Manipulação de datas
- ✅ **Random** - Geração de códigos aleatórios
- ✅ **String.contains()** - Pesquisa parcial
- ✅ **CRUD Completo** - Create, Read, Update, Delete

## 📊 Exemplo de Uso

```
=== CADASTRAR ENGENHEIRO ===
Nome (mais de 10 caracteres): Maria da Silva Santos
CPF (11 dígitos): 123.456.789-01
Salário: R$ 8500.00
✅ Código interno gerado: 25110123
✅ Data de admissão: 2025-11-03

--- Dados do Engenheiro ---
Tipo: CIVIL
Nível: PLENO

✅ Colaborador cadastrado com sucesso! Código: 25110123
```

## 🔍 Pesquisa por Nome Parcial

```
=== PESQUISAR POR NOME ===
Digite parte do nome: silva

✅ 2 colaborador(es) encontrado(s):
=== COLABORADOR ===
Código Interno: 25110123
Nome: Maria da Silva Santos
CPF: 123.456.789-01
...
```

## 🎯 Regras de Negócio

1. **Código único** gerado automaticamente
2. **Nome obrigatório** com mais de 10 caracteres
3. **CPF válido** com 11 dígitos
4. **Salário positivo** obrigatório
5. **Data de admissão** registrada automaticamente
6. **Pesquisa flexível** por nome parcial
