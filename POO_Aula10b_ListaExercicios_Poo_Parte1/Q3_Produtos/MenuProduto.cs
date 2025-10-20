using System;

namespace POO_Aula10b_ListaExercicios_Poo_Parte1
{
    /// <summary>
    /// Classe responsável pelo menu interativo do sistema de produtos
    /// </summary>
    public class MenuProduto
    {
        private ProdutoBanco bancoDados; // Instância do banco de dados

        /// <summary>
        /// Construtor da classe MenuProduto
        /// </summary>
        public MenuProduto()
        {
            bancoDados = new ProdutoBanco();
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
                Console.WriteLine("=== SISTEMA DE CONTROLE DE PRODUTOS ===");
                Console.WriteLine("1. Cadastrar Produto");
                Console.WriteLine("2. Pesquisar Produto (por código)");
                Console.WriteLine("3. Remover Produto (por código)");
                Console.WriteLine("4. Imprimir Todos os Produtos");
                Console.WriteLine("5. Limpar Base de Dados");
                Console.WriteLine("6. Contar Número de Produtos Cadastrados");
                Console.WriteLine("7. Exibir Produto com Maior Preço de Venda");
                Console.WriteLine("8. Sair");
                Console.WriteLine("=======================================");
                Console.WriteLine($"Total de produtos cadastrados: {bancoDados.QuantidadeProdutos}");
                Console.Write("Escolha uma opção: ");

                // Validação da entrada do usuário
                while (!int.TryParse(Console.ReadLine(), out opcao) || opcao < 1 || opcao > 8)
                {
                    Console.Write("Opção inválida! Digite um número entre 1 e 8: ");
                }

                switch (opcao)
                {
                    case 1:
                        CadastrarProduto();
                        break;
                    case 2:
                        PesquisarProduto();
                        break;
                    case 3:
                        RemoverProduto();
                        break;
                    case 4:
                        ImprimirTodosProdutos();
                        break;
                    case 5:
                        LimparBaseDados();
                        break;
                    case 6:
                        ContarProdutos();
                        break;
                    case 7:
                        ExibirProdutoMaiorPreco();
                        break;
                    case 8:
                        Console.WriteLine("Saindo do sistema...");
                        break;
                }
            } while (opcao != 8);
        }

        /// <summary>
        /// Método para cadastrar um novo produto
        /// </summary>
        private void CadastrarProduto()
        {
            Console.Clear();
            Console.WriteLine("=== CADASTRAR NOVO PRODUTO ===");

            // Verifica se ainda há espaço no banco de dados
            if (bancoDados.QuantidadeProdutos >= bancoDados.CapacidadeMaxima)
            {
                Console.WriteLine("ERRO: Capacidade máxima de produtos atingida!");
                Console.WriteLine("Pressione qualquer tecla para continuar...");
                Console.ReadKey();
                return;
            }

            // Solicita o código e verifica se já existe
            Console.Write("Digite o Código do produto: ");
            while (!int.TryParse(Console.ReadLine(), out int codigo) || codigo <= 0)
            {
                Console.Write("Código inválido! Digite um número positivo: ");
            }

            if (bancoDados.BuscarProduto(codigo) != null)
            {
                Console.WriteLine("ERRO: Já existe um produto com este código!");
                Console.WriteLine("Pressione qualquer tecla para continuar...");
                Console.ReadKey();
                return;
            }

            // Cria um novo objeto Produto
            Produto novoProduto = new Produto();
            novoProduto.Codigo = codigo;

            // Solicita e armazena os demais dados do produto
            Console.Write("Digite o Nome do produto: ");
            novoProduto.Nome = Console.ReadLine();

            Console.Write("Digite a Descrição do produto: ");
            novoProduto.Descricao = Console.ReadLine();

            Console.Write("Digite a Quantidade em Estoque: ");
            while (!int.TryParse(Console.ReadLine(), out int quantidade) || quantidade < 0)
            {
                Console.Write("Quantidade inválida! Digite um número não negativo: ");
            }
            novoProduto.QuantidadeEstoque = quantidade;

            Console.Write("Digite o Preço de Custo: R$ ");
            while (!double.TryParse(Console.ReadLine(), out double precoCusto) || precoCusto < 0)
            {
                Console.Write("Preço inválido! Digite um valor não negativo: R$ ");
            }
            novoProduto.PrecoCusto = precoCusto;

            Console.Write("Digite a Margem de Lucro (em decimal, ex: 0.5 para 50%): ");
            while (!double.TryParse(Console.ReadLine(), out double margemLucro) || margemLucro < 0)
            {
                Console.Write("Margem inválida! Digite um valor não negativo: ");
            }
            novoProduto.MargemLucro = margemLucro;

            // Adiciona o produto ao banco de dados
            if (bancoDados.Adicionar(novoProduto))
            {
                Console.WriteLine("\nProduto cadastrado com sucesso!");
                Console.WriteLine($"Preço de Venda calculado: R$ {novoProduto.PrecoVenda:F2}");
            }
            else
            {
                Console.WriteLine("\nERRO: Não foi possível cadastrar o produto!");
            }

            Console.WriteLine("Pressione qualquer tecla para continuar...");
            Console.ReadKey();
        }

