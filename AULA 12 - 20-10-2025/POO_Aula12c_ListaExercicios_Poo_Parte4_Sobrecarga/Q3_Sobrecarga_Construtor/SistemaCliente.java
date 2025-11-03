import java.util.Scanner;

public class SistemaCliente {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    criarClienteOrcamento();
                    break;
                case 2:
                    criarClienteCompleto();
                    break;
                case 3:
                    criarClientePedido();
                    break;
                case 0:
                    System.out.println("\n👋 Encerrando sistema...");
                    break;
                default:
                    System.out.println("❌ Opção inválida!");
            }

            if (opcao != 0) {
                System.out.println("\nPressione ENTER para continuar...");
                scanner.nextLine();
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n╔═══════════════════════════════════════════════════════╗");
        System.out.println("║           SISTEMA DE CLIENTES - MENU                  ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝");
        System.out.println("║ 1 - Módulo Orçamento (Nome apenas)                   ║");
        System.out.println("║ 2 - Módulo Cliente (Dados completos)                 ║");
        System.out.println("║ 3 - Módulo Pedido (Código, Nome, CPF)                ║");
        System.out.println("║ 0 - Sair                                              ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝");
    }

    // Opção 1: Módulo Orçamento - Construtor com apenas Nome
    private static void criarClienteOrcamento() {
        System.out.println("\n=== MÓDULO ORÇAMENTO ===");
        System.out.println("(Cadastro rápido - apenas nome)");
        
        String nome = lerString("\nNome do cliente: ");
        
        // Usa o construtor com 1 parâmetro
        Cliente cliente = new Cliente(nome);
        
        System.out.println("\n✅ Cliente cadastrado no módulo ORÇAMENTO!");
        System.out.println(cliente.toString());
    }

    // Opção 2: Módulo Cliente - Construtor com todos os dados
    private static void criarClienteCompleto() {
        System.out.println("\n=== MÓDULO CLIENTE ===");
        System.out.println("(Cadastro completo - todos os dados)");
        
        int codigo = lerInteiro("\nCódigo: ");
        String nome = lerString("Nome: ");
        int idade = lerInteiro("Idade: ");
        double salario = lerDouble("Salário: R$ ");
        String cpf = lerString("CPF: ");
        String rg = lerString("RG: ");
        
        // Usa o construtor com 6 parâmetros
        Cliente cliente = new Cliente(codigo, nome, idade, salario, cpf, rg);
        
        System.out.println("\n✅ Cliente cadastrado no módulo CLIENTE!");
        System.out.println(cliente.toString());
    }

    // Opção 3: Módulo Pedido - Construtor com Código, Nome e CPF
    private static void criarClientePedido() {
        System.out.println("\n=== MÓDULO PEDIDO ===");
        System.out.println("(Cadastro para pedido - código, nome e CPF)");
        
        int codigo = lerInteiro("\nCódigo: ");
        String nome = lerString("Nome: ");
        String cpf = lerString("CPF: ");
        
        // Usa o construtor com 3 parâmetros
        Cliente cliente = new Cliente(codigo, nome, cpf);
        
        System.out.println("\n✅ Cliente cadastrado no módulo PEDIDO!");
        System.out.println(cliente.toString());
    }

    // Métodos auxiliares para leitura
    private static String lerString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    private static int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("❌ Digite um número inteiro válido: ");
        }
        int valor = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer
        return valor;
    }

    private static double lerDouble(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print("❌ Digite um número válido: ");
        }
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Limpar buffer
        return valor;
    }
}
