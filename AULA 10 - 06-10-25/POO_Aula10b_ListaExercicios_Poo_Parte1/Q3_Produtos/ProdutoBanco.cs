using System;

namespace POO_Aula10b_ListaExercicios_Poo_Parte1
{
    /// <summary>
    /// Classe responsável pela persistência dos dados dos produtos
    /// </summary>
    public class ProdutoBanco
    {
        // Vetor para armazenar os produtos (capacidade para 150 produtos)
        private Produto[] produtos;
        private int quantidadeProdutos; // Contador de produtos cadastrados

        /// <summary>
        /// Construtor da classe ProdutoBanco
        /// </summary>
        public ProdutoBanco()
        {
            produtos = new Produto[150]; // Capacidade para 150 produtos
            quantidadeProdutos = 0;
        }

        /// <summary>
        /// Propriedade para obter a quantidade de produtos cadastrados
        /// </summary>
        public int QuantidadeProdutos
        {
            get { return quantidadeProdutos; }
        }

        /// <summary>
        /// Propriedade para obter a capacidade máxima do banco
        /// </summary>
        public int CapacidadeMaxima
        {
            get { return produtos.Length; }
        }

        /// <summary>
        /// Método para adicionar um novo produto ao banco de dados
        /// </summary>
        /// <param name="produto">Objeto Produto a ser adicionado</param>
        /// <returns>True se adicionado com sucesso, False se não há espaço</returns>
        public bool Adicionar(Produto produto)
        {
            if (quantidadeProdutos >= produtos.Length)
            {
                return false; // Capacidade máxima atingida
            }

            produtos[quantidadeProdutos] = produto;
            quantidadeProdutos++;
            return true;
        }

        /// <summary>
        /// Método para remover um produto pelo código
        /// </summary>
        /// <param name="codigo">Código do produto a ser removido</param>
        /// <returns>True se removido com sucesso, False se não encontrado</returns>
        public bool Remover(int codigo)
        {
            int indice = BuscarProdutoPorCodigo(codigo);

            if (indice == -1)
            {
                return false; // Produto não encontrado
            }

            // Remove o produto movendo todos os elementos uma posição para a esquerda
            for (int i = indice; i < quantidadeProdutos - 1; i++)
            {
                produtos[i] = produtos[i + 1];
            }

            // Limpa a última posição e decrementa o contador
            produtos[quantidadeProdutos - 1] = null;
            quantidadeProdutos--;

            return true;
        }

        /// <summary>
        /// Método para buscar um produto pelo código
        /// </summary>
        /// <param name="codigo">Código do produto a ser buscado</param>
        /// <returns>Objeto Produto encontrado ou null se não encontrado</returns>
        public Produto BuscarProduto(int codigo)
        {
            int indice = BuscarProdutoPorCodigo(codigo);
            return indice == -1 ? null : produtos[indice];
        }

        /// <summary>
        /// Método para obter todos os produtos cadastrados
        /// </summary>
        /// <returns>Array com todos os produtos cadastrados</returns>
        public Produto[] ObterTodosProdutos()
        {
            Produto[] todosProdutos = new Produto[quantidadeProdutos];
            for (int i = 0; i < quantidadeProdutos; i++)
            {
                todosProdutos[i] = produtos[i];
            }
            return todosProdutos;
        }

        /// <summary>
        /// Método para limpar toda a base de dados
        /// </summary>
        public void LimparBaseDados()
        {
            for (int i = 0; i < quantidadeProdutos; i++)
            {
                produtos[i] = null;
            }
            quantidadeProdutos = 0;
        }

        /// <summary>
        /// Método para obter o produto com maior preço de venda
        /// </summary>
        /// <returns>Produto com maior preço de venda ou null se não há produtos</returns>
        public Produto ObterProdutoMaiorPreco()
        {
            if (quantidadeProdutos == 0)
            {
                return null;
            }

            Produto produtoMaiorPreco = produtos[0];
            double maiorPreco = produtoMaiorPreco.PrecoVenda;

            // Percorre todos os produtos para encontrar o de maior preço
            for (int i = 1; i < quantidadeProdutos; i++)
            {
                if (produtos[i].PrecoVenda > maiorPreco)
                {
                    maiorPreco = produtos[i].PrecoVenda;
                    produtoMaiorPreco = produtos[i];
                }
            }

            return produtoMaiorPreco;
        }

        /// <summary>
        /// Método auxiliar para buscar um produto pelo código e retornar o índice
        /// </summary>
        /// <param name="codigo">Código do produto a ser buscado</param>
        /// <returns>Índice do produto no vetor ou -1 se não encontrado</returns>
        private int BuscarProdutoPorCodigo(int codigo)
        {
            for (int i = 0; i < quantidadeProdutos; i++)
            {
                if (produtos[i].Codigo == codigo)
                {
                    return i;
                }
            }
            return -1; // Produto não encontrado
        }
    }
}

