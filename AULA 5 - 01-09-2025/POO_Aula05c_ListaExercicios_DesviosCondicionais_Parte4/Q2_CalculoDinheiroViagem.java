import java.util.Scanner;

// Q2 - Cálculo de dinheiro para viagem
public class Q2_CalculoDinheiroViagem {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para cotações
        double cotacaoDolar, cotacaoEuro, cotacaoLibra;
        
        // Variáveis para os amigos
        String nome1, nome2, nome3, nome4;
        double reais1, reais2, reais3, reais4;
        
        // Variáveis para cálculos
        double totalReais;
        String nomeMaior, nomeMenor;
        double valorMaior, valorMenor;
        
        System.out.println("=== CÁLCULO DE DINHEIRO PARA VIAGEM ===");
        System.out.println("4 amigos brasileiros em intercâmbio");
        
        // Solicita cotações
        System.out.println("\n--- COTAÇÕES DAS MOEDAS ---");
        System.out.print("Digite a cotação do Dólar: R$ ");
        cotacaoDolar = scanner.nextDouble();
        
        System.out.print("Digite a cotação do Euro: R$ ");
        cotacaoEuro = scanner.nextDouble();
        
        System.out.print("Digite a cotação da Libra Esterlina: R$ ");
        cotacaoLibra = scanner.nextDouble();
        
        // Solicita dados dos amigos
        System.out.println("\n--- DADOS DOS AMIGOS ---");
        
        System.out.print("Digite o nome do 1º amigo: ");
        nome1 = scanner.next();
        System.out.print("Digite quantos reais ele tem: R$ ");
        reais1 = scanner.nextDouble();
        
        System.out.print("Digite o nome do 2º amigo: ");
        nome2 = scanner.next();
        System.out.print("Digite quantos reais ele tem: R$ ");
        reais2 = scanner.nextDouble();
        
        System.out.print("Digite o nome do 3º amigo: ");
        nome3 = scanner.next();
        System.out.print("Digite quantos reais ele tem: R$ ");
        reais3 = scanner.nextDouble();
        
        System.out.print("Digite o nome do 4º amigo: ");
        nome4 = scanner.next();
        System.out.print("Digite quantos reais ele tem: R$ ");
        reais4 = scanner.nextDouble();
        
        // Calcula total em reais
        totalReais = reais1 + reais2 + reais3 + reais4;
        
        // Encontra o amigo com maior quantidade
        if (reais1 >= reais2 && reais1 >= reais3 && reais1 >= reais4) {
            nomeMaior = nome1;
            valorMaior = reais1;
        } else if (reais2 >= reais1 && reais2 >= reais3 && reais2 >= reais4) {
            nomeMaior = nome2;
            valorMaior = reais2;
        } else if (reais3 >= reais1 && reais3 >= reais2 && reais3 >= reais4) {
            nomeMaior = nome3;
            valorMaior = reais3;
        } else {
            nomeMaior = nome4;
            valorMaior = reais4;
        }
        
        // Encontra o amigo com menor quantidade
        if (reais1 <= reais2 && reais1 <= reais3 && reais1 <= reais4) {
            nomeMenor = nome1;
            valorMenor = reais1;
        } else if (reais2 <= reais1 && reais2 <= reais3 && reais2 <= reais4) {
            nomeMenor = nome2;
            valorMenor = reais2;
        } else if (reais3 <= reais1 && reais3 <= reais2 && reais3 <= reais4) {
            nomeMenor = nome3;
            valorMenor = reais3;
        } else {
            nomeMenor = nome4;
            valorMenor = reais4;
        }
        
        // Exibe resultados
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Soma total em reais: R$ " + String.format("%.2f", totalReais));
        System.out.println("Amigo com maior quantidade: " + nomeMaior + " (R$ " + String.format("%.2f", valorMaior) + ")");
        System.out.println("Amigo com menor quantidade: " + nomeMenor + " (R$ " + String.format("%.2f", valorMenor) + ")");
        
        // Conversões para cada amigo
        System.out.println("\n=== CONVERSÕES POR AMIGO ===");
        
        // Amigo 1
        System.out.println(nome1 + " tem R$ " + String.format("%.2f", reais1) + 
                          ", convertidos terá $" + String.format("%.2f", reais1 / cotacaoDolar) + 
                          " dólares, €" + String.format("%.2f", reais1 / cotacaoEuro) + 
                          " euros e £" + String.format("%.2f", reais1 / cotacaoLibra) + " libras.");
        
        // Amigo 2
        System.out.println(nome2 + " tem R$ " + String.format("%.2f", reais2) + 
                          ", convertidos terá $" + String.format("%.2f", reais2 / cotacaoDolar) + 
                          " dólares, €" + String.format("%.2f", reais2 / cotacaoEuro) + 
                          " euros e £" + String.format("%.2f", reais2 / cotacaoLibra) + " libras.");
        
        // Amigo 3
        System.out.println(nome3 + " tem R$ " + String.format("%.2f", reais3) + 
                          ", convertidos terá $" + String.format("%.2f", reais3 / cotacaoDolar) + 
                          " dólares, €" + String.format("%.2f", reais3 / cotacaoEuro) + 
                          " euros e £" + String.format("%.2f", reais3 / cotacaoLibra) + " libras.");
        
        // Amigo 4
        System.out.println(nome4 + " tem R$ " + String.format("%.2f", reais4) + 
                          ", convertidos terá $" + String.format("%.2f", reais4 / cotacaoDolar) + 
                          " dólares, €" + String.format("%.2f", reais4 / cotacaoEuro) + 
                          " euros e £" + String.format("%.2f", reais4 / cotacaoLibra) + " libras.");
        
        // Ordena valores em reais do menor para o maior
        System.out.println("\n=== VALORES ORDENADOS (MENOR PARA MAIOR) ===");
        
        // Encontra o menor
        if (reais1 <= reais2 && reais1 <= reais3 && reais1 <= reais4) {
            System.out.println("1º - " + nome1 + ": R$ " + String.format("%.2f", reais1));
        } else if (reais2 <= reais1 && reais2 <= reais3 && reais2 <= reais4) {
            System.out.println("1º - " + nome2 + ": R$ " + String.format("%.2f", reais2));
        } else if (reais3 <= reais1 && reais3 <= reais2 && reais3 <= reais4) {
            System.out.println("1º - " + nome3 + ": R$ " + String.format("%.2f", reais3));
        } else {
            System.out.println("1º - " + nome4 + ": R$ " + String.format("%.2f", reais4));
        }
        
        // Encontra o maior
        if (reais1 >= reais2 && reais1 >= reais3 && reais1 >= reais4) {
            System.out.println("4º - " + nome1 + ": R$ " + String.format("%.2f", reais1));
        } else if (reais2 >= reais1 && reais2 >= reais3 && reais2 >= reais4) {
            System.out.println("4º - " + nome2 + ": R$ " + String.format("%.2f", reais2));
        } else if (reais3 >= reais1 && reais3 >= reais2 && reais3 >= reais4) {
            System.out.println("4º - " + nome3 + ": R$ " + String.format("%.2f", reais3));
        } else {
            System.out.println("4º - " + nome4 + ": R$ " + String.format("%.2f", reais4));
        }
        
        scanner.close();
    }
}
