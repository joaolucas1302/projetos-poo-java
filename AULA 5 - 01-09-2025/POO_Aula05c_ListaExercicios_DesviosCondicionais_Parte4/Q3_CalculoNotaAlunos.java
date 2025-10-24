import java.util.Scanner;

// Q3 - Cálculo de nota dos alunos
public class Q3_CalculoNotaAlunos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para os 3 alunos
        String ra1, ra2, ra3;
        double nota1_1, nota2_1, notaPluri1;
        double nota1_2, nota2_2, notaPluri2;
        double nota1_3, nota2_3, notaPluri3;
        
        // Variáveis para as médias
        double media1, media2, media3;
        double mediaGeral;
        
        // Contadores
        int aprovados = 0, reprovados = 0;
        
        System.out.println("=== CÁLCULO DE NOTA DOS ALUNOS ===");
        System.out.println("Pesos: Nota1 (30%), Nota2 (40%), NotaPluri (30%)");
        
        // Aluno 1
        System.out.println("\n--- ALUNO 1 ---");
        System.out.print("Digite o RA do aluno 1: ");
        ra1 = scanner.next();
        System.out.print("Digite a Nota1: ");
        nota1_1 = scanner.nextDouble();
        System.out.print("Digite a Nota2: ");
        nota2_1 = scanner.nextDouble();
        System.out.print("Digite a NotaPluri: ");
        notaPluri1 = scanner.nextDouble();
        
        // Aluno 2
        System.out.println("\n--- ALUNO 2 ---");
        System.out.print("Digite o RA do aluno 2: ");
        ra2 = scanner.next();
        System.out.print("Digite a Nota1: ");
        nota1_2 = scanner.nextDouble();
        System.out.print("Digite a Nota2: ");
        nota2_2 = scanner.nextDouble();
        System.out.print("Digite a NotaPluri: ");
        notaPluri2 = scanner.nextDouble();
        
        // Aluno 3
        System.out.println("\n--- ALUNO 3 ---");
        System.out.print("Digite o RA do aluno 3: ");
        ra3 = scanner.next();
        System.out.print("Digite a Nota1: ");
        nota1_3 = scanner.nextDouble();
        System.out.print("Digite a Nota2: ");
        nota2_3 = scanner.nextDouble();
        System.out.print("Digite a NotaPluri: ");
        notaPluri3 = scanner.nextDouble();
        
        // Calcula as médias
        media1 = (nota1_1 * 0.30) + (nota2_1 * 0.40) + (notaPluri1 * 0.30);
        media2 = (nota1_2 * 0.30) + (nota2_2 * 0.40) + (notaPluri2 * 0.30);
        media3 = (nota1_3 * 0.30) + (nota2_3 * 0.40) + (notaPluri3 * 0.30);
        
        // Calcula média geral
        mediaGeral = (media1 + media2 + media3) / 3;
        
        // Exibe RA e média de cada aluno
        System.out.println("\n=== RA E MÉDIA DOS ALUNOS ===");
        System.out.println("RA: " + ra1 + " - Média: " + String.format("%.2f", media1));
        System.out.println("RA: " + ra2 + " - Média: " + String.format("%.2f", media2));
        System.out.println("RA: " + ra3 + " - Média: " + String.format("%.2f", media3));
        
        System.out.println("\nMédia geral: " + String.format("%.2f", mediaGeral));
        
        // Verifica aprovação e conta aprovados/reprovados
        System.out.println("\n=== STATUS DOS ALUNOS ===");
        
        // Aluno 1
        if (media1 >= 7.0) {
            System.out.println("RA: " + ra1 + " - APROVADO");
            aprovados++;
        } else {
            System.out.println("RA: " + ra1 + " - REPROVADO");
            reprovados++;
        }
        
        // Aluno 2
        if (media2 >= 7.0) {
            System.out.println("RA: " + ra2 + " - APROVADO");
            aprovados++;
        } else {
            System.out.println("RA: " + ra2 + " - REPROVADO");
            reprovados++;
        }
        
        // Aluno 3
        if (media3 >= 7.0) {
            System.out.println("RA: " + ra3 + " - APROVADO");
            aprovados++;
        } else {
            System.out.println("RA: " + ra3 + " - REPROVADO");
            reprovados++;
        }
        
        System.out.println("\n=== RESUMO ===");
        System.out.println("Alunos aprovados: " + aprovados);
        System.out.println("Alunos reprovados: " + reprovados);
        
        // Ordena RA e média do menor para o maior
        System.out.println("\n=== RA E MÉDIA ORDENADOS (MENOR PARA MAIOR) ===");
        
        // Encontra a menor média
        if (media1 <= media2 && media1 <= media3) {
            System.out.println("1º - RA: " + ra1 + " - Média: " + String.format("%.2f", media1));
        } else if (media2 <= media1 && media2 <= media3) {
            System.out.println("1º - RA: " + ra2 + " - Média: " + String.format("%.2f", media2));
        } else {
            System.out.println("1º - RA: " + ra3 + " - Média: " + String.format("%.2f", media3));
        }
        
        // Encontra a maior média
        if (media1 >= media2 && media1 >= media3) {
            System.out.println("3º - RA: " + ra1 + " - Média: " + String.format("%.2f", media1));
        } else if (media2 >= media1 && media2 >= media3) {
            System.out.println("3º - RA: " + ra2 + " - Média: " + String.format("%.2f", media2));
        } else {
            System.out.println("3º - RA: " + ra3 + " - Média: " + String.format("%.2f", media3));
        }
        
        scanner.close();
    }
}
