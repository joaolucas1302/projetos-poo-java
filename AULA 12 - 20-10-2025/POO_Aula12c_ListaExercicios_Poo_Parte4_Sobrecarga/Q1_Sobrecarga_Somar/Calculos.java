
public class Calculos {

    // Sobrecarga 1: Somar dois valores Double
    public static double Somar(double valorA, double valorB) {
        return valorA + valorB;
    }

    // Sobrecarga 2: Somar dois Int e um Double
    public static double Somar(int valorA, int valorB, double valorC) {
        return valorA + valorB + valorC;
    }

    // Sobrecarga 3: Somar array de Double
    public static double Somar(double[] valores) {
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma;
    }

    // Sobrecarga 4: Somar Int e Double
    public static double Somar(int valorA, double valorB) {
        return valorA + valorB;
    }

    // Método Maior: Retorna o maior valor do array
    public static double Maior(double[] valores) {
        if (valores == null || valores.length == 0) {
            throw new IllegalArgumentException("Array vazio ou nulo!");
        }
        
        double maior = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
        }
        return maior;
    }
}
