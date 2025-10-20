/**
 * Classe responsável pela persistência dos dados dos produtos
 * 
 * @author Professor Marçal
 * @version 2025
 */
public class ProdutoBanco {
    // Vetor para armazenar os produtos (capacidade para 150 produtos)
    private Produto[] produtos;
    private int quantidadeProdutos; // Contador de produtos cadastrados

    /**
     * Construtor da classe ProdutoBanco
     */
    public ProdutoBanco() {
        produtos = new Produto[150]; // Capacidade para 150 produtos
        quantidadeProdutos = 0;
    }

    /**
     * Método getter para obter a quantidade de produtos cadastrados
     * @return Quantidade de produtos cadastrados
     */
    public int getQuantidadeProdutos() {
        return quantidadeProdutos;
    }

    /**
     * Método getter para obter a capacidade máxima do banco
     * @return Capacidade máxima do banco
     */
    public int getCapacidadeMaxima() {
        return produtos.length;
    }

    /**
     * Método para adicionar um novo produto ao banco de dados
     * @param produto Objeto Produto a ser adicionado
     * @return True se adicionado com sucesso, False se não há espaço
     */
    public boolean adicionar(Produto produto) {
        if (quantidadeProdutos >= produtos.length) {
            return false; // Capacidade máxima atingida
        }

        produtos[quantidadeProdutos] = produto;
        quantidadeProdutos++;
        return true;
    }

    /**
     * Método para remover um produto pelo código
     * @param codigo Código do produto a ser removido
     * @return True se removido com sucesso, False se não encontrado
     */
    public boolean remover(int codigo) {
        int indice = buscarProdutoPorCodigo(codigo);

        if (indice == -1) {
            return false; // Produto não encontrado
        }

        // Remove o produto movendo todos os elementos uma posição para a esquerda
        for (int i = indice; i < quantidadeProdutos - 1; i++) {
            produtos[i] = produtos[i + 1];
        }

        // Limpa a última posição e decrementa o contador
        produtos[quantidadeProdutos - 1] = null;
        quantidadeProdutos--;

        return true;
    }

    /**
     * Método para buscar um produto pelo código
     * @param codigo Código do produto a ser buscado
     * @return Objeto Produto encontrado ou null se não encontrado
     */
    public Produto buscarProduto(int codigo) {
        int indice = buscarProdutoPorCodigo(codigo);
        return indice == -1 ? null : produtos[indice];
    }

    /**
     * Método para obter todos os produtos cadastrados
     * @return Array com todos os produtos cadastrados
     */
    public Produto[] obterTodosProdutos() {
        Produto[] todosProdutos = new Produto[quantidadeProdutos];
        for (int i = 0; i < quantidadeProdutos; i++) {
            todosProdutos[i] = produtos[i];
        }
        return todosProdutos;
    }

    /**
     * Método para limpar toda a base de dados
     */
    public void limparBaseDados() {
        for (int i = 0; i < quantidadeProdutos; i++) {
            produtos[i] = null;
        }
        quantidadeProdutos = 0;
    }

    /**
     * Método para obter o produto com maior preço de venda
     * @return Produto com maior preço de venda ou null se não há produtos
     */
    public Produto obterProdutoMaiorPreco() {
        if (quantidadeProdutos == 0) {
            return null;
        }

        Produto produtoMaiorPreco = produtos[0];
        double maiorPreco = produtoMaiorPreco.getPrecoVenda();

        // Percorre todos os produtos para encontrar o de maior preço
        for (int i = 1; i < quantidadeProdutos; i++) {
            if (produtos[i].getPrecoVenda() > maiorPreco) {
                maiorPreco = produtos[i].getPrecoVenda();
                produtoMaiorPreco = produtos[i];
            }
        }

        return produtoMaiorPreco;
    }

    /**
     * Método auxiliar para buscar um produto pelo código e retornar o índice
     * @param codigo Código do produto a ser buscado
     * @return Índice do produto no vetor ou -1 se não encontrado
     */
    private int buscarProdutoPorCodigo(int codigo) {
        for (int i = 0; i < quantidadeProdutos; i++) {
            if (produtos[i].getCodigo() == codigo) {
                return i;
            }
        }
        return -1; // Produto não encontrado
    }
}
