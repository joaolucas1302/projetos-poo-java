import java.util.Scanner;

// Q1 - Calcular média de 3 notas
public class Q1_MediaNotas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nota1, nota2, nota3, media;
        
        System.out.println("=== CALCULADORA DE MÉDIA DE NOTAS ===");
        System.out.println("Digite 3 notas de 0 a 10:");
        
        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();
        
        // Calcula a média
        media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Média: " + String.format("%.2f", media));
        
        // Verifica se passou
        if (media >= 7.0) {
            System.out.println("Status: APROVADO!");
        } else {
            System.out.println("Status: REPROVADO!");
        }
        
        scanner.close();
    }
}