        /// <summary>
        /// Método para pesquisar um produto pelo código
        /// </summary>
        private void PesquisarProduto()
        {
            Console.Clear();
            Console.WriteLine("=== PESQUISAR PRODUTO ===");

            if (bancoDados.QuantidadeProdutos == 0)
            {
                Console.WriteLine("Nenhum produto cadastrado!");
                Console.WriteLine("Pressione qualquer tecla para continuar...");
                Console.ReadKey();
                return;
            }

            Console.Write("Digite o código do produto a ser pesquisado: ");
            while (!int.TryParse(Console.ReadLine(), out int codigo) || codigo <= 0)
            {
                Console.Write("Código inválido! Digite um número positivo: ");
            }

            Produto produto = bancoDados.BuscarProduto(codigo);

            if (produto == null)
            {
                Console.WriteLine("Produto não encontrado!");
            }
            else
            {
                Console.WriteLine("\nProduto encontrado:");
                produto.ExibirDados();
            }

            Console.WriteLine("\nPressione qualquer tecla para continuar...");
            Console.ReadKey();
        }

        /// <summary>
        /// Método para remover um produto pelo código
        /// </summary>
        private void RemoverProduto()
        {
            Console.Clear();
            Console.WriteLine("=== REMOVER PRODUTO ===");

            if (bancoDados.QuantidadeProdutos == 0)
            {
                Console.WriteLine("Nenhum produto cadastrado!");
                Console.WriteLine("Pressione qualquer tecla para continuar...");
                Console.ReadKey();
                return;
            }

            Console.Write("Digite o código do produto a ser removido: ");
            while (!int.TryParse(Console.ReadLine(), out int codigo) || codigo <= 0)
            {
                Console.Write("Código inválido! Digite um número positivo: ");
            }

            Produto produto = bancoDados.BuscarProduto(codigo);

            if (produto == null)
            {
                Console.WriteLine("Produto não encontrado!");
            }
            else
            {
                // Exibe os dados do produto antes de remover
                Console.WriteLine("\nProduto encontrado:");
                produto.ExibirDados();

                Console.Write("\nDeseja realmente remover este produto? (S/N): ");
                string confirmacao = Console.ReadLine().ToUpper();

                if (confirmacao == "S" || confirmacao == "SIM")
                {
                    if (bancoDados.Remover(codigo))
                    {
                        Console.WriteLine("Produto removido com sucesso!");
                    }
                    else
                    {
                        Console.WriteLine("ERRO: Não foi possível remover o produto!");
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
        /// Método para imprimir todos os produtos cadastrados
        /// </summary>
        private void ImprimirTodosProdutos()
        {
            Console.Clear();
            Console.WriteLine("=== LISTA DE TODOS OS PRODUTOS ===");

            if (bancoDados.QuantidadeProdutos == 0)
            {
                Console.WriteLine("Nenhum produto cadastrado!");
            }
            else
            {
                Produto[] todosProdutos = bancoDados.ObterTodosProdutos();
                for (int i = 0; i < todosProdutos.Length; i++)
                {
                    Console.WriteLine($"\n--- Produto {i + 1} ---");
                    todosProdutos[i].ExibirDados();
                }
            }

            Console.WriteLine("\nPressione qualquer tecla para continuar...");
            Console.ReadKey();
        }

        /// <summary>
        /// Método para limpar toda a base de dados
        /// </summary>
        private void LimparBaseDados()
        {
            Console.Clear();
            Console.WriteLine("=== LIMPAR BASE DE DADOS ===");

            if (bancoDados.QuantidadeProdutos == 0)
            {
                Console.WriteLine("A base de dados já está vazia!");
            }
            else
            {
                Console.WriteLine($"Tem certeza que deseja remover todos os {bancoDados.QuantidadeProdutos} produtos?");
                Console.Write("Digite 'CONFIRMAR' para prosseguir: ");
                string confirmacao = Console.ReadLine().ToUpper();

                if (confirmacao == "CONFIRMAR")
                {
                    bancoDados.LimparBaseDados();
                    Console.WriteLine("Base de dados limpa com sucesso!");
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
        /// Método para contar o número de produtos cadastrados
        /// </summary>
        private void ContarProdutos()
        {
            Console.Clear();
            Console.WriteLine("=== CONTAGEM DE PRODUTOS ===");
            Console.WriteLine($"Total de produtos cadastrados: {bancoDados.QuantidadeProdutos}");
            Console.WriteLine($"Capacidade máxima: {bancoDados.CapacidadeMaxima}");
            Console.WriteLine($"Espaços disponíveis: {bancoDados.CapacidadeMaxima - bancoDados.QuantidadeProdutos}");
            Console.WriteLine("\nPressione qualquer tecla para continuar...");
            Console.ReadKey();
        }

        /// <summary>
        /// Método para exibir o produto com maior preço de venda
        /// </summary>
        private void ExibirProdutoMaiorPreco()
        {
            Console.Clear();
            Console.WriteLine("=== PRODUTO COM MAIOR PREÇO DE VENDA ===");

            if (bancoDados.QuantidadeProdutos == 0)
            {
                Console.WriteLine("Nenhum produto cadastrado!");
            }
            else
            {
                Produto produtoMaiorPreco = bancoDados.ObterProdutoMaiorPreco();
                Console.WriteLine("Produto com maior preço de venda:");
                produtoMaiorPreco.ExibirDados();
            }

            Console.WriteLine("\nPressione qualquer tecla para continuar...");
            Console.ReadKey();
        }
    }
}

