import java.util.Scanner;

// Q2 - Calcular dias vividos
public class Q2_DiasVividos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int anoNascimento, anoAtual, anosVividos, diasVividos;
        
        System.out.println("=== CALCULADORA DE DIAS VIVIDOS ===");
        
        System.out.print("Digite o ano de nascimento: ");
        anoNascimento = scanner.nextInt();
        
        System.out.print("Digite o ano atual: ");
        anoAtual = scanner.nextInt();
        
        // Calcula anos vividos
        anosVividos = anoAtual - anoNascimento;
        
        // Calcula dias vividos
        diasVividos = anosVividos * 365;
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Ano de nascimento: " + anoNascimento);
        System.out.println("Ano atual: " + anoAtual);
        System.out.println("Anos vividos: " + anosVividos);
        System.out.println("Dias vividos: " + diasVividos);
        
        System.out.println("\nUau! Você já viveu " + diasVividos + " dias! 🎉");
        
        scanner.close();
    }
}
