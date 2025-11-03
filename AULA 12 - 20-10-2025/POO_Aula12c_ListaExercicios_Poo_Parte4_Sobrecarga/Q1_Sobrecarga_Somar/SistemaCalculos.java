import java.util.Scanner;

public class SistemaCalculos {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    somarDoisDoubles();
                    break;
                case 2:
                    somarDoisIntsUmDouble();
                    break;
                case 3:
                    somarArrayDouble();
                    break;
                case 4:
                    somarIntDouble();
                    break;
                case 5:
                    maiorArrayDouble();
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
        System.out.println("\n╔════════════════════════════════════════════════════╗");
        System.out.println("║          SISTEMA DE CÁLCULOS - MENU                ║");
        System.out.println("╚════════════════════════════════════════════════════╝");
        System.out.println("║ 1 - Somar(Double, Double)                          ║");
        System.out.println("║ 2 - Somar(Int, Int, Double)                        ║");
        System.out.println("║ 3 - Somar(Array de Double)                         ║");
        System.out.println("║ 4 - Somar(Int, Double)                             ║");
        System.out.println("║ 5 - Maior(Array de Double)                         ║");
        System.out.println("║ 0 - Sair                                           ║");
        System.out.println("╚════════════════════════════════════════════════════╝");
    }

    // Opção 1: Somar dois valores Double
    private static void somarDoisDoubles() {
        System.out.println("\n=== SOMAR DOIS VALORES DOUBLE ===");
        double valorA = lerDouble("Digite o primeiro valor (Double): ");
        double valorB = lerDouble("Digite o segundo valor (Double): ");
        
        double resultado = Calculos.Somar(valorA, valorB);
        System.out.println("✅ Resultado: " + resultado);
    }

    // Opção 2: Somar dois Int e um Double
    private static void somarDoisIntsUmDouble() {
        System.out.println("\n=== SOMAR DOIS INT E UM DOUBLE ===");
        int valorA = lerInteiro("Digite o primeiro valor (Int): ");
        int valorB = lerInteiro("Digite o segundo valor (Int): ");
        double valorC = lerDouble("Digite o terceiro valor (Double): ");
        
        double resultado = Calculos.Somar(valorA, valorB, valorC);
        System.out.println("✅ Resultado: " + resultado);
    }

    // Opção 3: Somar Array de Double
    private static void somarArrayDouble() {
        System.out.println("\n=== SOMAR ARRAY DE VALORES DOUBLE ===");
        int quantidade = lerInteiro("Quantos valores você deseja somar? ");
        
        if (quantidade <= 0) {
            System.out.println("❌ Quantidade inválida!");
            return;
        }

        double[] valores = new double[quantidade];
        
        System.out.println("\nDigite os valores:");
        for (int i = 0; i < quantidade; i++) {
            valores[i] = lerDouble("Valor " + (i + 1) + ": ");
        }
        
        double resultado = Calculos.Somar(valores);
        System.out.println("✅ Soma total: " + resultado);
    }

    // Opção 4: Somar Int e Double
    private static void somarIntDouble() {
        System.out.println("\n=== SOMAR INT E DOUBLE ===");
        int valorA = lerInteiro("Digite o primeiro valor (Int): ");
        double valorB = lerDouble("Digite o segundo valor (Double): ");
        
        double resultado = Calculos.Somar(valorA, valorB);
        System.out.println("✅ Resultado: " + resultado);
    }

    // Opção 5: Maior valor do Array
    private static void maiorArrayDouble() {
        System.out.println("\n=== ENCONTRAR MAIOR VALOR DO ARRAY ===");
        int quantidade = lerInteiro("Quantos valores você deseja analisar? ");
        
        if (quantidade <= 0) {
            System.out.println("❌ Quantidade inválida!");
            return;
        }

        double[] valores = new double[quantidade];
        
        System.out.println("\nDigite os valores:");
        for (int i = 0; i < quantidade; i++) {
            valores[i] = lerDouble("Valor " + (i + 1) + ": ");
        }
        
        double maior = Calculos.Maior(valores);
        System.out.println("✅ Maior valor: " + maior);
    }

    // Métodos auxiliares para leitura
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
