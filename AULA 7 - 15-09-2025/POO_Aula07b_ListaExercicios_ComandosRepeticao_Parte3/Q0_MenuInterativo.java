import java.util.Scanner;

// Q0 - Menu Interativo com todas as opções
public class Q0_MenuInterativo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        
        System.out.println("=== MENU INTERATIVO - COMANDOS DE REPETIÇÃO ===");
        
        do {
            System.out.println("\n=== OPÇÕES DISPONÍVEIS ===");
            System.out.println("1. Imprimir nomes X vezes");
            System.out.println("2. Imprimir múltiplos");
            System.out.println("3. Imprimir 3 contagens");
            System.out.println("4. Imprimir 3 contagens decrescente");
            System.out.println("5. Somar intervalos 3 valores");
            System.out.println("6. Produto intervalo 3 valores");
            System.out.println("7. Somar salários (máximo 5)");
            System.out.println("8. Menu interativo 6 opções");
            System.out.println("0. Sair");
            
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    imprimirNomesXvezes(scanner);
                    break;
                case 2:
                    imprimirMultiplos(scanner);
                    break;
                case 3:
                    imprimir3Contagens(scanner);
                    break;
                case 4:
                    imprimir3ContagensDecrescente(scanner);
                    break;
                case 5:
                    somarIntervalos3Valores(scanner);
                    break;
                case 6:
                    produtoIntervalo3Valores(scanner);
                    break;
                case 7:
                    somarSalarios(scanner);
                    break;
                case 8:
                    menuInterativo6Opcoes(scanner);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            
        } while (opcao != 0);
        
        scanner.close();
    }
    
    // Q1 - Imprimir nomes X vezes
    public static void imprimirNomesXvezes(Scanner scanner) {
        String nome;
        int repeticoes;
        int continuar;
        
        do {
            System.out.println("\n=== IMPRIMIR NOMES X VEZES ===");
            System.out.print("Digite o nome: ");
            nome = scanner.next();
            System.out.print("Digite o número de repetições: ");
            repeticoes = scanner.nextInt();
            
            for (int i = 1; i <= repeticoes; i++) {
                System.out.println(i + " - " + nome);
            }
            
            System.out.print("\nDeseja repetir o processamento? (0 = Não; 1 = Sim): ");
            continuar = scanner.nextInt();
            
        } while (continuar == 1);
    }
    
    // Q2 - Imprimir múltiplos
    public static void imprimirMultiplos(Scanner scanner) {
        int n, p;
        
        System.out.println("\n=== IMPRIMIR MÚLTIPLOS ===");
        System.out.print("Digite o valor n: ");
        n = scanner.nextInt();
        System.out.print("Digite o passo p: ");
        p = scanner.nextInt();
        
        System.out.println("Contagem de 0 até " + n + " de " + p + " em " + p + ":");
        for (int i = 0; i <= n; i += p) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    // Q3 - Imprimir 3 contagens
    public static void imprimir3Contagens(Scanner scanner) {
        int valor1, valor2, valor3;
        
        System.out.println("\n=== IMPRIMIR 3 CONTAGENS ===");
        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextInt();
        System.out.print("Digite o terceiro valor: ");
        valor3 = scanner.nextInt();
        
        System.out.println("Impressão contagem do valor " + valor1 + ":");
        for (int i = 1; i <= valor1; i++) {
            System.out.println(i);
        }
        
        System.out.println("Impressão contagem do valor " + valor2 + ":");
        for (int i = 1; i <= valor2; i++) {
            System.out.println(i);
        }
        
        System.out.println("Impressão contagem do valor " + valor3 + ":");
        for (int i = 1; i <= valor3; i++) {
            System.out.println(i);
        }
    }
    
    // Q4 - Imprimir 3 contagens decrescente
    public static void imprimir3ContagensDecrescente(Scanner scanner) {
        int valor1, valor2, valor3;
        
        System.out.println("\n=== IMPRIMIR 3 CONTAGENS DECRESCENTE ===");
        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextInt();
        System.out.print("Digite o terceiro valor: ");
        valor3 = scanner.nextInt();
        
        System.out.println("Impressão contagem decrescente do valor " + valor1 + ":");
        for (int i = valor1; i >= 1; i--) {
            System.out.println(i);
        }
        
        System.out.println("Impressão contagem decrescente do valor " + valor2 + ":");
        for (int i = valor2; i >= 1; i--) {
            System.out.println(i);
        }
        
        System.out.println("Impressão contagem decrescente do valor " + valor3 + ":");
        for (int i = valor3; i >= 1; i--) {
            System.out.println(i);
        }
    }
    
    // Q5 - Somar intervalos 3 valores
    public static void somarIntervalos3Valores(Scanner scanner) {
        int a, b, c;
        int somaA = 0, somaB = 0, somaC = 0;
        
        System.out.println("\n=== SOMAR INTERVALOS 3 VALORES ===");
        System.out.print("Digite o valor a: ");
        a = scanner.nextInt();
        System.out.print("Digite o valor b: ");
        b = scanner.nextInt();
        System.out.print("Digite o valor c: ");
        c = scanner.nextInt();
        
        // Calcula soma de 1 até a
        for (int i = 1; i <= a; i++) {
            somaA += i;
        }
        
        // Calcula soma de 1 até b
        for (int i = 1; i <= b; i++) {
            somaB += i;
        }
        
        // Calcula soma de 1 até c
        for (int i = 1; i <= c; i++) {
            somaC += i;
        }
        
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Soma de 1 até " + a + " = " + somaA);
        System.out.println("Soma de 1 até " + b + " = " + somaB);
        System.out.println("Soma de 1 até " + c + " = " + somaC);
        
        // Encontra menor e maior
        int menor = Math.min(Math.min(somaA, somaB), somaC);
        int maior = Math.max(Math.max(somaA, somaB), somaC);
        
        System.out.println("Menor valor de soma: " + menor);
        System.out.println("Maior valor de soma: " + maior);
    }
    
    // Q6 - Produto intervalo 3 valores
    public static void produtoIntervalo3Valores(Scanner scanner) {
        int a, b, c;
        int produtoA = 1, produtoB = 1, produtoC = 1;
        
        System.out.println("\n=== PRODUTO INTERVALO 3 VALORES ===");
        System.out.print("Digite o valor a: ");
        a = scanner.nextInt();
        System.out.print("Digite o valor b: ");
        b = scanner.nextInt();
        System.out.print("Digite o valor c: ");
        c = scanner.nextInt();
        
        // Calcula produto de 1 até a
        for (int i = 1; i <= a; i++) {
            produtoA *= i;
        }
        
        // Calcula produto de 1 até b
        for (int i = 1; i <= b; i++) {
            produtoB *= i;
        }
        
        // Calcula produto de 1 até c
        for (int i = 1; i <= c; i++) {
            produtoC *= i;
        }
        
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Produto de 1 até " + a + " = " + produtoA);
        System.out.println("Produto de 1 até " + b + " = " + produtoB);
        System.out.println("Produto de 1 até " + c + " = " + produtoC);
        
        // Encontra menor e maior
        int menor = Math.min(Math.min(produtoA, produtoB), produtoC);
        int maior = Math.max(Math.max(produtoA, produtoB), produtoC);
        
        System.out.println("Menor valor de produto: " + menor);
        System.out.println("Maior valor de produto: " + maior);
    }
    
    // Q7 - Somar salários
    public static void somarSalarios(Scanner scanner) {
        double salario;
        double somaSalarios = 0;
        int continuar;
        int contador = 0;
        
        System.out.println("\n=== SOMAR SALÁRIOS (MÁXIMO 5) ===");
        
        do {
            System.out.print("Digite o salário: ");
            salario = scanner.nextDouble();
            somaSalarios += salario;
            contador++;
            
            if (contador < 5) {
                System.out.print("Deseja informar outro salário? (0 = Não, 1 = Sim): ");
                continuar = scanner.nextInt();
            } else {
                System.out.println("Máximo de 5 salários atingido!");
                continuar = 0;
            }
            
        } while (continuar == 1);
        
        System.out.println("A soma dos salários informados é: " + String.format("%.2f", somaSalarios));
    }
    
    // Q8 - Menu interativo 6 opções
    public static void menuInterativo6Opcoes(Scanner scanner) {
        int opcao;
        int numero;
        
        do {
            System.out.println("\n=== MENU INTERATIVO 6 OPÇÕES ===");
            System.out.println("1. Contar pares");
            System.out.println("2. Contar ímpares");
            System.out.println("3. Produto pares");
            System.out.println("4. Produto ímpares");
            System.out.println("9. Sair");
            
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            if (opcao != 9) {
                System.out.print("Digite um número inteiro: ");
                numero = scanner.nextInt();
                
                switch (opcao) {
                    case 1:
                        contarPares(numero);
                        break;
                    case 2:
                        contarImpares(numero);
                        break;
                    case 3:
                        produtoPares(numero);
                        break;
                    case 4:
                        produtoImpares(numero);
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }
            
        } while (opcao != 9);
    }
    
    public static void contarPares(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                contador++;
            }
        }
        System.out.println("Quantidade de números pares de 1 a " + numero + ": " + contador);
    }
    
    public static void contarImpares(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                contador++;
            }
        }
        System.out.println("Quantidade de números ímpares de 1 a " + numero + ": " + contador);
    }
    
    public static void produtoPares(int numero) {
        long produto = 1;
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                produto *= i;
            }
        }
        System.out.println("Produto dos números pares de 1 a " + numero + ": " + produto);
    }
    
    public static void produtoImpares(int numero) {
        long produto = 1;
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                produto *= i;
            }
        }
        System.out.println("Produto dos números ímpares de 1 a " + numero + ": " + produto);
    }
}
