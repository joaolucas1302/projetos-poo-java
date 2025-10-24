import java.util.Scanner;

// Q4 - Imprimir 3 contagens decrescente
public class Q4_Imprimir3ContagensDecrescente {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int valor1, valor2, valor3;
        
        System.out.println("=== IMPRIMIR 3 CONTAGENS DECRESCENTE ===");
        
        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextInt();
        System.out.print("Digite o terceiro valor: ");
        valor3 = scanner.nextInt();
        
        // Primeira contagem decrescente
        System.out.println("\nImpressão contagem decrescente do valor " + valor1 + ":");
        for (int i = valor1; i >= 1; i--) {
            System.out.println(i);
        }
        
        // Segunda contagem decrescente
        System.out.println("\nImpressão contagem decrescente do valor " + valor2 + ":");
        for (int i = valor2; i >= 1; i--) {
            System.out.println(i);
        }
        
        // Terceira contagem decrescente
        System.out.println("\nImpressão contagem decrescente do valor " + valor3 + ":");
        for (int i = valor3; i >= 1; i--) {
            System.out.println(i);
        }
        
        System.out.println("\nFim das contagens decrescentes!");
        
        scanner.close();
    }
}
