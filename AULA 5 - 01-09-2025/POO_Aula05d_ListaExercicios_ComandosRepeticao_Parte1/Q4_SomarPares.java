import java.util.Scanner;

// Q4 - Somar números pares de 1 a 500
public class Q4_SomarPares {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        int contador = 0;
        
        System.out.println("=== SOMA DOS NÚMEROS PARES DE 1 A 500 ===");
        
        // Percorre de 1 a 500
        for (int i = 1; i <= 500; i++) {
            // Verifica se é par
            if (i % 2 == 0) {
                soma += i;
                contador++;
            }
        }
        
        System.out.println("Quantidade de números pares: " + contador);
        System.out.println("Soma dos números pares: " + soma);
        
        scanner.close();
    }
}
