import java.util.Scanner;

// Q3 - Classificar por idade
public class Q3_ClassificarPorIdade {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int idade;
        
        System.out.println("=== CLASSIFICAR POR IDADE ===");
        
        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Idade: " + idade + " anos");
        
        // Classifica por faixa etária
        if (idade >= 0 && idade <= 10) {
            System.out.println("Olá criança");
        } else if (idade >= 11 && idade <= 14) {
            System.out.println("Olá, você é um(a) pré-adolescente");
        } else if (idade >= 15 && idade <= 18) {
            System.out.println("Parabéns, você já pode ser um eleitor");
        } else if (idade >= 19 && idade <= 21) {
            System.out.println("Hummm, você já é um adulto");
        } else if (idade > 21) {
            System.out.println("Bem, agora já está na hora de sair de casa e seguir sua vida...");
        } else {
            System.out.println("Idade inválida!");
        }
        
        scanner.close();
    }
}
