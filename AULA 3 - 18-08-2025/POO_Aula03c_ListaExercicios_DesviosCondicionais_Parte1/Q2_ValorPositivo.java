import java.util.Scanner;

// Q2 - Converter valor para positivo
public class Q2_ValorPositivo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int valor, valorPositivo;
        
        System.out.println("=== CONVERTER VALOR PARA POSITIVO ===");
        
        System.out.print("Digite um valor (positivo ou negativo): ");
        valor = scanner.nextInt();
        
        // Se o valor for menor ou igual a zero, multiplica por -1
        if (valor <= 0) {
            valorPositivo = valor * -1;
            System.out.println("\nValor original: " + valor);
            System.out.println("Valor convertido para positivo: " + valorPositivo);
        } else {
            valorPositivo = valor;
            System.out.println("\nValor original: " + valor);
            System.out.println("Valor já é positivo: " + valorPositivo);
        }
        
        scanner.close();
    }
}
