# Questão 01 - Sistema Veterinário

## 📝 Descrição
Sistema para controle de animais atendidos em uma clínica veterinária que atende mamíferos e répteis.

## 🏗️ Estrutura de Classes

### Hierarquia de Herança
```
Animal (classe base)
├── Mamifero (herda de Animal)
└── Reptil (herda de Animal)
```

### Classes Criadas
- ✅ `Animal.java` - Classe base com dados comuns
- ✅ `Mamifero.java` - Classe para mamíferos
- ✅ `Reptil.java` - Classe para répteis
- ✅ `AnimalBanco.java` - Gerenciamento de dados
- ✅ `SistemaVeterinario.java` - Sistema principal com menu

### Enumerações (Enum)
- ✅ `EnumTipoMamifero.java` - Tipos de mamíferos
- ✅ `EnumAlimentacao.java` - Tipo de alimentação
- ✅ `EnumClassificacaoReptil.java` - Classificação de répteis
- ✅ `EnumTipoReproducao.java` - Tipo de reprodução
- ✅ `EnumHabitat.java` - Tipo de habitat

## 🚀 Como Compilar e Executar

### Windows (PowerShell)
```powershell
cd "AULA 13 - 27-10-2025\POO_Aula13b_ListaExercicios_Poo_Parte4_HerancaDeClasses\Q1_Veterinario"
javac *.java
java SistemaVeterinario
```

### Linux/Mac (Terminal)
```bash
cd "AULA 13 - 27-10-2025/POO_Aula13b_ListaExercicios_Poo_Parte4_HerancaDeClasses/Q1_Veterinario"
javac *.java
java SistemaVeterinario
```

## 📋 Funcionalidades

1. **Cadastrar Mamífero**
   - Dados do animal (nome, peso, idade, sexo, etc.)
   - Dados do responsável (nome, CPF, telefone)
   - Tipo, cor e alimentação

2. **Cadastrar Réptil**
   - Dados do animal
   - Dados do responsável
   - Classificação, reprodução e habitat

3. **Pesquisar Animal**
   - Busca por código

4. **Excluir Animal**
   - Remoção por código

5. **Relatório Completo**
   - Lista todos os animais cadastrados

## 💡 Conceitos Aplicados

- ✅ **Herança** - Mamifero e Reptil herdam de Animal
- ✅ **Encapsulamento** - Getters e Setters
- ✅ **Polimorfismo** - Método toString() sobrescrito
- ✅ **Enumerações** - Tipos e categorias padronizados
- ✅ **ArrayList** - Armazenamento dinâmico
- ✅ **LocalDate** - Manipulação de datas

## 📊 Exemplo de Uso

```
=== CADASTRAR MAMÍFERO ===
Nome do animal: Rex
Peso (kg): 25.5
Idade (anos): 3
Sexo (M/F): M
Motivo do atendimento: Vacinação
--- Dados do Responsável ---
Nome: João Silva
CPF: 12345678901
Telefone: (11) 98765-4321
--- Dados do Mamífero ---
Tipo: CACHORRO
Cor: Marrom
Alimentação: CARNIVORO

✅ Animal cadastrado com sucesso! Código: 1
```
