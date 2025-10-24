import java.util.Scanner;

// Q9 - Cálculo do fatorial
public class Q9_Fatorial {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        long fatorial = 1;
        
        System.out.println("=== CÁLCULO DO FATORIAL ===");
        System.out.println("n! = n × (n-1) × (n-2) × ... × 2 × 1");
        
        System.out.print("Digite um número inteiro: ");
        numero = scanner.nextInt();
        
        // Calcula o fatorial
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Fatorial de " + numero + " = " + fatorial);
        
        // Mostra o cálculo passo a passo
        System.out.println("\n=== CÁLCULO PASSO A PASSO ===");
        System.out.print(numero + "! = ");
        for (int i = numero; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" × ");
            }
        }
        System.out.println(" = " + fatorial);
        
        scanner.close();
    }
}
