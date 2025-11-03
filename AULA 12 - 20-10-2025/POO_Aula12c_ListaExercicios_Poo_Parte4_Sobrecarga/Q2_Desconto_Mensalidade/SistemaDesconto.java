import java.util.Scanner;

public class SistemaDesconto {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    calcularPorDiasAntecedencia();
                    break;
                case 2:
                    calcularPorNotaEnem();
                    break;
                case 3:
                    calcularPorMedias();
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
        System.out.println("║     SISTEMA DE DESCONTO EM MENSALIDADE - MENU         ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝");
        System.out.println("║ 1 - Calcular Desconto por Dias de Antecedência       ║");
        System.out.println("║ 2 - Calcular Desconto por Nota do ENEM               ║");
        System.out.println("║ 3 - Calcular Desconto por Médias do Semestre         ║");
        System.out.println("║ 0 - Sair                                              ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝");
    }

    // Opção 1: Desconto por dias de antecedência
    private static void calcularPorDiasAntecedencia() {
        System.out.println("\n=== DESCONTO POR DIAS DE ANTECEDÊNCIA ===");
        System.out.println("Regras:");
        System.out.println("• Até 5 dias: 3% de desconto");
        System.out.println("• Até 10 dias: 5% de desconto");
        System.out.println("• Acima de 10 dias: 8% de desconto\n");
        
        double valorMensalidade = lerDouble("Valor da mensalidade: R$ ");
        int diasAntecedencia = lerInteiro("Dias de antecedência: ");
        
        double valorComDesconto = CalculoDesconto.calcularMensalidade(valorMensalidade, diasAntecedencia);
        double desconto = valorMensalidade - valorComDesconto;
        double percentual = CalculoDesconto.obterPercentualDesconto(diasAntecedencia);
        
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Valor original: R$ " + String.format("%.2f", valorMensalidade));
        System.out.println("Desconto (" + percentual + "%): R$ " + String.format("%.2f", desconto));
        System.out.println("✅ Valor final: R$ " + String.format("%.2f", valorComDesconto));
    }

    // Opção 2: Desconto por nota do ENEM
    private static void calcularPorNotaEnem() {
        System.out.println("\n=== DESCONTO POR NOTA DO ENEM ===");
        System.out.println("Regras:");
        System.out.println("• 700.00 a 800.00: 5% de desconto");
        System.out.println("• 800.01 a 900.00: 8% de desconto");
        System.out.println("• Acima de 900.00: 10% de desconto");
        System.out.println("• Abaixo de 700.00: sem desconto\n");
        
        double valorMensalidade = lerDouble("Valor da mensalidade: R$ ");
        double notaEnem = lerDouble("Nota do ENEM: ");
        
        double valorComDesconto = CalculoDesconto.calcularMensalidade(valorMensalidade, notaEnem);
        double desconto = valorMensalidade - valorComDesconto;
        double percentual = CalculoDesconto.obterPercentualDesconto(notaEnem);
        
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Valor original: R$ " + String.format("%.2f", valorMensalidade));
        System.out.println("Desconto (" + percentual + "%): R$ " + String.format("%.2f", desconto));
        System.out.println("✅ Valor final: R$ " + String.format("%.2f", valorComDesconto));
    }

    // Opção 3: Desconto por médias do semestre
    private static void calcularPorMedias() {
        System.out.println("\n=== DESCONTO POR MÉDIAS DO SEMESTRE ===");
        System.out.println("Regras:");
        System.out.println("• Se alguma média < 8.00: sem desconto");
        System.out.println("• Média calculada < 8.50: sem desconto");
        System.out.println("• Média entre 8.51 e 9.00: 5% de desconto");
        System.out.println("• Média acima de 9.00: 8% de desconto\n");
        
        double valorMensalidade = lerDouble("Valor da mensalidade: R$ ");
        
        System.out.println("\nDigite as 3 maiores médias do semestre anterior:");
        double media1 = lerDouble("Média 1: ");
        double media2 = lerDouble("Média 2: ");
        double media3 = lerDouble("Média 3: ");
        
        double mediaCalculada = (media1 + media2 + media3) / 3.0;
        double valorComDesconto = CalculoDesconto.calcularMensalidade(valorMensalidade, media1, media2, media3);
        double desconto = valorMensalidade - valorComDesconto;
        
        // Calcula percentual
        double percentual = 0;
        if (media1 >= 8.00 && media2 >= 8.00 && media3 >= 8.00) {
            if (mediaCalculada > 9.00) {
                percentual = 8.0;
            } else if (mediaCalculada >= 8.51) {
                percentual = 5.0;
            }
        }
        
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Média calculada: " + String.format("%.2f", mediaCalculada));
        System.out.println("Valor original: R$ " + String.format("%.2f", valorMensalidade));
        System.out.println("Desconto (" + percentual + "%): R$ " + String.format("%.2f", desconto));
        System.out.println("✅ Valor final: R$ " + String.format("%.2f", valorComDesconto));
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
