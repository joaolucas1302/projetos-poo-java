import java.util.Scanner;

// Q2 - Conversão de graus Celsius para Fahrenheit
public class Q2_ConversaoGraus {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double celsius, fahrenheit;
        
        System.out.println("=== CONVERSÃO DE GRAUS CELSIUS PARA FAHRENHEIT ===");
        System.out.println("Fórmula: F = (C × 9/5) + 32");
        System.out.println("De 10 em 10 graus, de 10°C a 100°C");
        
        System.out.println("\n=== TABELA DE CONVERSÃO ===");
        System.out.println("Celsius\tFahrenheit");
        System.out.println("-------\t----------");
        
        // Percorre de 10 a 100 graus Celsius, de 10 em 10
        for (int i = 10; i <= 100; i += 10) {
            celsius = i;
            fahrenheit = (celsius * 9.0 / 5.0) + 32;
            
            System.out.println(celsius + "°C\t" + String.format("%.1f", fahrenheit) + "°F");
        }
        
        System.out.println("\nFim da conversão!");
        
        scanner.close();
    }
}
