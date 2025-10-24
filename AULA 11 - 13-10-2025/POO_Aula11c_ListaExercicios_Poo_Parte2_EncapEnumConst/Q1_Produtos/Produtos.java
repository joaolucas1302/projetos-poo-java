/**
 * Classe Produtos com encapsulamento adequado
 * Atributos privados com métodos getters e setters públicos
 * 
 * @author Professor Marçal
 * @version 2025
 */
public class Produtos {
    // Atributos privados da classe Produtos
    private double codigoEAN;        // Código EAN do produto
    private String descricao;        // Descrição do produto
    private double precoCusto;       // Preço de custo
    private double margemLucro;      // Margem de lucro
    private double precoVenda;       // Preço de venda
    private double saldoEstoque;     // Saldo em estoque

    /**
     * Construtor padrão da classe Produtos
     */
    public Produtos() {
        this.codigoEAN = 0.0;
        this.descricao = "";
        this.precoCusto = 0.0;
        this.margemLucro = 0.0;
        this.precoVenda = 0.0;
        this.saldoEstoque = 0.0;
    }

    /**
     * Construtor parametrizado da classe Produtos
     * 
     * @param codigoEAN Código EAN do produto
     * @param descricao Descrição do produto
     * @param precoCusto Preço de custo
     * @param margemLucro Margem de lucro
     * @param precoVenda Preço de venda
     * @param saldoEstoque Saldo em estoque
     */
    public Produtos(double codigoEAN, String descricao, double precoCusto, 
                   double margemLucro, double precoVenda, double saldoEstoque) {
        this.codigoEAN = codigoEAN;
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        this.margemLucro = margemLucro;
        this.precoVenda = precoVenda;
        this.saldoEstoque = saldoEstoque;
    }

    // Métodos getters e setters para encapsulamento

    /**
     * Método getter para o código EAN
     * @return Código EAN do produto
     */
    public double getCodigoEAN() {
        return codigoEAN;
    }

    /**
     * Método setter para o código EAN
     * @param codigoEAN Código EAN do produto
     */
    public void setCodigoEAN(double codigoEAN) {
        this.codigoEAN = codigoEAN;
    }

    /**
     * Método getter para a descrição
     * @return Descrição do produto
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Método setter para a descrição
     * @param descricao Descrição do produto
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Método getter para o preço de custo
     * @return Preço de custo
     */
    public double getPrecoCusto() {
        return precoCusto;
    }

    /**
     * Método setter para o preço de custo
     * @param precoCusto Preço de custo
     */
    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    /**
     * Método getter para a margem de lucro
     * @return Margem de lucro
     */
    public double getMargemLucro() {
        return margemLucro;
    }

    /**
     * Método setter para a margem de lucro
     * @param margemLucro Margem de lucro
     */
    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    /**
     * Método getter para o preço de venda
     * @return Preço de venda
     */
    public double getPrecoVenda() {
        return precoVenda;
    }

    /**
     * Método setter para o preço de venda
     * @param precoVenda Preço de venda
     */
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    /**
     * Método getter para o saldo em estoque
     * @return Saldo em estoque
     */
    public double getSaldoEstoque() {
        return saldoEstoque;
    }

    /**
     * Método setter para o saldo em estoque
     * @param saldoEstoque Saldo em estoque
     */
    public void setSaldoEstoque(double saldoEstoque) {
        this.saldoEstoque = saldoEstoque;
    }

    /**
     * Método para imprimir a ficha completa do produto
     * Exibe todos os dados informados no console
     */
    public void ImprimirFicha() {
        System.out.println("=== FICHA DO PRODUTO ===");
        System.out.println("Código EAN: " + codigoEAN);
        System.out.println("Descrição: " + descricao);
        System.out.printf("Preço de Custo: R$ %.2f%n", precoCusto);
        System.out.printf("Margem de Lucro: %.2f%%%n", margemLucro * 100);
        System.out.printf("Preço de Venda: R$ %.2f%n", precoVenda);
        System.out.printf("Saldo em Estoque: %.2f unidades%n", saldoEstoque);
        System.out.println("========================");
    }
}
