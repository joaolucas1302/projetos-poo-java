import java.util.Scanner;

// Q6 - Produto intervalo 3 valores
public class Q6_ProdutoIntervalo3Valores {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a, b, c;
        int produtoA = 1, produtoB = 1, produtoC = 1;
        
        System.out.println("=== PRODUTO INTERVALO 3 VALORES ===");
        
        System.out.print("Digite o valor a: ");
        a = scanner.nextInt();
        System.out.print("Digite o valor b: ");
        b = scanner.nextInt();
        System.out.print("Digite o valor c: ");
        c = scanner.nextInt();
        
        // Calcula produto de 1 até a
        for (int i = 1; i <= a; i++) {
            produtoA *= i;
        }
        
        // Calcula produto de 1 até b
        for (int i = 1; i <= b; i++) {
            produtoB *= i;
        }
        
        // Calcula produto de 1 até c
        for (int i = 1; i <= c; i++) {
            produtoC *= i;
        }
        
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Produto de 1 até " + a + " = " + produtoA);
        System.out.println("Produto de 1 até " + b + " = " + produtoB);
        System.out.println("Produto de 1 até " + c + " = " + produtoC);
        
        // Encontra menor e maior
        int menor = Math.min(Math.min(produtoA, produtoB), produtoC);
        int maior = Math.max(Math.max(produtoA, produtoB), produtoC);
        
        System.out.println("\nMenor valor de produto: " + menor);
        System.out.println("Maior valor de produto: " + maior);
        
        // Ordena os valores
        System.out.println("\n=== VALORES ORDENADOS (MENOR PARA MAIOR) ===");
        if (produtoA <= produtoB && produtoA <= produtoC) {
            System.out.println("1º - Produto A: " + produtoA);
            if (produtoB <= produtoC) {
                System.out.println("2º - Produto B: " + produtoB);
                System.out.println("3º - Produto C: " + produtoC);
            } else {
                System.out.println("2º - Produto C: " + produtoC);
                System.out.println("3º - Produto B: " + produtoB);
            }
        } else if (produtoB <= produtoA && produtoB <= produtoC) {
            System.out.println("1º - Produto B: " + produtoB);
            if (produtoA <= produtoC) {
                System.out.println("2º - Produto A: " + produtoA);
                System.out.println("3º - Produto C: " + produtoC);
            } else {
                System.out.println("2º - Produto C: " + produtoC);
                System.out.println("3º - Produto A: " + produtoA);
            }
        } else {
            System.out.println("1º - Produto C: " + produtoC);
            if (produtoA <= produtoB) {
                System.out.println("2º - Produto A: " + produtoA);
                System.out.println("3º - Produto B: " + produtoB);
            } else {
                System.out.println("2º - Produto B: " + produtoB);
                System.out.println("3º - Produto A: " + produtoA);
            }
        }
        
        scanner.close();
    }
}
