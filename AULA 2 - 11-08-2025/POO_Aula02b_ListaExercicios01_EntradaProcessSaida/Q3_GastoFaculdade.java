import java.util.Scanner;

// Q3 - Calcular gasto da faculdade
public class Q3_GastoFaculdade {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double mensalidade, transporte, alimentacao;
        double custoTotalMensal, custoTotalAnual;
        
        System.out.println("=== CALCULADORA DE GASTOS DA FACULDADE ===");
        System.out.println("Vamos calcular quanto você gasta por mês e por ano na faculdade!");
        
        System.out.print("\nDigite o valor da mensalidade: R$ ");
        mensalidade = scanner.nextDouble();
        
        System.out.print("Digite o custo mensal com transporte (van, ônibus, uber, etc.): R$ ");
        transporte = scanner.nextDouble();
        
        System.out.print("Digite o custo mensal com alimentação (lanches, refri, etc.): R$ ");
        alimentacao = scanner.nextDouble();
        
        // Calcula custo mensal
        custoTotalMensal = mensalidade + transporte + alimentacao;
        
        // Calcula custo anual
        custoTotalAnual = custoTotalMensal * 12;
        
        System.out.println("\n=== RESULTADO DOS GASTOS ===");
        System.out.println("Mensalidade: R$ " + String.format("%.2f", mensalidade));
        System.out.println("Transporte: R$ " + String.format("%.2f", transporte));
        System.out.println("Alimentação: R$ " + String.format("%.2f", alimentacao));
        System.out.println("----------------------------------------");
        System.out.println("CUSTO TOTAL MENSAL: R$ " + String.format("%.2f", custoTotalMensal));
        System.out.println("CUSTO TOTAL ANUAL: R$ " + String.format("%.2f", custoTotalAnual));
        
        System.out.println("\n💡 Dica: Investir na educação é o melhor investimento que você pode fazer!");
        
        scanner.close();
    }
}
