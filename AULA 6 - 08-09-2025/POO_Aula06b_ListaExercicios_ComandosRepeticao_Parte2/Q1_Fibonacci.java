import java.util.Scanner;

// Q1 - Série Fibonacci até o 15º termo
public class Q1_Fibonacci {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int termo1 = 1, termo2 = 1, proximo;
        
        System.out.println("=== SÉRIE FIBONACCI ATÉ O 15º TERMO ===");
        System.out.println("Série: 1, 1, 2, 3, 5, 8, 13, 21, 34, ...");
        
        System.out.println("\n=== SEQUÊNCIA ===");
        System.out.println("1º termo: " + termo1);
        System.out.println("2º termo: " + termo2);
        
        // Calcula os próximos 13 termos (3º ao 15º)
        for (int i = 3; i <= 15; i++) {
            proximo = termo1 + termo2;
            System.out.println(i + "º termo: " + proximo);
            
            // Atualiza os termos para a próxima iteração
            termo1 = termo2;
            termo2 = proximo;
        }
        
        System.out.println("\nFim da série Fibonacci!");
        
        scanner.close();
    }
}
