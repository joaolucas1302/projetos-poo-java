import java.util.Scanner;

/**
 * Classe responsável pelo menu interativo do sistema de persistência de produtos
 * 
 * @author Professor Marçal
 * @version 2025
 */
public class MenuProduto {
    private ProdutoBanco bancoDados; // Instância do banco de dados
    private Scanner scanner; // Scanner para entrada de dados

    /**
     * Construtor da classe MenuProduto
     */
    public MenuProduto() {
        bancoDados = new ProdutoBanco();
        scanner = new Scanner(System.in);
    }

    /**
     * Método principal que exibe o menu e gerencia as opções
     */
    public void exibir() {
        int opcao;

        // Menu interativo principal
        do {
            System.out.println("\n=== SISTEMA DE PERSISTÊNCIA DE PRODUTOS ===");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Exibir Todos os Produtos");
            System.out.println("3. Remover Produto (por código)");
            System.out.println("4. Localizar Produto (por código)");
            System.out.println("5. Sair");
            System.out.println("===========================================");
            System.out.println("Total de produtos cadastrados: " + bancoDados.getQuantidadeProdutos());
            System.out.print("Escolha uma opção: ");

            // Validação da entrada do usuário
            while (!scanner.hasNextInt()) {
                System.out.print("Opção inválida! Digite um número: ");
                scanner.next(); // Limpa o buffer
            }
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    exibirTodosProdutos();
                    break;
                case 3:
                    removerProduto();
                    break;
                case 4:
                    localizarProduto();
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Digite um número entre 1 e 5.");
                    break;
            }
        } while (opcao != 5);
    }

    /**
     * Método para cadastrar um novo produto
     */
    private void cadastrarProduto() {
        System.out.println("\n=== CADASTRAR NOVO PRODUTO ===");

        // Verifica se ainda há espaço no banco de dados
        if (bancoDados.getQuantidadeProdutos() >= 100) {
            System.out.println("ERRO: Capacidade máxima de produtos atingida!");
            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine();
            return;
        }

        // Solicita o código e verifica se já existe
        System.out.print("Digite o Código: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Código inválido! Digite um número: ");
            scanner.next(); // Limpa o buffer
        }
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        if (bancoDados.buscarProduto(codigo) != null) {
            System.out.println("ERRO: Já existe um produto com este código!");
            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine();
            return;
        }

        // Cria um novo objeto Produto
        Produto novoProduto = new Produto();
        novoProduto.setCodigo(codigo);

        // Solicita e armazena os demais dados do produto
        System.out.print("Digite o Nome: ");
        novoProduto.setNome(scanner.nextLine());

        System.out.print("Digite a Descrição: ");
        novoProduto.setDescricao(scanner.nextLine());

        System.out.print("Digite a Quantidade em Estoque: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Quantidade inválida! Digite um número: ");
            scanner.next(); // Limpa o buffer
        }
        novoProduto.setQuantidadeEstoque(scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer

        System.out.print("Digite o Preço de Custo: R$ ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Preço inválido! Digite um valor numérico: R$ ");
            scanner.next(); // Limpa o buffer
        }
        novoProduto.setPrecoCusto(scanner.nextDouble());
        scanner.nextLine(); // Limpa o buffer

        System.out.print("Digite a Margem de Lucro (em decimal, ex: 0.5 para 50%): ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Margem inválida! Digite um valor numérico: ");
            scanner.next(); // Limpa o buffer
        }
        novoProduto.setMargemLucro(scanner.nextDouble());
        scanner.nextLine(); // Limpa o buffer

        // Adiciona o produto ao banco de dados
        if (bancoDados.adicionar(novoProduto)) {
            System.out.println("\nProduto cadastrado com sucesso!");
            System.out.printf("Preço de Venda calculado: R$ %.2f%n", novoProduto.getPrecoVenda());
        } else {
            System.out.println("\nERRO: Não foi possível cadastrar o produto!");
        }

        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
    }

    /**
     * Método para exibir todos os produtos cadastrados
     */
    private void exibirTodosProdutos() {
        System.out.println("\n=== LISTA DE TODOS OS PRODUTOS ===");

        if (bancoDados.getQuantidadeProdutos() == 0) {
            System.out.println("Nenhum produto cadastrado!");
        } else {
            Produto[] todosProdutos = bancoDados.obterTodosProdutos();
            for (int i = 0; i < todosProdutos.length; i++) {
                System.out.println("\n--- Produto " + (i + 1) + " ---");
                todosProdutos[i].exibirDados();
            }
        }

        System.out.println("\nPressione Enter para continuar...");
        scanner.nextLine();
    }

    /**
     * Método para remover um produto pelo código
     */
    private void removerProduto() {
        System.out.println("\n=== REMOVER PRODUTO ===");

        if (bancoDados.getQuantidadeProdutos() == 0) {
            System.out.println("Nenhum produto cadastrado!");
            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine();
            return;
        }

        System.out.print("Digite o código do produto a ser removido: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Código inválido! Digite um número: ");
            scanner.next(); // Limpa o buffer
        }
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        Produto produto = bancoDados.buscarProduto(codigo);

        if (produto == null) {
            System.out.println("Produto não encontrado!");
        } else {
            // Exibe os dados do produto antes de remover
            System.out.println("\nProduto encontrado:");
            produto.exibirDados();

            System.out.print("\nDeseja realmente remover este produto? (S/N): ");
            String confirmacao = scanner.nextLine().toUpperCase();

            if (confirmacao.equals("S") || confirmacao.equals("SIM")) {
                if (bancoDados.remover(codigo)) {
                    System.out.println("Produto removido com sucesso!");
                } else {
                    System.out.println("ERRO: Não foi possível remover o produto!");
                }
            } else {
                System.out.println("Operação cancelada!");
            }
        }

        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
    }

    /**
     * Método para localizar um produto pelo código
     */
    private void localizarProduto() {
        System.out.println("\n=== LOCALIZAR PRODUTO ===");

        if (bancoDados.getQuantidadeProdutos() == 0) {
            System.out.println("Nenhum produto cadastrado!");
            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine();
            return;
        }

        System.out.print("Digite o código do produto a ser localizado: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Código inválido! Digite um número: ");
            scanner.next(); // Limpa o buffer
        }
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        Produto produto = bancoDados.buscarProduto(codigo);

        if (produto == null) {
            System.out.println("Produto não encontrado!");
        } else {
            System.out.println("\nProduto encontrado:");
            produto.exibirDados();
        }

        System.out.println("\nPressione Enter para continuar...");
        scanner.nextLine();
    }
}
