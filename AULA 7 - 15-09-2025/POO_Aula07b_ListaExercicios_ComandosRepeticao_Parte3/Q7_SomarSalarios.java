import java.util.Scanner;

// Q7 - Somar salários (máximo 5 ou até informar 'não')
public class Q7_SomarSalarios {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double salario;
        double somaSalarios = 0;
        int continuar;
        int contador = 0;
        
        System.out.println("=== SOMAR SALÁRIOS (MÁXIMO 5) ===");
        
        do {
            System.out.print("Digite o salário: ");
            salario = scanner.nextDouble();
            somaSalarios += salario;
            contador++;
            
            System.out.println("Salário " + contador + ": R$ " + String.format("%.2f", salario));
            System.out.println("Total atual: R$ " + String.format("%.2f", somaSalarios));
            
            if (contador < 5) {
                System.out.print("Deseja informar outro salário? (0 = Não, 1 = Sim): ");
                continuar = scanner.nextInt();
            } else {
                System.out.println("Máximo de 5 salários atingido!");
                continuar = 0;
            }
            
        } while (continuar == 1);
        
        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Quantidade de salários informados: " + contador);
        System.out.println("A soma dos salários informados é: R$ " + String.format("%.2f", somaSalarios));
        
        scanner.close();
    }
}
