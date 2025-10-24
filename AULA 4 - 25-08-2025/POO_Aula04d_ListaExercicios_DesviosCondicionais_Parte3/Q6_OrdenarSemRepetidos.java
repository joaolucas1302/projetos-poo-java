import java.util.Scanner;

// Q6 - Ordenar 3 valores sem permitir repetidos
public class Q6_OrdenarSemRepetidos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int valor1, valor2, valor3;
        int menor, meio, maior;
        
        System.out.println("=== ORDENAR 3 VALORES SEM REPETIDOS ===");
        System.out.println("Digite 3 valores inteiros diferentes:");
        
        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextInt();
        
        // Verifica se o segundo valor é igual ao primeiro
        if (valor2 == valor1) {
            System.out.println("ERRO: Valores repetidos não são permitidos!");
            return;
        }
        
        System.out.print("Digite o terceiro valor: ");
        valor3 = scanner.nextInt();
        
        // Verifica se o terceiro valor é igual aos anteriores
        if (valor3 == valor1 || valor3 == valor2) {
            System.out.println("ERRO: Valores repetidos não são permitidos!");
            return;
        }
        
        System.out.println("\nValores digitados: " + valor1 + ", " + valor2 + ", " + valor3);
        
        // Encontra o menor valor
        if (valor1 < valor2 && valor1 < valor3) {
            menor = valor1;
        } else if (valor2 < valor1 && valor2 < valor3) {
            menor = valor2;
        } else {
            menor = valor3;
        }
        
        // Encontra o maior valor
        if (valor1 > valor2 && valor1 > valor3) {
            maior = valor1;
        } else if (valor2 > valor1 && valor2 > valor3) {
            maior = valor2;
        } else {
            maior = valor3;
        }
        
        // Encontra o valor do meio
        if (valor1 != menor && valor1 != maior) {
            meio = valor1;
        } else if (valor2 != menor && valor2 != maior) {
            meio = valor2;
        } else {
            meio = valor3;
        }
        
        System.out.println("\n=== VALORES ORDENADOS ===");
        System.out.println("Menor: " + menor);
        System.out.println("Meio: " + meio);
        System.out.println("Maior: " + maior);
        
        scanner.close();
    }
}
