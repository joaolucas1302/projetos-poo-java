/**
 * Classe Alunos com encapsulamento e consistência
 * Implementa validações para os atributos conforme especificado
 * 
 * @author Professor Marçal
 * @version 2025
 */
public class Alunos {
    // Atributos privados da classe Alunos
    private String RA;                           // Registro Acadêmico
    private String NOME;                         // Nome do aluno
    private double MENSALIDADE;                  // Valor da mensalidade
    private EControleAtivacao SITUACAO;          // Situação do aluno (enumerador)

    /**
     * Construtor padrão da classe Alunos
     */
    public Alunos() {
        this.RA = "";
        this.NOME = "";
        this.MENSALIDADE = 0.0;
        this.SITUACAO = EControleAtivacao.caPendente;
    }

    /**
     * Construtor parametrizado da classe Alunos
     * 
     * @param RA Registro Acadêmico
     * @param NOME Nome do aluno
     * @param MENSALIDADE Valor da mensalidade
     * @param SITUACAO Situação do aluno
     */
    public Alunos(String RA, String NOME, double MENSALIDADE, EControleAtivacao SITUACAO) {
        this.RA = RA;
        this.setNOME(NOME); // Usa o setter para validação
        this.setMENSALIDADE(MENSALIDADE); // Usa o setter para validação
        this.SITUACAO = SITUACAO;
    }

    // Métodos getters e setters com validações

    /**
     * Método getter para o RA
     * @return Registro Acadêmico
     */
    public String getRA() {
        return RA;
    }

    /**
     * Método setter para o RA
     * @param RA Registro Acadêmico
     */
    public void setRA(String RA) {
        this.RA = RA;
    }

    /**
     * Método getter para o NOME
     * @return Nome do aluno
     */
    public String getNOME() {
        return NOME;
    }

    /**
     * Método setter para o NOME com validação de consistência
     * Não aceita valores null ou nomes com menos de 10 caracteres
     * @param NOME Nome do aluno
     */
    public void setNOME(String NOME) {
        if (NOME == null) {
            System.out.println("ERRO: O nome não pode ser null!");
            return;
        }
        
        if (NOME.length() < 10) {
            System.out.println("ERRO: O nome deve ter pelo menos 10 caracteres!");
            System.out.println("Nome informado: '" + NOME + "' (" + NOME.length() + " caracteres)");
            return;
        }
        
        this.NOME = NOME;
    }

    /**
     * Método getter para a MENSALIDADE
     * @return Valor da mensalidade
     */
    public double getMENSALIDADE() {
        return MENSALIDADE;
    }

    /**
     * Método setter para a MENSALIDADE com validação de consistência
     * Não aceita valores zero ou negativos
     * @param MENSALIDADE Valor da mensalidade
     */
    public void setMENSALIDADE(double MENSALIDADE) {
        if (MENSALIDADE <= 0) {
            System.out.println("ERRO: A mensalidade deve ser maior que zero!");
            System.out.println("Valor informado: R$ " + MENSALIDADE);
            return;
        }
        
        this.MENSALIDADE = MENSALIDADE;
    }

    /**
     * Método getter para a SITUACAO
     * @return Situação do aluno
     */
    public EControleAtivacao getSITUACAO() {
        return SITUACAO;
    }

    /**
     * Método setter para a SITUACAO
     * @param SITUACAO Situação do aluno
     */
    public void setSITUACAO(EControleAtivacao SITUACAO) {
        this.SITUACAO = SITUACAO;
    }

    /**
     * Método para imprimir relatório do aluno
     * @param pFormatoRelatorio Formato do relatório (Analítico ou Sintético)
     */
    public void ImprimirRelatorio(EControleRelatorio pFormatoRelatorio) {
        System.out.println("=== RELATÓRIO DO ALUNO ===");
        
        if (pFormatoRelatorio == EControleRelatorio.crSintetico) {
            // Relatório sintético: apenas NOME e RA
            System.out.println("Nome: " + NOME);
            System.out.println("RA: " + RA);
        } else if (pFormatoRelatorio == EControleRelatorio.crAnalitico) {
            // Relatório analítico: todas as informações
            System.out.println("Nome: " + NOME);
            System.out.println("RA: " + RA);
            System.out.printf("Mensalidade: R$ %.2f%n", MENSALIDADE);
            
            // Tratamento especial para o enumerador SITUACAO
            System.out.print("Situação: ");
            switch (SITUACAO) {
                case caAtivo:
                    System.out.println("Ativo");
                    break;
                case caDesativado:
                    System.out.println("Desativado");
                    break;
                case caPendente:
                    System.out.println("Pendente");
                    break;
                default:
                    System.out.println("Situação não definida");
                    break;
            }
        }
        
        System.out.println("=========================");
    }
}
