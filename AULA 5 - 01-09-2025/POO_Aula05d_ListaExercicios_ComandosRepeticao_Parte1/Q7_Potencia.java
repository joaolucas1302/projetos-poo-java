import java.util.Scanner;

// Q7 - Potências de 3 (expoente 0 a 15)
public class Q7_Potencia {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== POTÊNCIAS DE 3 (EXPOENTE 0 A 15) ===");
        
        // Percorre do expoente 0 a 15
        for (int expoente = 0; expoente <= 15; expoente++) {
            long resultado = 1;
            
            // Calcula a potência
            for (int i = 0; i < expoente; i++) {
                resultado *= 3;
            }
            
            System.out.println("3^" + expoente + " = " + resultado);
        }
        
        System.out.println("\nFim da sequência!");
        
        scanner.close();
    }
}
