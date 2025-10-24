import java.util.Scanner;

// Q4 - Apresentar valor se não for maior que 3 (usando apenas operador NOT)
public class Q4_ValorNaoMaiorQue3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int valor;
        
        System.out.println("=== APRESENTAR VALOR SE NÃO FOR MAIOR QUE 3 ===");
        System.out.println("Usando apenas operador NOT (!)");
        
        System.out.print("Digite um valor inteiro: ");
        valor = scanner.nextInt();
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Valor digitado: " + valor);
        
        // Usa apenas o operador NOT (!) para verificar se NÃO é maior que 3
        // Se NÃO (valor > 3) for verdadeiro, então valor <= 3
        if (!(valor > 3)) {
            System.out.println("O valor " + valor + " foi apresentado porque não é maior que 3");
        } else {
            System.out.println("O valor " + valor + " não foi apresentado porque é maior que 3");
        }
        
        // Explicação do uso do operador NOT
        System.out.println("\n=== EXPLICAÇÃO ===");
        System.out.println("Usamos !(valor > 3) que significa:");
        System.out.println("- Se valor > 3 for FALSO, então !(valor > 3) é VERDADEIRO");
        System.out.println("- Isso significa que valor <= 3");
        
        scanner.close();
    }
}
