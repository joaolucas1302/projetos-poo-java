import java.util.Scanner;
import java.lang.Math;

// Q5 - Equação de segundo grau (Bháskara)
public class Q5_EquacaoSegundoGrau {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double a, b, c, delta, x1, x2;
        
        System.out.println("=== EQUAÇÃO DE SEGUNDO GRAU (BHÁSKARA) ===");
        System.out.println("Fórmula: ax² + bx + c = 0");
        
        System.out.print("Digite o valor de A: ");
        a = scanner.nextDouble();
        
        System.out.print("Digite o valor de B: ");
        b = scanner.nextDouble();
        
        System.out.print("Digite o valor de C: ");
        c = scanner.nextDouble();
        
        // Verifica se é uma equação completa
        if (a == 0) {
            System.out.println("ERRO: A não pode ser zero para uma equação de segundo grau!");
            return;
        }
        
        // Calcula o delta
        delta = (b * b) - (4 * a * c);
        
        System.out.println("\n=== CÁLCULOS ===");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("Delta = b² - 4ac = " + (b * b) + " - " + (4 * a * c) + " = " + delta);
        
        // Verifica as condições do delta
        if (delta < 0) {
            System.out.println("\nDelta < 0: A equação não possui raízes reais");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("\nDelta = 0: A equação possui uma raiz real");
            System.out.println("x = " + String.format("%.2f", x1));
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("\nDelta > 0: A equação possui duas raízes reais");
            System.out.println("x1 = " + String.format("%.2f", x1));
            System.out.println("x2 = " + String.format("%.2f", x2));
        }
        
        scanner.close();
    }
}
