import java.util.Scanner;

// Q7 - Somar fatoriais dos números ímpares de 1 a 20
public class Q7_SomarFatoriaisImpares {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long fatorial;
        long somatoria = 0;
        int contadorImpares = 0;
        
        System.out.println("=== SOMAR FATORIAIS DOS NÚMEROS ÍMPARES DE 1 A 20 ===");
        
        // Percorre de 1 a 20
        for (int i = 1; i <= 20; i++) {
            // Verifica se é ímpar
            if (i % 2 != 0) {
                // Calcula o fatorial do número ímpar
                fatorial = 1;
                for (int j = 1; j <= i; j++) {
                    fatorial *= j;
                }
                
                System.out.println("Fatorial de " + i + " = " + fatorial);
                
                // Soma ao total
                somatoria += fatorial;
                contadorImpares++;
            }
        }
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Quantidade de números ímpares: " + contadorImpares);
        System.out.println("Soma dos fatoriais dos ímpares: " + somatoria);
        
        scanner.close();
    }
}
