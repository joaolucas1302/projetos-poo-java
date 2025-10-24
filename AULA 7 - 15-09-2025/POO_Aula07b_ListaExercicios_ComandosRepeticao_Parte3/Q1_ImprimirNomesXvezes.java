import java.util.Scanner;

// Q1 - Imprimir nomes X vezes e repetir
public class Q1_ImprimirNomesXvezes {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nome;
        int repeticoes;
        int continuar;
        
        System.out.println("=== IMPRIMIR NOMES X VEZES ===");
        
        do {
            System.out.print("Digite o nome: ");
            nome = scanner.next();
            System.out.print("Digite o número de repetições: ");
            repeticoes = scanner.nextInt();
            
            // Imprime o nome X vezes
            for (int i = 1; i <= repeticoes; i++) {
                System.out.println(i + " - " + nome);
            }
            
            System.out.print("\nDeseja repetir o processamento? (0 = Não; 1 = Sim): ");
            continuar = scanner.nextInt();
            
        } while (continuar == 1);
        
        System.out.println("Fim do programa!");
        
        scanner.close();
    }
}
