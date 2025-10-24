import java.util.Scanner;

// Q2 - Tabuada de um número
public class Q2_Tabuada {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        
        System.out.println("=== TABUADA ===");
        
        System.out.print("Digite um número para a tabuada: ");
        numero = scanner.nextInt();
        
        System.out.println("\nTabuada do " + numero + ":");
        
        // Percorre de 1 a 10
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        scanner.close();
    }
}
