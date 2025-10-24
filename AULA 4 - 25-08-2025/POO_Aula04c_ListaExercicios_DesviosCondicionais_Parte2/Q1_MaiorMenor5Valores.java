import java.util.Scanner;

// Q1 - Maior e menor entre 5 valores (sem ordenação, vetores ou repetição)
public class Q1_MaiorMenor5Valores {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int valor1, valor2, valor3, valor4, valor5;
        int maior, menor;
        
        System.out.println("=== MAIOR E MENOR ENTRE 5 VALORES ===");
        System.out.println("Digite 5 valores inteiros:");
        
        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextInt();
        
        System.out.print("Digite o terceiro valor: ");
        valor3 = scanner.nextInt();
        
        System.out.print("Digite o quarto valor: ");
        valor4 = scanner.nextInt();
        
        System.out.print("Digite o quinto valor: ");
        valor5 = scanner.nextInt();
        
        // Inicializa maior e menor com o primeiro valor
        maior = valor1;
        menor = valor1;
        
        // Verifica o segundo valor
        if (valor2 > maior) {
            maior = valor2;
        }
        if (valor2 < menor) {
            menor = valor2;
        }
        
        // Verifica o terceiro valor
        if (valor3 > maior) {
            maior = valor3;
        }
        if (valor3 < menor) {
            menor = valor3;
        }
        
        // Verifica o quarto valor
        if (valor4 > maior) {
            maior = valor4;
        }
        if (valor4 < menor) {
            menor = valor4;
        }
        
        // Verifica o quinto valor
        if (valor5 > maior) {
            maior = valor5;
        }
        if (valor5 < menor) {
            menor = valor5;
        }
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Valores digitados: " + valor1 + ", " + valor2 + ", " + valor3 + ", " + valor4 + ", " + valor5);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        
        scanner.close();
    }
}
