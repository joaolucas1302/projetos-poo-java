import java.util.Scanner;

// Q6 - Somar valores positivos até aparecer negativo
public class Q6_SomarValoresPositivos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valor;
        double soma = 0;
        int contador = 0;
        double media;
        
        System.out.println("=== SOMAR VALORES POSITIVOS ===");
        System.out.println("Digite valores positivos (digite um negativo para parar):");
        
        // Loop para ler valores até aparecer um negativo
        while (true) {
            System.out.print("Digite um valor: ");
            valor = scanner.nextDouble();
            
            // Verifica se o valor é negativo
            if (valor < 0) {
                System.out.println("Valor negativo detectado! Parando...");
                break;
            }
            
            // Se for positivo, soma
            soma += valor;
            contador++;
            System.out.println("Valor " + valor + " adicionado. Total: " + String.format("%.2f", soma));
        }
        
        // Calcula a média se houver valores
        if (contador > 0) {
            media = soma / contador;
            
            System.out.println("\n=== RESULTADO ===");
            System.out.println("Quantidade de valores somados: " + contador);
            System.out.println("Soma dos valores: " + String.format("%.2f", soma));
            System.out.println("Média dos valores: " + String.format("%.2f", media));
        } else {
            System.out.println("\nNenhum valor positivo foi digitado!");
        }
        
        scanner.close();
    }
}
