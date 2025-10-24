import java.util.Scanner;

// Q5 - Exibir números ímpares de 1 a 20
public class Q5_ExibirImpares {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== NÚMEROS ÍMPARES DE 1 A 20 ===");
        
        // Percorre de 1 a 20
        for (int i = 1; i <= 20; i++) {
            // Verifica se é ímpar
            if (i % 2 != 0) {
                System.out.println("Número ímpar: " + i);
            }
        }
        
        System.out.println("\nFim da sequência!");
        
        scanner.close();
    }
}
