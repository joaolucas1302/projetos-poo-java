using System;

namespace POO_Aula10b_ListaExercicios_Poo_Parte1
{
    /// <summary>
    /// Classe responsável pelo menu interativo do sistema de alunos
    /// </summary>
    public class MenuAluno
    {
        private Aluno aluno; // Variável para armazenar o objeto Aluno

        /// <summary>
        /// Construtor da classe MenuAluno
        /// </summary>
        public MenuAluno()
        {
            aluno = null;
        }

        /// <summary>
        /// Método principal que exibe o menu e gerencia as opções
        /// </summary>
        public void Exibir()
        {
            int opcao;

            // Menu interativo principal
            do
            {
                Console.Clear();
                Console.WriteLine("=== SISTEMA DE CADASTRO DE ALUNOS ===");
                Console.WriteLine("1. Adicionar Aluno");
                Console.WriteLine("2. Exibir Aluno");
                Console.WriteLine("3. Sair");
                Console.WriteLine("=====================================");
                Console.Write("Escolha uma opção: ");

                // Validação da entrada do usuário
                while (!int.TryParse(Console.ReadLine(), out opcao) || opcao < 1 || opcao > 3)
                {
                    Console.Write("Opção inválida! Digite um número entre 1 e 3: ");
                }

                switch (opcao)
                {
                    case 1:
                        AdicionarAluno();
                        break;
                    case 2:
                        ExibirAluno();
                        break;
                    case 3:
                        Console.WriteLine("Saindo do sistema...");
                        break;
                }
            } while (opcao != 3);
        }

        /// <summary>
        /// Método para adicionar um novo aluno
        /// </summary>
        private void AdicionarAluno()
        {
            Console.Clear();
            Console.WriteLine("=== CADASTRAR NOVO ALUNO ===");
            
            // Instancia um novo objeto Aluno
            aluno = new Aluno();
            
            // Solicita e armazena os dados do aluno
            Console.Write("Digite o RA: ");
            aluno.RA = Console.ReadLine();
            
            Console.Write("Digite o Nome: ");
            aluno.Nome = Console.ReadLine();
            
            Console.Write("Digite a Idade: ");
            while (!int.TryParse(Console.ReadLine(), out int idade) || idade <= 0)
            {
                Console.Write("Idade inválida! Digite um número positivo: ");
            }
            aluno.Idade = idade;
            
            Console.Write("Digite o CPF: ");
            aluno.CPF = Console.ReadLine();
            
            Console.Write("Digite o Sexo (M/F): ");
            aluno.Sexo = Console.ReadLine();
            
            Console.Write("Digite o E-mail: ");
            aluno.Email = Console.ReadLine();
            
            Console.Write("Digite o Telefone: ");
            aluno.Telefone = Console.ReadLine();
            
            Console.WriteLine("\nAluno cadastrado com sucesso!");
            Console.WriteLine("Pressione qualquer tecla para continuar...");
            Console.ReadKey();
        }

        /// <summary>
        /// Método para exibir os dados do aluno cadastrado
        /// </summary>
        private void ExibirAluno()
        {
            Console.Clear();
            if (aluno != null)
            {
                aluno.ExibirDados();
            }
            else
            {
                Console.WriteLine("Nenhum aluno cadastrado!");
            }
            Console.WriteLine("\nPressione qualquer tecla para continuar...");
            Console.ReadKey();
        }
    }
}

