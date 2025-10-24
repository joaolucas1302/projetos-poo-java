import java.util.Scanner;

// Q2 - Imprimir múltiplos
public class Q2_ImprimirMultiplos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n, p;
        
        System.out.println("=== IMPRIMIR MÚLTIPLOS ===");
        
        System.out.print("Digite o valor n: ");
        n = scanner.nextInt();
        System.out.print("Digite o passo p: ");
        p = scanner.nextInt();
        
        System.out.println("\nContagem de 0 até " + n + " de " + p + " em " + p + ":");
        
        // Percorre de 0 até n, incrementando de p em p
        for (int i = 0; i <= n; i += p) {
            System.out.print(i + " ");
        }
        
        System.out.println("\nFim da contagem!");
        
        scanner.close();
    }
}
