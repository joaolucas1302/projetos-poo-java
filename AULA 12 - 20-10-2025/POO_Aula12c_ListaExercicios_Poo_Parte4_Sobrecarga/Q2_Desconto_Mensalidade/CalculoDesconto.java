
public class CalculoDesconto {

    // Sobrecarga 1: Desconto por dias de antecedência
    public static double calcularMensalidade(double valorMensalidade, int diasAntecedencia) {
        double percentualDesconto;
        
        if (diasAntecedencia <= 5) {
            percentualDesconto = 0.03; // 3%
        } else if (diasAntecedencia <= 10) {
            percentualDesconto = 0.05; // 5%
        } else {
            percentualDesconto = 0.08; // 8%
        }
        
        double desconto = valorMensalidade * percentualDesconto;
        return valorMensalidade - desconto;
    }

    // Sobrecarga 2: Desconto por nota do ENEM
    public static double calcularMensalidade(double valorMensalidade, double notaEnem) {
        double percentualDesconto;
        
        if (notaEnem < 700.00) {
            percentualDesconto = 0.00; // Sem desconto
        } else if (notaEnem <= 800.00) {
            percentualDesconto = 0.05; // 5%
        } else if (notaEnem <= 900.00) {
            percentualDesconto = 0.08; // 8%
        } else {
            percentualDesconto = 0.10; // 10%
        }
        
        double desconto = valorMensalidade * percentualDesconto;
        return valorMensalidade - desconto;
    }

    // Sobrecarga 3: Desconto por média das 3 maiores notas
    public static double calcularMensalidade(double valorMensalidade, double media1, double media2, double media3) {
        // Verifica se alguma média é inferior a 8.00
        if (media1 < 8.00 || media2 < 8.00 || media3 < 8.00) {
            return valorMensalidade; // Sem desconto
        }
        
        // Calcula a média das três notas
        double mediaCalculada = (media1 + media2 + media3) / 3.0;
        
        double percentualDesconto;
        
        if (mediaCalculada < 8.50) {
            percentualDesconto = 0.00; // Sem desconto
        } else if (mediaCalculada <= 9.00) {
            percentualDesconto = 0.05; // 5%
        } else {
            percentualDesconto = 0.08; // 8%
        }
        
        double desconto = valorMensalidade * percentualDesconto;
        return valorMensalidade - desconto;
    }

    // Método auxiliar para obter o percentual de desconto por dias
    public static double obterPercentualDesconto(int diasAntecedencia) {
        if (diasAntecedencia <= 5) {
            return 3.0;
        } else if (diasAntecedencia <= 10) {
            return 5.0;
        } else {
            return 8.0;
        }
    }

    // Método auxiliar para obter o percentual de desconto por nota ENEM
    public static double obterPercentualDesconto(double notaEnem) {
        if (notaEnem < 700.00) {
            return 0.0;
        } else if (notaEnem <= 800.00) {
            return 5.0;
        } else if (notaEnem <= 900.00) {
            return 8.0;
        } else {
            return 10.0;
        }
    }
}
