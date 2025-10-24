/**
 * Classe principal do programa Q1 - Produtos com Encapsulamento
 * 
 * @author Professor Marçal
 * @version 2025
 */
public class Program {
    /**
     * Método principal do programa
     * @param args Argumentos da linha de comando
     */
    public static void main(String[] args) {
        // Demonstração do uso da classe Produtos com encapsulamento
        
        // Criando um produto usando o construtor padrão
        Produtos produto1 = new Produtos();
        
        // Definindo os valores usando os métodos setters (encapsulamento)
        produto1.setCodigoEAN(7891234567890.0);
        produto1.setDescricao("Smartphone Samsung Galaxy S21");
        produto1.setPrecoCusto(2500.00);
        produto1.setMargemLucro(0.30); // 30% de margem
        produto1.setPrecoVenda(3250.00);
        produto1.setSaldoEstoque(15.0);
        
        // Exibindo a ficha do produto
        System.out.println("=== PRODUTO 1 ===");
        produto1.ImprimirFicha();
        
        // Criando outro produto usando o construtor parametrizado
        Produtos produto2 = new Produtos(
            7891234567891.0,
            "Notebook Dell Inspiron 15",
            1800.00,
            0.25, // 25% de margem
            2250.00,
            8.0
        );
        
        // Exibindo a ficha do segundo produto
        System.out.println("\n=== PRODUTO 2 ===");
        produto2.ImprimirFicha();
        
        // Demonstração do acesso aos dados via getters
        System.out.println("\n=== DEMONSTRAÇÃO DOS GETTERS ===");
        System.out.println("Código EAN do Produto 1: " + produto1.getCodigoEAN());
        System.out.println("Descrição do Produto 2: " + produto2.getDescricao());
        System.out.printf("Preço de Venda do Produto 1: R$ %.2f%n", produto1.getPrecoVenda());
    }
}
