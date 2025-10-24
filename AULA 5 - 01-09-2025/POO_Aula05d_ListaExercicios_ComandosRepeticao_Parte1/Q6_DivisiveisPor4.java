import java.util.Scanner;

// Q6 - Números divisíveis por 4 de 1 a 200
public class Q6_DivisiveisPor4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== NÚMEROS DIVISÍVEIS POR 4 DE 1 A 200 ===");
        
        // Percorre de 1 a 200
        for (int i = 1; i <= 200; i++) {
            // Verifica se é divisível por 4
            if (i % 4 == 0) {
                System.out.println("Número divisível por 4: " + i);
            }
        }
        
        System.out.println("\nFim da sequência!");
        
        scanner.close();
    }
}
