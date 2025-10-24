import java.util.Scanner;

// Q10 - Somatória de fatoriais de 5 valores
public class Q10_SomatoriaFatorial {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int valor;
        long fatorial;
        long somatoria = 0;
        
        System.out.println("=== SOMATÓRIA DE FATORIAIS ===");
        System.out.println("Digite 5 valores inteiros:");
        
        // Lê 5 valores
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            valor = scanner.nextInt();
            
            // Calcula o fatorial do valor
            fatorial = 1;
            for (int j = 1; j <= valor; j++) {
                fatorial *= j;
            }
            
            System.out.println("Fatorial de " + valor + " = " + fatorial);
            
            // Soma ao total
            somatoria += fatorial;
        }
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Somatória dos fatoriais: " + somatoria);
        
        scanner.close();
    }
}
