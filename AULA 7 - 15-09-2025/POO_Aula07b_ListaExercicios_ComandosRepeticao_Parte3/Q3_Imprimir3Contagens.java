import java.util.Scanner;

// Q3 - Imprimir 3 contagens
public class Q3_Imprimir3Contagens {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int valor1, valor2, valor3;
        
        System.out.println("=== IMPRIMIR 3 CONTAGENS ===");
        
        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextInt();
        System.out.print("Digite o terceiro valor: ");
        valor3 = scanner.nextInt();
        
        // Primeira contagem
        System.out.println("\nImpressão contagem do valor " + valor1 + ":");
        for (int i = 1; i <= valor1; i++) {
            System.out.println(i);
        }
        
        // Segunda contagem
        System.out.println("\nImpressão contagem do valor " + valor2 + ":");
        for (int i = 1; i <= valor2; i++) {
            System.out.println(i);
        }
        
        // Terceira contagem
        System.out.println("\nImpressão contagem do valor " + valor3 + ":");
        for (int i = 1; i <= valor3; i++) {
            System.out.println(i);
        }
        
        System.out.println("\nFim das contagens!");
        
        scanner.close();
    }
}
