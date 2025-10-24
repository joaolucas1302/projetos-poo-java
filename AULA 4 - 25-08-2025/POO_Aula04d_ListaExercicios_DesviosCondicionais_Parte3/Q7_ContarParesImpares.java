import java.util.Scanner;

// Q7 - Contar pares e ímpares
public class Q7_ContarParesImpares {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int valor1, valor2, valor3, valor4, valor5;
        int contadorPares = 0, contadorImpares = 0;
        
        System.out.println("=== CONTAR PARES E ÍMPARES ===");
        System.out.println("Digite 5 valores inteiros:");
        
        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextInt();
        if (valor1 % 2 == 0) {
            contadorPares++;
        } else {
            contadorImpares++;
        }
        
        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextInt();
        if (valor2 % 2 == 0) {
            contadorPares++;
        } else {
            contadorImpares++;
        }
        
        System.out.print("Digite o terceiro valor: ");
        valor3 = scanner.nextInt();
        if (valor3 % 2 == 0) {
            contadorPares++;
        } else {
            contadorImpares++;
        }
        
        System.out.print("Digite o quarto valor: ");
        valor4 = scanner.nextInt();
        if (valor4 % 2 == 0) {
            contadorPares++;
        } else {
            contadorImpares++;
        }
        
        System.out.print("Digite o quinto valor: ");
        valor5 = scanner.nextInt();
        if (valor5 % 2 == 0) {
            contadorPares++;
        } else {
            contadorImpares++;
        }
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Valores digitados: " + valor1 + ", " + valor2 + ", " + valor3 + ", " + valor4 + ", " + valor5);
        System.out.println("Quantidade de números pares: " + contadorPares);
        System.out.println("Quantidade de números ímpares: " + contadorImpares);
        
        // Determina qual tipo foi mais fornecido
        System.out.println("\n=== TIPO MAIS FORNECIDO ===");
        if (contadorPares > contadorImpares) {
            System.out.println("Números pares foram mais fornecidos");
        } else if (contadorImpares > contadorPares) {
            System.out.println("Números ímpares foram mais fornecidos");
        } else {
            System.out.println("Quantidade igual de números pares e ímpares");
        }
        
        scanner.close();
    }
}
