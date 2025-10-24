import java.util.Scanner;

// Q4 - Área da circunferência
public class Q4_AreaCircunferencia {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double raio, area;
        final double PI = 3.14159;
        
        System.out.println("=== CALCULADORA DE ÁREA DE CIRCUNFERÊNCIA ===");
        System.out.println("Fórmula: A = π × r²");
        
        System.out.print("\nDigite o raio da circunferência: ");
        raio = scanner.nextDouble();
        
        // Calcula a área
        area = PI * raio * raio;
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Raio: " + raio);
        System.out.println("π (pi): " + PI);
        System.out.println("Área da circunferência: " + String.format("%.2f", area));
        
        System.out.println("\n=== CÁLCULO PASSO A PASSO ===");
        System.out.println("1. r² = " + raio + "² = " + (raio * raio));
        System.out.println("2. A = π × r² = " + PI + " × " + (raio * raio) + " = " + String.format("%.2f", area));
        
        scanner.close();
    }
}
