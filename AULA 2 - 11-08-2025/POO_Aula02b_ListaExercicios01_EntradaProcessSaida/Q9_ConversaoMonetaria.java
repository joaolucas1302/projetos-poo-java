import java.util.Scanner;

// Q9 - Conversão monetária
public class Q9_ConversaoMonetaria {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorReais, cotacaoDolar, cotacaoEuro;
        double valorDolar, valorEuro;
        
        System.out.println("=== CONVERSOR MONETÁRIO ===");
        System.out.println("Real → Dólar e Euro");
        
        System.out.print("\nDigite o valor em Reais: R$ ");
        valorReais = scanner.nextDouble();
        
        System.out.print("Digite a cotação do Dólar: R$ ");
        cotacaoDolar = scanner.nextDouble();
        
        System.out.print("Digite a cotação do Euro: R$ ");
        cotacaoEuro = scanner.nextDouble();
        
        // Converte para dólar
        valorDolar = valorReais / cotacaoDolar;
        
        // Converte para euro
        valorEuro = valorReais / cotacaoEuro;
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Valor em Reais: R$ " + String.format("%.2f", valorReais));
        System.out.println("Cotação do Dólar: R$ " + String.format("%.2f", cotacaoDolar));
        System.out.println("Cotação do Euro: R$ " + String.format("%.2f", cotacaoEuro));
        System.out.println("----------------------------------------");
        System.out.println("Valor em Dólares: US$ " + String.format("%.2f", valorDolar));
        System.out.println("Valor em Euros: € " + String.format("%.2f", valorEuro));
        
        System.out.println("\n=== CÁLCULO PASSO A PASSO ===");
        System.out.println("1. Dólar: " + valorReais + " ÷ " + cotacaoDolar + " = US$ " + String.format("%.2f", valorDolar));
        System.out.println("2. Euro: " + valorReais + " ÷ " + cotacaoEuro + " = € " + String.format("%.2f", valorEuro));
        
        System.out.println("\n💡 Dica: As cotações variam diariamente! Sempre verifique as cotações atuais.");
        
        scanner.close();
    }
}
