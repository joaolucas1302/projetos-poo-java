using System;

namespace POO_Aula10b_ListaExercicios_Poo_Parte1
{
    /// <summary>
    /// Classe que representa um Aluno com todos os atributos solicitados
    /// </summary>
    public class Aluno
    {
        // Atributos privados da classe Aluno
        private string ra;           // Registro Acadêmico
        private string nome;         // Nome do aluno
        private int idade;           // Idade do aluno
        private string cpf;          // CPF do aluno
        private string sexo;         // Sexo do aluno
        private string email;        // E-mail do aluno
        private string telefone;     // Telefone do aluno

        // Propriedades públicas para acessar os atributos privados
        public string RA
        {
            get { return ra; }
            set { ra = value; }
        }

        public string Nome
        {
            get { return nome; }
            set { nome = value; }
        }

        public int Idade
        {
            get { return idade; }
            set { idade = value; }
        }

        public string CPF
        {
            get { return cpf; }
            set { cpf = value; }
        }

        public string Sexo
        {
            get { return sexo; }
            set { sexo = value; }
        }

        public string Email
        {
            get { return email; }
            set { email = value; }
        }

        public string Telefone
        {
            get { return telefone; }
            set { telefone = value; }
        }

        /// <summary>
        /// Construtor padrão da classe Aluno
        /// </summary>
        public Aluno()
        {
            ra = "";
            nome = "";
            idade = 0;
            cpf = "";
            sexo = "";
            email = "";
            telefone = "";
        }

        /// <summary>
        /// Construtor parametrizado da classe Aluno
        /// </summary>
        public Aluno(string ra, string nome, int idade, string cpf, string sexo, string email, string telefone)
        {
            this.ra = ra;
            this.nome = nome;
            this.idade = idade;
            this.cpf = cpf;
            this.sexo = sexo;
            this.email = email;
            this.telefone = telefone;
        }

        /// <summary>
        /// Método para exibir todas as informações do aluno
        /// </summary>
        public void ExibirDados()
        {
            Console.WriteLine("=== DADOS DO ALUNO ===");
            Console.WriteLine($"RA: {RA}");
            Console.WriteLine($"Nome: {Nome}");
            Console.WriteLine($"Idade: {Idade}");
            Console.WriteLine($"CPF: {CPF}");
            Console.WriteLine($"Sexo: {Sexo}");
            Console.WriteLine($"E-mail: {Email}");
            Console.WriteLine($"Telefone: {Telefone}");
            Console.WriteLine("======================");
        }
    }
}

