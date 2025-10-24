import java.util.Scanner;

// Q1 - Diferença do maior pelo menor
public class Q1_DiferencaMaiorMenor {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int valor1, valor2, diferenca;
        
        System.out.println("=== DIFERENÇA DO MAIOR PELO MENOR ===");
        
        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextInt();
        
        // Verifica qual é maior e calcula a diferença
        if (valor1 > valor2) {
            diferenca = valor1 - valor2;
            System.out.println("\nO primeiro valor (" + valor1 + ") é maior que o segundo (" + valor2 + ")");
        } else {
            diferenca = valor2 - valor1;
            System.out.println("\nO segundo valor (" + valor2 + ") é maior que o primeiro (" + valor1 + ")");
        }
        
        System.out.println("Diferença: " + diferenca);
        
        scanner.close();
    }
}
