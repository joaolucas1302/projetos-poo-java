import java.util.Scanner;

// Q3 - Soma dos valores de 1 a 100
public class Q3_Soma100Valores {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        
        System.out.println("=== SOMA DOS VALORES DE 1 A 100 ===");
        
        // Percorre de 1 a 100 e soma
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        
        System.out.println("Soma de todos os valores de 1 a 100: " + soma);
        System.out.println("Fórmula: 1+2+3+4+5+6+7+...+97+98+99+100 = " + soma);
        
        scanner.close();
    }
}
