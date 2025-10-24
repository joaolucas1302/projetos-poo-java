import java.util.Scanner;

// Q5 - Somar intervalos 3 valores
public class Q5_SomarIntervalos3Valores {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a, b, c;
        int somaA = 0, somaB = 0, somaC = 0;
        
        System.out.println("=== SOMAR INTERVALOS 3 VALORES ===");
        
        System.out.print("Digite o valor a: ");
        a = scanner.nextInt();
        System.out.print("Digite o valor b: ");
        b = scanner.nextInt();
        System.out.print("Digite o valor c: ");
        c = scanner.nextInt();
        
        // Calcula soma de 1 até a
        for (int i = 1; i <= a; i++) {
            somaA += i;
        }
        
        // Calcula soma de 1 até b
        for (int i = 1; i <= b; i++) {
            somaB += i;
        }
        
        // Calcula soma de 1 até c
        for (int i = 1; i <= c; i++) {
            somaC += i;
        }
        
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Soma de 1 até " + a + " = " + somaA);
        System.out.println("Soma de 1 até " + b + " = " + somaB);
        System.out.println("Soma de 1 até " + c + " = " + somaC);
        
        // Encontra menor e maior
        int menor = Math.min(Math.min(somaA, somaB), somaC);
        int maior = Math.max(Math.max(somaA, somaB), somaC);
        
        System.out.println("\nMenor valor de soma: " + menor);
        System.out.println("Maior valor de soma: " + maior);
        
        // Ordena os valores
        System.out.println("\n=== VALORES ORDENADOS (MENOR PARA MAIOR) ===");
        if (somaA <= somaB && somaA <= somaC) {
            System.out.println("1º - Soma A: " + somaA);
            if (somaB <= somaC) {
                System.out.println("2º - Soma B: " + somaB);
                System.out.println("3º - Soma C: " + somaC);
            } else {
                System.out.println("2º - Soma C: " + somaC);
                System.out.println("3º - Soma B: " + somaB);
            }
        } else if (somaB <= somaA && somaB <= somaC) {
            System.out.println("1º - Soma B: " + somaB);
            if (somaA <= somaC) {
                System.out.println("2º - Soma A: " + somaA);
                System.out.println("3º - Soma C: " + somaC);
            } else {
                System.out.println("2º - Soma C: " + somaC);
                System.out.println("3º - Soma A: " + somaA);
            }
        } else {
            System.out.println("1º - Soma C: " + somaC);
            if (somaA <= somaB) {
                System.out.println("2º - Soma A: " + somaA);
                System.out.println("3º - Soma B: " + somaB);
            } else {
                System.out.println("2º - Soma B: " + somaB);
                System.out.println("3º - Soma A: " + somaA);
            }
        }
        
        scanner.close();
    }
}
