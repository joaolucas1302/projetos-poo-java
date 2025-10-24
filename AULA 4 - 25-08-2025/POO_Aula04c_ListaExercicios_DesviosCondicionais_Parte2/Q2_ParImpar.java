import java.util.Scanner;

// Q2 - Verificar se número é par ou ímpar
public class Q2_ParImpar {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int valor;
        
        System.out.println("=== VERIFICAR SE NÚMERO É PAR OU ÍMPAR ===");
        
        System.out.print("Digite um valor inteiro: ");
        valor = scanner.nextInt();
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Valor digitado: " + valor);
        
        // Verifica se é par ou ímpar
        if (valor % 2 == 0) {
            System.out.println("O valor " + valor + " é PAR");
        } else {
            System.out.println("O valor " + valor + " é ÍMPAR");
        }
        
        scanner.close();
    }
}
