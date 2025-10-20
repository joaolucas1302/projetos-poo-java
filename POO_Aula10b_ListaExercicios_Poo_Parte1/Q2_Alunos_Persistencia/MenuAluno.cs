using System;

namespace POO_Aula10b_ListaExercicios_Poo_Parte1
{
    /// <summary>
    /// Classe responsável pelo menu interativo do sistema de persistência de alunos
    /// </summary>
    public class MenuAluno
    {
        private AlunoBanco bancoDados; // Instância do banco de dados

        /// <summary>
        /// Construtor da classe MenuAluno
        /// </summary>
        public MenuAluno()
        {
            bancoDados = new AlunoBanco();
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
                Console.WriteLine("=== SISTEMA DE PERSISTÊNCIA DE ALUNOS ===");
                Console.WriteLine("1. Cadastrar Aluno");
                Console.WriteLine("2. Exibir Todos os Alunos");
                Console.WriteLine("3. Remover Aluno (por RA)");
                Console.WriteLine("4. Localizar Aluno (por RA)");
                Console.WriteLine("5. Sair");
                Console.WriteLine("==========================================");
                Console.WriteLine($"Total de alunos cadastrados: {bancoDados.QuantidadeAlunos}");
                Console.Write("Escolha uma opção: ");

                // Validação da entrada do usuário
                while (!int.TryParse(Console.ReadLine(), out opcao) || opcao < 1 || opcao > 5)
                {
                    Console.Write("Opção inválida! Digite um número entre 1 e 5: ");
                }

                switch (opcao)
                {
                    case 1:
                        CadastrarAluno();
                        break;
                    case 2:
                        ExibirTodosAlunos();
                        break;
                    case 3:
                        RemoverAluno();
                        break;
                    case 4:
                        LocalizarAluno();
                        break;
                    case 5:
                        Console.WriteLine("Saindo do sistema...");
                        break;
                }
            } while (opcao != 5);
        }

        /// <summary>
        /// Método para cadastrar um novo aluno
        /// </summary>
        private void CadastrarAluno()
        {
            Console.Clear();
            Console.WriteLine("=== CADASTRAR NOVO ALUNO ===");

            // Verifica se ainda há espaço no banco de dados
            if (bancoDados.QuantidadeAlunos >= 100)
            {
                Console.WriteLine("ERRO: Capacidade máxima de alunos atingida!");
                Console.WriteLine("Pressione qualquer tecla para continuar...");
                Console.ReadKey();
                return;
            }

            // Solicita o RA e verifica se já existe
            Console.Write("Digite o RA: ");
            string ra = Console.ReadLine();

            if (bancoDados.BuscarAluno(ra) != null)
            {
                Console.WriteLine("ERRO: Já existe um aluno com este RA!");
                Console.WriteLine("Pressione qualquer tecla para continuar...");
                Console.ReadKey();
                return;
            }

            // Cria um novo objeto Aluno
            Aluno novoAluno = new Aluno();
            novoAluno.RA = ra;

            // Solicita e armazena os demais dados do aluno
            Console.Write("Digite o Nome: ");
            novoAluno.Nome = Console.ReadLine();

            Console.Write("Digite a Idade: ");
            while (!int.TryParse(Console.ReadLine(), out int idade) || idade <= 0)
            {
                Console.Write("Idade inválida! Digite um número positivo: ");
            }
            novoAluno.Idade = idade;

            Console.Write("Digite o CPF: ");
            novoAluno.CPF = Console.ReadLine();

            Console.Write("Digite o Sexo (M/F): ");
            novoAluno.Sexo = Console.ReadLine();

            Console.Write("Digite o E-mail: ");
            novoAluno.Email = Console.ReadLine();

            Console.Write("Digite o Telefone: ");
            novoAluno.Telefone = Console.ReadLine();

            // Adiciona o aluno ao banco de dados
            if (bancoDados.Adicionar(novoAluno))
            {
                Console.WriteLine("\nAluno cadastrado com sucesso!");
            }
            else
            {
                Console.WriteLine("\nERRO: Não foi possível cadastrar o aluno!");
            }

            Console.WriteLine("Pressione qualquer tecla para continuar...");
            Console.ReadKey();
        }

        /// <summary>
        /// Método para exibir todos os alunos cadastrados
        /// </summary>
        private void ExibirTodosAlunos()
        {
            Console.Clear();
            Console.WriteLine("=== LISTA DE TODOS OS ALUNOS ===");

            if (bancoDados.QuantidadeAlunos == 0)
            {
                Console.WriteLine("Nenhum aluno cadastrado!");
            }
            else
            {
                Aluno[] todosAlunos = bancoDados.ObterTodosAlunos();
                for (int i = 0; i < todosAlunos.Length; i++)
                {
                    Console.WriteLine($"\n--- Aluno {i + 1} ---");
                    todosAlunos[i].ExibirDados();
                }
            }

            Console.WriteLine("\nPressione qualquer tecla para continuar...");
            Console.ReadKey();
        }

        /// <summary>
        /// Método para remover um aluno pelo RA
        /// </summary>
        private void RemoverAluno()
        {
            Console.Clear();
            Console.WriteLine("=== REMOVER ALUNO ===");

            if (bancoDados.QuantidadeAlunos == 0)
            {
                Console.WriteLine("Nenhum aluno cadastrado!");
                Console.WriteLine("Pressione qualquer tecla para continuar...");
                Console.ReadKey();
                return;
            }

            Console.Write("Digite o RA do aluno a ser removido: ");
            string ra = Console.ReadLine();

            Aluno aluno = bancoDados.BuscarAluno(ra);

            if (aluno == null)
            {
                Console.WriteLine("Aluno não encontrado!");
            }
            else
            {
                // Exibe os dados do aluno antes de remover
                Console.WriteLine("\nAluno encontrado:");
                aluno.ExibirDados();

                Console.Write("\nDeseja realmente remover este aluno? (S/N): ");
                string confirmacao = Console.ReadLine().ToUpper();

                if (confirmacao == "S" || confirmacao == "SIM")
                {
                    if (bancoDados.Remover(ra))
                    {
                        Console.WriteLine("Aluno removido com sucesso!");
                    }
                    else
                    {
                        Console.WriteLine("ERRO: Não foi possível remover o aluno!");
                    }
                }
                else
                {
                    Console.WriteLine("Operação cancelada!");
                }
            }

            Console.WriteLine("Pressione qualquer tecla para continuar...");
            Console.ReadKey();
        }

        /// <summary>
        /// Método para localizar um aluno pelo RA
        /// </summary>
        private void LocalizarAluno()
        {
            Console.Clear();
            Console.WriteLine("=== LOCALIZAR ALUNO ===");

            if (bancoDados.QuantidadeAlunos == 0)
            {
                Console.WriteLine("Nenhum aluno cadastrado!");
                Console.WriteLine("Pressione qualquer tecla para continuar...");
                Console.ReadKey();
                return;
            }

            Console.Write("Digite o RA do aluno a ser localizado: ");
            string ra = Console.ReadLine();

            Aluno aluno = bancoDados.BuscarAluno(ra);

            if (aluno == null)
            {
                Console.WriteLine("Aluno não encontrado!");
            }
            else
            {
                Console.WriteLine("\nAluno encontrado:");
                aluno.ExibirDados();
            }

            Console.WriteLine("\nPressione qualquer tecla para continuar...");
            Console.ReadKey();
        }
    }
}

