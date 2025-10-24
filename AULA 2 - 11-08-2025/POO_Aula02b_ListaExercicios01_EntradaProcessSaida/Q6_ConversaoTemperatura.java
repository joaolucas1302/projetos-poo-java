import java.util.Scanner;

// Q6 - Conversão de temperatura
public class Q6_ConversaoTemperatura {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double celsius, fahrenheit;
        
        System.out.println("=== CONVERSOR DE TEMPERATURA ===");
        System.out.println("Celsius → Fahrenheit");
        System.out.println("Fórmula: F = (C × 9/5) + 32");
        
        System.out.print("\nDigite a temperatura em graus Celsius: ");
        celsius = scanner.nextDouble();
        
        // Converte para Fahrenheit
        fahrenheit = (celsius * 9.0 / 5.0) + 32;
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Temperatura em Celsius: " + celsius + "°C");
        System.out.println("Temperatura em Fahrenheit: " + String.format("%.2f", fahrenheit) + "°F");
        
        System.out.println("\n=== CÁLCULO PASSO A PASSO ===");
        System.out.println("1. C × 9/5 = " + celsius + " × 9/5 = " + (celsius * 9.0 / 5.0));
        System.out.println("2. F = " + (celsius * 9.0 / 5.0) + " + 32 = " + String.format("%.2f", fahrenheit));
        
        System.out.println("\n💡 Dica: 0°C = 32°F (ponto de congelamento da água)");
        System.out.println("💡 Dica: 100°C = 212°F (ponto de ebulição da água)");
        
        scanner.close();
    }
}
