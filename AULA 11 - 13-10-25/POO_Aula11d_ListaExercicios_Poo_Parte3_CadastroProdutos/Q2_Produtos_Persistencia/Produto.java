/**
 * Classe que representa um Produto com todos os atributos solicitados
 * 
 * @author Professor Marçal
 * @version 2025
 */
public class Produto {
    // Atributos privados da classe Produto
    private int codigo;              // Código do produto
    private String nome;             // Nome do produto
    private String descricao;        // Descrição do produto
    private int quantidadeEstoque;   // Quantidade em estoque
    private double precoCusto;       // Preço de custo
    private double margemLucro;      // Margem de lucro (em percentual)

    /**
     * Construtor padrão da classe Produto
     */
    public Produto() {
        this.codigo = 0;
        this.nome = "";
        this.descricao = "";
        this.quantidadeEstoque = 0;
        this.precoCusto = 0.0;
        this.margemLucro = 0.0;
    }

    /**
     * Construtor parametrizado da classe Produto
     * 
     * @param codigo Código do produto
     * @param nome Nome do produto
     * @param descricao Descrição do produto
     * @param quantidadeEstoque Quantidade em estoque
     * @param precoCusto Preço de custo
     * @param margemLucro Margem de lucro
     */
    public Produto(int codigo, String nome, String descricao, int quantidadeEstoque, 
                   double precoCusto, double margemLucro) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidadeEstoque = quantidadeEstoque;
        this.precoCusto = precoCusto;
        this.margemLucro = margemLucro;
    }

    // Métodos getters e setters para acessar os atributos privados

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    /**
     * Método para calcular o preço de venda
     * Calculado automaticamente: Preço Custo * Margem Lucro
     * @return Preço de venda calculado
     */
    public double getPrecoVenda() {
        return precoCusto * margemLucro;
    }

    /**
     * Método para exibir todas as informações do produto
     */
    public void exibirDados() {
        System.out.println("=== DADOS DO PRODUTO ===");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
        System.out.printf("Preço de Custo: R$ %.2f%n", precoCusto);
        System.out.printf("Margem de Lucro: %.2f%%%n", margemLucro * 100);
        System.out.printf("Preço de Venda: R$ %.2f%n", getPrecoVenda());
        System.out.println("========================");
    }
}
