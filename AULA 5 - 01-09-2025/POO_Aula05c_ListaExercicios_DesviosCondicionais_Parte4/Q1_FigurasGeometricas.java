import java.util.Scanner;

// Q1 - Figuras Geométricas - Cálculo de áreas
public class Q1_FigurasGeometricas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para as dimensões
        double baseRetangulo, alturaRetangulo;
        double baseTriangulo, alturaTriangulo;
        double ladoQuadrado;
        double raioCirculo;
        
        // Variáveis para as áreas
        double areaRetangulo, areaTriangulo, areaQuadrado, areaCirculo;
        double menorArea, maiorArea;
        String figuraMenor, figuraMaior;
        
        System.out.println("=== CÁLCULO DE ÁREAS DE FIGURAS GEOMÉTRICAS ===");
        
        // Retângulo
        System.out.println("\n--- RETÂNGULO ---");
        System.out.print("Digite a base do retângulo: ");
        baseRetangulo = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        alturaRetangulo = scanner.nextDouble();
        areaRetangulo = baseRetangulo * alturaRetangulo;
        
        // Triângulo
        System.out.println("\n--- TRIÂNGULO ---");
        System.out.print("Digite a base do triângulo: ");
        baseTriangulo = scanner.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        alturaTriangulo = scanner.nextDouble();
        areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        
        // Quadrado
        System.out.println("\n--- QUADRADO ---");
        System.out.print("Digite o lado do quadrado: ");
        ladoQuadrado = scanner.nextDouble();
        areaQuadrado = ladoQuadrado * ladoQuadrado;
        
        // Círculo
        System.out.println("\n--- CÍRCULO ---");
        System.out.print("Digite o raio do círculo: ");
        raioCirculo = scanner.nextDouble();
        areaCirculo = 3.14159 * raioCirculo * raioCirculo;
        
        // Exibe as áreas calculadas
        System.out.println("\n=== ÁREAS CALCULADAS ===");
        System.out.println("Área do Retângulo: " + String.format("%.2f", areaRetangulo));
        System.out.println("Área do Triângulo: " + String.format("%.2f", areaTriangulo));
        System.out.println("Área do Quadrado: " + String.format("%.2f", areaQuadrado));
        System.out.println("Área do Círculo: " + String.format("%.2f", areaCirculo));
        
        // Encontra a menor área
        menorArea = areaRetangulo;
        figuraMenor = "Retângulo";
        
        if (areaTriangulo < menorArea) {
            menorArea = areaTriangulo;
            figuraMenor = "Triângulo";
        }
        if (areaQuadrado < menorArea) {
            menorArea = areaQuadrado;
            figuraMenor = "Quadrado";
        }
        if (areaCirculo < menorArea) {
            menorArea = areaCirculo;
            figuraMenor = "Círculo";
        }
        
        // Encontra a maior área
        maiorArea = areaRetangulo;
        figuraMaior = "Retângulo";
        
        if (areaTriangulo > maiorArea) {
            maiorArea = areaTriangulo;
            figuraMaior = "Triângulo";
        }
        if (areaQuadrado > maiorArea) {
            maiorArea = areaQuadrado;
            figuraMaior = "Quadrado";
        }
        if (areaCirculo > maiorArea) {
            maiorArea = areaCirculo;
            figuraMaior = "Círculo";
        }
        
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Figura com menor área: " + figuraMenor + " (" + String.format("%.2f", menorArea) + ")");
        System.out.println("Figura com maior área: " + figuraMaior + " (" + String.format("%.2f", maiorArea) + ")");
        
        // Ordena as áreas de forma crescente
        System.out.println("\n=== ÁREAS EM ORDEM CRESCENTE ===");
        
        // Encontra a menor
        if (areaRetangulo <= areaTriangulo && areaRetangulo <= areaQuadrado && areaRetangulo <= areaCirculo) {
            System.out.println("1º - Retângulo: " + String.format("%.2f", areaRetangulo));
        } else if (areaTriangulo <= areaRetangulo && areaTriangulo <= areaQuadrado && areaTriangulo <= areaCirculo) {
            System.out.println("1º - Triângulo: " + String.format("%.2f", areaTriangulo));
        } else if (areaQuadrado <= areaRetangulo && areaQuadrado <= areaTriangulo && areaQuadrado <= areaCirculo) {
            System.out.println("1º - Quadrado: " + String.format("%.2f", areaQuadrado));
        } else {
            System.out.println("1º - Círculo: " + String.format("%.2f", areaCirculo));
        }
        
        // Encontra a maior
        if (areaRetangulo >= areaTriangulo && areaRetangulo >= areaQuadrado && areaRetangulo >= areaCirculo) {
            System.out.println("4º - Retângulo: " + String.format("%.2f", areaRetangulo));
        } else if (areaTriangulo >= areaRetangulo && areaTriangulo >= areaQuadrado && areaTriangulo >= areaCirculo) {
            System.out.println("4º - Triângulo: " + String.format("%.2f", areaTriangulo));
        } else if (areaQuadrado >= areaRetangulo && areaQuadrado >= areaTriangulo && areaQuadrado >= areaCirculo) {
            System.out.println("4º - Quadrado: " + String.format("%.2f", areaQuadrado));
        } else {
            System.out.println("4º - Círculo: " + String.format("%.2f", areaCirculo));
        }
        
        scanner.close();
    }
}
