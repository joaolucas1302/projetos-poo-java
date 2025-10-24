import java.util.Scanner;

// Q7 - Números divisíveis por 2 OU 3
public class Q7_DivisiveisPor2ou3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int valor1, valor2, valor3, valor4;
        
        System.out.println("=== NÚMEROS DIVISÍVEIS POR 2 OU 3 ===");
        System.out.println("Digite 4 valores inteiros:");
        
        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextInt();
        
        System.out.print("Digite o terceiro valor: ");
        valor3 = scanner.nextInt();
        
        System.out.print("Digite o quarto valor: ");
        valor4 = scanner.nextInt();
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Valores digitados: " + valor1 + ", " + valor2 + ", " + valor3 + ", " + valor4);
        System.out.println("\nNúmeros divisíveis por 2 OU 3:");
        
        // Verifica cada valor
        if (valor1 % 2 == 0 || valor1 % 3 == 0) {
            System.out.println(valor1 + " é divisível por 2 ou 3");
        }
        
        if (valor2 % 2 == 0 || valor2 % 3 == 0) {
            System.out.println(valor2 + " é divisível por 2 ou 3");
        }
        
        if (valor3 % 2 == 0 || valor3 % 3 == 0) {
            System.out.println(valor3 + " é divisível por 2 ou 3");
        }
        
        if (valor4 % 2 == 0 || valor4 % 3 == 0) {
            System.out.println(valor4 + " é divisível por 2 ou 3");
        }
        
        // Verifica se nenhum número atendeu aos critérios
        if (!(valor1 % 2 == 0 || valor1 % 3 == 0) && 
            !(valor2 % 2 == 0 || valor2 % 3 == 0) && 
            !(valor3 % 2 == 0 || valor3 % 3 == 0) && 
            !(valor4 % 2 == 0 || valor4 % 3 == 0)) {
            System.out.println("Nenhum número é divisível por 2 ou 3");
        }
        
        scanner.close();
    }
}
