import java.util.Scanner;

// Q8 - Parcela em atraso
public class Q8_ParcelaAtraso {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorOriginal, taxaJuros, tempoAtraso;
        double valorJuros, valorTotal;
        
        System.out.println("=== CALCULADORA DE PRESTAÇÃO EM ATRASO ===");
        System.out.println("Fórmula: PRESTAÇÃO = VALOR + (VALOR × (TAXA / 100) × TEMPO)");
        
        System.out.print("\nDigite o valor original da prestação: R$ ");
        valorOriginal = scanner.nextDouble();
        
        System.out.print("Digite a taxa de juros (%): ");
        taxaJuros = scanner.nextDouble();
        
        System.out.print("Digite o tempo de atraso (em meses): ");
        tempoAtraso = scanner.nextDouble();
        
        // Calcula juros
        valorJuros = valorOriginal * (taxaJuros / 100) * tempoAtraso;
        
        // Calcula total
        valorTotal = valorOriginal + valorJuros;
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Valor original: R$ " + String.format("%.2f", valorOriginal));
        System.out.println("Taxa de juros: " + taxaJuros + "%");
        System.out.println("Tempo de atraso: " + tempoAtraso + " meses");
        System.out.println("Valor dos juros: R$ " + String.format("%.2f", valorJuros));
        System.out.println("----------------------------------------");
        System.out.println("VALOR TOTAL A PAGAR: R$ " + String.format("%.2f", valorTotal));
        
        System.out.println("\n=== CÁLCULO PASSO A PASSO ===");
        System.out.println("1. Taxa em decimal: " + taxaJuros + "% = " + (taxaJuros / 100));
        System.out.println("2. Juros = " + valorOriginal + " × " + (taxaJuros / 100) + " × " + tempoAtraso + " = " + String.format("%.2f", valorJuros));
        System.out.println("3. Total = " + valorOriginal + " + " + String.format("%.2f", valorJuros) + " = " + String.format("%.2f", valorTotal));
        
        System.out.println("\n💡 Dica: Quanto maior o tempo de atraso, maior será o valor dos juros!");
        
        scanner.close();
    }
}
