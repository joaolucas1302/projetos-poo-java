import java.util.Scanner;

// Q4 - Cálculo do IMC (Índice de Massa Corporal)
public class Q4_CalculoIMC {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double peso, altura, imc;
        
        System.out.println("=== CÁLCULO DO IMC ===");
        System.out.println("Fórmula: IMC = Peso / (Altura)²");
        
        System.out.print("Digite seu peso (em kg): ");
        peso = scanner.nextDouble();
        
        System.out.print("Digite sua altura (em metros): ");
        altura = scanner.nextDouble();
        
        // Calcula o IMC
        imc = peso / (altura * altura);
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("IMC: " + String.format("%.2f", imc));
        
        // Classifica o IMC
        System.out.println("\n=== CLASSIFICAÇÃO ===");
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade grau II");
        } else {
            System.out.println("Obesidade grau III");
        }
        
        scanner.close();
    }
}
