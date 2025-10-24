import java.util.Scanner;

// Q1 - Quadrado dos números de 15 a 50
public class Q1_Quadrado {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== QUADRADO DOS NÚMEROS DE 15 A 50 ===");
        
        // Percorre do número 15 ao 50
        for (int i = 15; i <= 50; i++) {
            int quadrado = i * i;
            System.out.println(i + "² = " + quadrado);
        }
        
        System.out.println("\nFim da sequência!");
        
        scanner.close();
    }
}
