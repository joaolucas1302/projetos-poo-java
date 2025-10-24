import java.util.Scanner;

// Q7 - Volume da lata de óleo
public class Q7_VolumeLataOleo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double raio, altura, volume;
        final double PI = 3.14159;
        
        System.out.println("=== CALCULADORA DE VOLUME DE LATA DE ÓLEO ===");
        System.out.println("Fórmula: V = π × r² × altura");
        
        System.out.print("\nDigite o raio da lata (em cm): ");
        raio = scanner.nextDouble();
        
        System.out.print("Digite a altura da lata (em cm): ");
        altura = scanner.nextDouble();
        
        // Calcula o volume
        volume = PI * raio * raio * altura;
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Raio: " + raio + " cm");
        System.out.println("Altura: " + altura + " cm");
        System.out.println("π (pi): " + PI);
        System.out.println("Volume da lata: " + String.format("%.2f", volume) + " cm³");
        
        System.out.println("\n=== CÁLCULO PASSO A PASSO ===");
        System.out.println("1. r² = " + raio + "² = " + (raio * raio));
        System.out.println("2. π × r² = " + PI + " × " + (raio * raio) + " = " + (PI * raio * raio));
        System.out.println("3. V = π × r² × altura = " + (PI * raio * raio) + " × " + altura + " = " + String.format("%.2f", volume));
        
        // Converte para litros
        double volumeLitros = volume * 0.001;
        System.out.println("\nVolume em litros: " + String.format("%.3f", volumeLitros) + " L");
        
        scanner.close();
    }
}
