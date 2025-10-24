import java.util.Scanner;

// Q5 - Informações salariais do professor
public class Q5_InformacoesSalariais {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final double VALOR_HORA_AULA = 25.00;
        final int SEMANAS_MES = 4;
        final double ACRESCIMO_BENEFICIOS = 0.10;
        final double DESCONTO_IR = 0.05;
        final double DESCONTO_INSS = 0.07;
        
        int aulasSemanais;
        double salarioBase, salarioBruto, valorAcrescimo;
        double descontoIR, descontoINSS, totalDescontos, salarioLiquido;
        
        System.out.println("=== CALCULADORA DE INFORMAÇÕES SALARIAIS ===");
        System.out.println("Professor: R$ 25,00 por hora/aula");
        
        System.out.print("\nDigite a quantidade de aulas semanais: ");
        aulasSemanais = scanner.nextInt();
        
        // Calcula salário base
        salarioBase = aulasSemanais * SEMANAS_MES * VALOR_HORA_AULA;
        
        // Calcula acréscimo
        valorAcrescimo = salarioBase * ACRESCIMO_BENEFICIOS;
        
        // Calcula salário bruto
        salarioBruto = salarioBase + valorAcrescimo;
        
        // Calcula descontos
        descontoIR = salarioBruto * DESCONTO_IR;
        descontoINSS = salarioBruto * DESCONTO_INSS;
        totalDescontos = descontoIR + descontoINSS;
        
        // Calcula salário líquido
        salarioLiquido = salarioBruto - totalDescontos;
        
        System.out.println("\n=== INFORMAÇÕES SALARIAIS ===");
        System.out.println("Aulas por semana: " + aulasSemanais);
        System.out.println("Valor por hora/aula: R$ " + String.format("%.2f", VALOR_HORA_AULA));
        System.out.println("Semanas no mês: " + SEMANAS_MES);
        System.out.println("\n--- CÁLCULOS ---");
        System.out.println("Salário base: R$ " + String.format("%.2f", salarioBase));
        System.out.println("Acréscimo (10%): R$ " + String.format("%.2f", valorAcrescimo));
        System.out.println("SALÁRIO BRUTO: R$ " + String.format("%.2f", salarioBruto));
        System.out.println("\n--- DESCONTOS ---");
        System.out.println("IR (5%): R$ " + String.format("%.2f", descontoIR));
        System.out.println("INSS (7%): R$ " + String.format("%.2f", descontoINSS));
        System.out.println("Total descontos: R$ " + String.format("%.2f", totalDescontos));
        System.out.println("\nSALÁRIO LÍQUIDO: R$ " + String.format("%.2f", salarioLiquido));
        
        scanner.close();
    }
}
