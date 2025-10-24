import java.util.Scanner;

// Q8 - Base e expoente fornecidos pelo usuário
public class Q8_BaseExpoente {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int base, expoente;
        long resultado = 1;
        
        System.out.println("=== CÁLCULO DE POTÊNCIA ===");
        System.out.println("B^E (Base elevada ao Expoente)");
        
        System.out.print("Digite a base: ");
        base = scanner.nextInt();
        
        System.out.print("Digite o expoente: ");
        expoente = scanner.nextInt();
        
        // Calcula a potência
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println(base + "^" + expoente + " = " + resultado);
        
        // Mostra o cálculo passo a passo
        System.out.println("\n=== CÁLCULO PASSO A PASSO ===");
        System.out.println("Base: " + base);
        System.out.println("Expoente: " + expoente);
        System.out.println("Resultado: " + resultado);
        
        scanner.close();
    }
}
