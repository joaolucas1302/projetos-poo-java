/**
 * Classe Cliente com encapsulamento, validações e prefixos de nome
 * Implementa todas as validações e regras especificadas
 * 
 * @author Professor Marçal
 * @version 2025
 */
public class Cliente {
    // Atributos da classe Cliente
    private int Codigo;                    // Código do cliente
    private String Nome;                   // Nome do cliente (com prefixo)
    private EnumSexo Sexo;                 // Sexo do cliente (enumerador)
    private int Idade;                     // Idade do cliente

    /**
     * Construtor da classe Cliente
     * Recebe o sexo como parâmetro e armazena em propriedade privada
     * 
     * @param sexo Sexo do cliente (Feminino ou Masculino)
     */
    public Cliente(EnumSexo sexo) {
        this.Codigo = 0;
        this.Nome = "";
        this.Sexo = sexo; // Armazenado em propriedade privada
        this.Idade = 0;
    }

    // Métodos getters e setters com validações

    /**
     * Método getter para o Código
     * @return Código do cliente
     */
    public int getCodigo() {
        return Codigo;
    }

    /**
     * Método setter para o Código
     * @param codigo Código do cliente
     */
    public void setCodigo(int codigo) {
        this.Codigo = codigo;
    }

    /**
     * Método getter para o Nome
     * @return Nome do cliente (com prefixo)
     */
    public String getNome() {
        return Nome;
    }

    /**
     * Método setter para o Nome com prefixo automático
     * Adiciona "Sr." para masculino ou "Sra." para feminino
     * @param nome Nome do cliente (sem prefixo)
     */
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            this.Nome = "";
            return;
        }
        
        // Adiciona prefixo baseado no sexo
        if (this.Sexo == EnumSexo.Masc) {
            this.Nome = "Sr. " + nome.trim();
        } else {
            this.Nome = "Sra. " + nome.trim();
        }
    }

    /**
     * Método getter para o Sexo
     * @return Sexo do cliente
     */
    public EnumSexo getSexo() {
        return Sexo;
    }

    /**
     * Método getter para a Idade
     * @return Idade do cliente
     */
    public int getIdade() {
        return Idade;
    }

    /**
     * Método setter para a Idade com validação
     * Aceita apenas valores maiores ou iguais a 21
     * @param idade Idade do cliente
     */
    public void setIdade(int idade) {
        if (idade < 21) {
            System.out.println("ERRO: A idade deve ser maior ou igual a 21 anos!");
            System.out.println("Idade informada: " + idade + " anos");
            System.out.println("Por favor, informe uma idade válida.");
            return;
        }
        
        this.Idade = idade;
    }

    /**
     * Método para imprimir a ficha completa do cliente
     * Exibe todos os valores de cada propriedade do objeto Cliente
     */
    public void ImprimirFicha() {
        System.out.println("=== FICHA DO CLIENTE ===");
        System.out.println("Código: " + Codigo);
        System.out.println("Nome: " + Nome);
        System.out.println("Sexo: " + Sexo.getDescricao());
        System.out.println("Idade: " + Idade + " anos");
        System.out.println("========================");
    }
}
