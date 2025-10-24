import java.util.Scanner;

// Q2 - Maior valor com validação de valores iguais
public class Q2_MaiorComValidacao {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int valor1, valor2;
        
        System.out.println("=== MAIOR VALOR COM VALIDAÇÃO ===");
        
        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextInt();
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Valores digitados: " + valor1 + " e " + valor2);
        
        // Verifica se os valores são iguais
        if (valor1 == valor2) {
            System.out.println("ERRO: Valores iguais não é permitido!");
        } else {
            // Encontra o maior valor
            if (valor1 > valor2) {
                System.out.println("Maior valor: " + valor1);
            } else {
                System.out.println("Maior valor: " + valor2);
            }
        }
        
        scanner.close();
    }
}
