import java.util.Scanner;

// Q3 - Grãos de trigo no tabuleiro de xadrez
public class Q3_GraosTrigoTabuleiro {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long graos = 1; // Grãos no primeiro quadrado
        long totalGraos = 1; // Total de grãos
        long graosQuadro = 1; // Grãos no quadro atual
        
        System.out.println("=== GRÃOS DE TRIGO NO TABULEIRO DE XADREZ ===");
        System.out.println("Tabuleiro 8x8 = 64 quadrados");
        System.out.println("Regra: 1 grão no 1º, 2 no 2º, 4 no 3º, 8 no 4º, etc.");
        
        System.out.println("\n=== CÁLCULO QUADRADO A QUADRADO ===");
        System.out.println("1º quadrado: 1 grão (Total: 1)");
        
        // Percorre do 2º ao 64º quadrado
        for (int quadrado = 2; quadrado <= 64; quadrado++) {
            graosQuadro *= 2; // Dobra a quantidade de grãos
            totalGraos += graosQuadro; // Soma ao total
            
            // Exibe apenas alguns quadrados para não sobrecarregar a tela
            if (quadrado <= 10 || quadrado == 20 || quadrado == 30 || 
                quadrado == 40 || quadrado == 50 || quadrado == 64) {
                System.out.println(quadrado + "º quadrado: " + graosQuadro + " grãos (Total: " + totalGraos + ")");
            }
        }
        
        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Total de grãos no tabuleiro: " + totalGraos);
        System.out.println("Nota: Este é um número muito grande!");
        
        scanner.close();
    }
}
