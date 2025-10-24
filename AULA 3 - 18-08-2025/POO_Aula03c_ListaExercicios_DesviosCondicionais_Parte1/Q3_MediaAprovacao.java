import java.util.Scanner;

// Q3 - Média e aprovação (nota >= 5)
public class Q3_MediaAprovacao {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nota1, nota2, nota3, nota4, media;
        
        System.out.println("=== CÁLCULO DE MÉDIA E APROVAÇÃO ===");
        System.out.println("Digite as 4 notas do aluno:");
        
        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();
        
        System.out.print("Digite a quarta nota: ");
        nota4 = scanner.nextDouble();
        
        // Calcula a média
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);
        System.out.println("Média: " + String.format("%.2f", media));
        
        // Verifica se foi aprovado (média >= 5)
        if (media >= 5) {
            System.out.println("Status: APROVADO");
        } else {
            System.out.println("Status: REPROVADO");
        }
        
        scanner.close();
    }
}
