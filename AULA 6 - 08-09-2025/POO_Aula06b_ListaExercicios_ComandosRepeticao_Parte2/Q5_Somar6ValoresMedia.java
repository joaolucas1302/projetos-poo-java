import java.util.Scanner;

// Q5 - Somar 6 valores e calcular média
public class Q5_Somar6ValoresMedia {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valor;
        double soma = 0;
        double media;
        
        System.out.println("=== SOMAR 6 VALORES E CALCULAR MÉDIA ===");
        System.out.println("Digite 6 valores:");
        
        // Lê 6 valores
        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            valor = scanner.nextDouble();
            soma += valor;
        }
        
        // Calcula a média
        media = soma / 6;
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Soma dos valores: " + String.format("%.2f", soma));
        System.out.println("Média dos valores: " + String.format("%.2f", media));
        
        scanner.close();
    }
}
