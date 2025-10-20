using System;

namespace POO_Aula10b_ListaExercicios_Poo_Parte1
{
    /// <summary>
    /// Classe responsável pela persistência dos dados dos alunos
    /// </summary>
    public class AlunoBanco
    {
        // Vetor para armazenar os alunos (persistência em memória)
        private Aluno[] alunos;
        private int quantidadeAlunos; // Contador de alunos cadastrados

        /// <summary>
        /// Construtor da classe AlunoBanco
        /// </summary>
        public AlunoBanco()
        {
            alunos = new Aluno[100]; // Capacidade para 100 alunos
            quantidadeAlunos = 0;
        }

        /// <summary>
        /// Propriedade para obter a quantidade de alunos cadastrados
        /// </summary>
        public int QuantidadeAlunos
        {
            get { return quantidadeAlunos; }
        }

        /// <summary>
        /// Método para adicionar um novo aluno ao banco de dados
        /// </summary>
        /// <param name="aluno">Objeto Aluno a ser adicionado</param>
        /// <returns>True se adicionado com sucesso, False se não há espaço</returns>
        public bool Adicionar(Aluno aluno)
        {
            if (quantidadeAlunos >= alunos.Length)
            {
                return false; // Capacidade máxima atingida
            }

            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
            return true;
        }

        /// <summary>
        /// Método para remover um aluno pelo RA
        /// </summary>
        /// <param name="ra">RA do aluno a ser removido</param>
        /// <returns>True se removido com sucesso, False se não encontrado</returns>
        public bool Remover(string ra)
        {
            int indice = BuscarAlunoPorRA(ra);

            if (indice == -1)
            {
                return false; // Aluno não encontrado
            }

            // Remove o aluno movendo todos os elementos uma posição para a esquerda
            for (int i = indice; i < quantidadeAlunos - 1; i++)
            {
                alunos[i] = alunos[i + 1];
            }

            // Limpa a última posição e decrementa o contador
            alunos[quantidadeAlunos - 1] = null;
            quantidadeAlunos--;

            return true;
        }

        /// <summary>
        /// Método para buscar um aluno pelo RA
        /// </summary>
        /// <param name="ra">RA do aluno a ser buscado</param>
        /// <returns>Objeto Aluno encontrado ou null se não encontrado</returns>
        public Aluno BuscarAluno(string ra)
        {
            int indice = BuscarAlunoPorRA(ra);
            return indice == -1 ? null : alunos[indice];
        }

        /// <summary>
        /// Método para obter todos os alunos cadastrados
        /// </summary>
        /// <returns>Array com todos os alunos cadastrados</returns>
        public Aluno[] ObterTodosAlunos()
        {
            Aluno[] todosAlunos = new Aluno[quantidadeAlunos];
            for (int i = 0; i < quantidadeAlunos; i++)
            {
                todosAlunos[i] = alunos[i];
            }
            return todosAlunos;
        }

        /// <summary>
        /// Método auxiliar para buscar um aluno pelo RA e retornar o índice
        /// </summary>
        /// <param name="ra">RA do aluno a ser buscado</param>
        /// <returns>Índice do aluno no vetor ou -1 se não encontrado</returns>
        private int BuscarAlunoPorRA(string ra)
        {
            for (int i = 0; i < quantidadeAlunos; i++)
            {
                if (alunos[i].RA.Equals(ra, StringComparison.OrdinalIgnoreCase))
                {
                    return i;
                }
            }
            return -1; // Aluno não encontrado
        }
    }
}

