import java.util.Scanner;

// Q10 - Verificar se valor está na faixa de 1 a 9
public class Q10_FaixaPermitida {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int valor;
        
        System.out.println("=== VERIFICAR FAIXA PERMITIDA (1 a 9) ===");
        
        System.out.print("Digite um valor inteiro: ");
        valor = scanner.nextInt();
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Valor digitado: " + valor);
        
        // Verifica se está na faixa de 1 a 9
        if (valor >= 1 && valor <= 9) {
            System.out.println("O valor está na faixa permitida");
        } else {
            System.out.println("O valor está fora da faixa permitida");
        }
        
        scanner.close();
    }
}
