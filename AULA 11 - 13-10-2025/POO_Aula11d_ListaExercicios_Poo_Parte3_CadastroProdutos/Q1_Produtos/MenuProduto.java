import java.util.Scanner;

/**
 * Classe responsável pelo menu interativo do sistema de produtos
 * 
 * @author Professor Marçal
 * @version 2025
 */
public class MenuProduto {
    private Produto produto; // Variável para armazenar o objeto Produto
    private Scanner scanner; // Scanner para entrada de dados

    /**
     * Construtor da classe MenuProduto
     */
    public MenuProduto() {
        produto = null;
        scanner = new Scanner(System.in);
    }

    /**
     * Método principal que exibe o menu e gerencia as opções
     */
    public void exibir() {
        int opcao;

        // Menu interativo principal
        do {
            System.out.println("\n=== SISTEMA DE CADASTRO DE PRODUTOS ===");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Exibir Produto");
            System.out.println("3. Sair");
            System.out.println("======================================");
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
                    adicionarProduto();
                    break;
                case 2:
                    exibirProduto();
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Digite um número entre 1 e 3.");
                    break;
            }
        } while (opcao != 3);
    }

    /**
     * Método para adicionar um novo produto
     */
    private void adicionarProduto() {
        System.out.println("\n=== CADASTRAR NOVO PRODUTO ===");
        
        // Instancia um novo objeto Produto
        produto = new Produto();
        
        // Solicita e armazena os dados do produto
        System.out.print("Digite o Código: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Código inválido! Digite um número: ");
            scanner.next(); // Limpa o buffer
        }
        produto.setCodigo(scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer
        
        System.out.print("Digite o Nome: ");
        produto.setNome(scanner.nextLine());
        
        System.out.print("Digite a Descrição: ");
        produto.setDescricao(scanner.nextLine());
        
        System.out.print("Digite a Quantidade em Estoque: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Quantidade inválida! Digite um número: ");
            scanner.next(); // Limpa o buffer
        }
        produto.setQuantidadeEstoque(scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer
        
        System.out.print("Digite o Preço de Custo: R$ ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Preço inválido! Digite um valor numérico: R$ ");
            scanner.next(); // Limpa o buffer
        }
        produto.setPrecoCusto(scanner.nextDouble());
        scanner.nextLine(); // Limpa o buffer
        
        System.out.print("Digite a Margem de Lucro (em decimal, ex: 0.5 para 50%): ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Margem inválida! Digite um valor numérico: ");
            scanner.next(); // Limpa o buffer
        }
        produto.setMargemLucro(scanner.nextDouble());
        scanner.nextLine(); // Limpa o buffer
        
        System.out.println("\nProduto cadastrado com sucesso!");
        System.out.printf("Preço de Venda calculado: R$ %.2f%n", produto.getPrecoVenda());
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
    }

    /**
     * Método para exibir os dados do produto cadastrado
     */
    private void exibirProduto() {
        System.out.println();
        if (produto != null) {
            produto.exibirDados();
        } else {
            System.out.println("Nenhum produto cadastrado!");
        }
        System.out.println("\nPressione Enter para continuar...");
        scanner.nextLine();
    }
}
