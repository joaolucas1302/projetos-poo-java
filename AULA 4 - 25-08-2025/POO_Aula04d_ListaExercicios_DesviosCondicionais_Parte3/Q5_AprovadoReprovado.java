import java.util.Scanner;

// Q5 - Aprovado/Reprovado com pesos específicos
public class Q5_AprovadoReprovado {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nota1, nota2, nota3, media;
        
        System.out.println("=== APROVADO/REPROVADO ===");
        System.out.println("Pesos: AV1 (30%), AV2 (40%), Trabalho (30%)");
        
        System.out.print("Digite a nota da AV1: ");
        nota1 = scanner.nextDouble();
        
        System.out.print("Digite a nota da AV2: ");
        nota2 = scanner.nextDouble();
        
        System.out.print("Digite a nota do Trabalho: ");
        nota3 = scanner.nextDouble();
        
        // Calcula a média com os pesos
        media = (nota1 * 0.30) + (nota2 * 0.40) + (nota3 * 0.30);
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Nota AV1: " + nota1 + " (peso 30%)");
        System.out.println("Nota AV2: " + nota2 + " (peso 40%)");
        System.out.println("Nota Trabalho: " + nota3 + " (peso 30%)");
        System.out.println("Média: " + String.format("%.2f", media));
        
        // Verifica aprovação
        System.out.println("\n=== STATUS ===");
        if (media >= 0 && media <= 4.99) {
            System.out.println("Reprovado");
        } else if (media >= 5.00 && media <= 7.49) {
            System.out.println("Aprovado");
        } else if (media > 7.50) {
            System.out.println("Parabéns, você foi aprovado com excelência");
        }
        
        scanner.close();
    }
}
