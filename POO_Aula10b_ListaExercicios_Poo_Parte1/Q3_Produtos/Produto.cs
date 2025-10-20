using System;

namespace POO_Aula10b_ListaExercicios_Poo_Parte1
{
    /// <summary>
    /// Classe que representa um Produto com todos os atributos solicitados
    /// </summary>
    public class Produto
    {
        // Atributos privados da classe Produto
        private int codigo;              // Código do produto
        private string nome;             // Nome do produto
        private string descricao;        // Descrição do produto
        private int quantidadeEstoque;   // Quantidade em estoque
        private double precoCusto;       // Preço de custo
        private double margemLucro;      // Margem de lucro (em percentual)

        // Propriedades públicas para acessar os atributos privados
        /// <summary>
        /// Propriedade para acessar e modificar o Código do produto
        /// </summary>
        public int Codigo
        {
            get { return codigo; }
            set { codigo = value; }
        }

        /// <summary>
        /// Propriedade para acessar e modificar o Nome do produto
        /// </summary>
        public string Nome
        {
            get { return nome; }
            set { nome = value; }
        }

        /// <summary>
        /// Propriedade para acessar e modificar a Descrição do produto
        /// </summary>
        public string Descricao
        {
            get { return descricao; }
            set { descricao = value; }
        }

        /// <summary>
        /// Propriedade para acessar e modificar a Quantidade em Estoque
        /// </summary>
        public int QuantidadeEstoque
        {
            get { return quantidadeEstoque; }
            set { quantidadeEstoque = value; }
        }

        /// <summary>
        /// Propriedade para acessar e modificar o Preço de Custo
        /// </summary>
        public double PrecoCusto
        {
            get { return precoCusto; }
            set { precoCusto = value; }
        }

        /// <summary>
        /// Propriedade para acessar e modificar a Margem de Lucro
        /// </summary>
        public double MargemLucro
        {
            get { return margemLucro; }
            set { margemLucro = value; }
        }

        /// <summary>
        /// Propriedade somente leitura para o Preço de Venda
        /// Calculado automaticamente: Preço Custo * Margem Lucro
        /// </summary>
        public double PrecoVenda
        {
            get { return precoCusto * margemLucro; }
        }

        /// <summary>
        /// Construtor padrão da classe Produto
        /// </summary>
        public Produto()
        {
            codigo = 0;
            nome = "";
            descricao = "";
            quantidadeEstoque = 0;
            precoCusto = 0.0;
            margemLucro = 0.0;
        }

        /// <summary>
        /// Construtor parametrizado da classe Produto
        /// </summary>
        /// <param name="codigo">Código do produto</param>
        /// <param name="nome">Nome do produto</param>
        /// <param name="descricao">Descrição do produto</param>
        /// <param name="quantidadeEstoque">Quantidade em estoque</param>
        /// <param name="precoCusto">Preço de custo</param>
        /// <param name="margemLucro">Margem de lucro</param>
        public Produto(int codigo, string nome, string descricao, int quantidadeEstoque, double precoCusto, double margemLucro)
        {
            this.codigo = codigo;
            this.nome = nome;
            this.descricao = descricao;
            this.quantidadeEstoque = quantidadeEstoque;
            this.precoCusto = precoCusto;
            this.margemLucro = margemLucro;
        }

        /// <summary>
        /// Método para exibir todas as informações do produto
        /// </summary>
        public void ExibirDados()
        {
            Console.WriteLine("=== DADOS DO PRODUTO ===");
            Console.WriteLine($"Código: {Codigo}");
            Console.WriteLine($"Nome: {Nome}");
            Console.WriteLine($"Descrição: {Descricao}");
            Console.WriteLine($"Quantidade em Estoque: {QuantidadeEstoque}");
            Console.WriteLine($"Preço de Custo: R$ {PrecoCusto:F2}");
            Console.WriteLine($"Margem de Lucro: {MargemLucro:P2}");
            Console.WriteLine($"Preço de Venda: R$ {PrecoVenda:F2}");
            Console.WriteLine("========================");
        }
    }
}

