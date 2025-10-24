import java.util.Scanner;

// Q10 - Média final LP
public class Q10_MediaFinalLP {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double atvs, ead, av1, pluri, av2;
        double np1, np2, mediaFinal;
        
        System.out.println("=== CALCULADORA DE MÉDIA FINAL LP ===");
        System.out.println("Estrutura da Média Final:");
        System.out.println("MF = (NP1 × 40%) + (NP2 × 60%)");
        System.out.println("NP1 = (ATVs × 20%) + (EAD × 20%) + (AV1 × 60%)");
        System.out.println("NP2 = (ATVs × 20%) + (EAD × 20%) + (PLURI × 20%) + (AV2 × 40%)");
        
        System.out.println("\n=== DIGITE AS NOTAS (0 a 10) ===");
        System.out.print("Digite a nota das ATVs (Atividades): ");
        atvs = scanner.nextDouble();
        
        System.out.print("Digite a nota do EAD: ");
        ead = scanner.nextDouble();
        
        System.out.print("Digite a nota da AV1: ");
        av1 = scanner.nextDouble();
        
        System.out.print("Digite a nota do PLURI: ");
        pluri = scanner.nextDouble();
        
        System.out.print("Digite a nota da AV2: ");
        av2 = scanner.nextDouble();
        
        // Calcula NP1
        np1 = (atvs * 0.20) + (ead * 0.20) + (av1 * 0.60);
        
        // Calcula NP2
        np2 = (atvs * 0.20) + (ead * 0.20) + (pluri * 0.20) + (av2 * 0.40);
        
        // Calcula Média Final
        mediaFinal = (np1 * 0.40) + (np2 * 0.60);
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Notas digitadas:");
        System.out.println("ATVs: " + atvs);
        System.out.println("EAD: " + ead);
        System.out.println("AV1: " + av1);
        System.out.println("PLURI: " + pluri);
        System.out.println("AV2: " + av2);
        
        System.out.println("\n=== CÁLCULOS ===");
        System.out.println("NP1 = (ATVs × 20%) + (EAD × 20%) + (AV1 × 60%)");
        System.out.println("NP1 = (" + atvs + " × 0.20) + (" + ead + " × 0.20) + (" + av1 + " × 0.60)");
        System.out.println("NP1 = " + String.format("%.2f", atvs * 0.20) + " + " + String.format("%.2f", ead * 0.20) + " + " + String.format("%.2f", av1 * 0.60));
        System.out.println("NP1 = " + String.format("%.2f", np1));
        
        System.out.println("\nNP2 = (ATVs × 20%) + (EAD × 20%) + (PLURI × 20%) + (AV2 × 40%)");
        System.out.println("NP2 = (" + atvs + " × 0.20) + (" + ead + " × 0.20) + (" + pluri + " × 0.20) + (" + av2 + " × 0.40)");
        System.out.println("NP2 = " + String.format("%.2f", atvs * 0.20) + " + " + String.format("%.2f", ead * 0.20) + " + " + String.format("%.2f", pluri * 0.20) + " + " + String.format("%.2f", av2 * 0.40));
        System.out.println("NP2 = " + String.format("%.2f", np2));
        
        System.out.println("\nMF = (NP1 × 40%) + (NP2 × 60%)");
        System.out.println("MF = (" + String.format("%.2f", np1) + " × 0.40) + (" + String.format("%.2f", np2) + " × 0.60)");
        System.out.println("MF = " + String.format("%.2f", np1 * 0.40) + " + " + String.format("%.2f", np2 * 0.60));
        System.out.println("MF = " + String.format("%.2f", mediaFinal));
        
        System.out.println("\n=== STATUS FINAL ===");
        if (mediaFinal >= 7.0) {
            System.out.println("🎉 APROVADO! Média Final: " + String.format("%.2f", mediaFinal));
        } else {
            System.out.println("❌ REPROVADO! Média Final: " + String.format("%.2f", mediaFinal));
            System.out.println("Precisa de pelo menos 7.0 para ser aprovado!");
        }
        
        scanner.close();
    }
}
