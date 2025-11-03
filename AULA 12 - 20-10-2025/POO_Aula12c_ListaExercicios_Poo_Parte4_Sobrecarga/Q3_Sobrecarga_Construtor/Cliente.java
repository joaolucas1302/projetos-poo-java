
public class Cliente {
    private int codigo;
    private String nome;
    private int idade;
    private double salario;
    private String cpf;
    private String rg;
    private EnumSituacao situacao;

    // Construtor 1: Para Módulo Orçamento (apenas Nome)
    public Cliente(String nome) {
        this.nome = nome;
        this.situacao = EnumSituacao.ORCAMENTO;
    }

    // Construtor 2: Para Módulo Cliente (todos os dados)
    public Cliente(int codigo, String nome, int idade, double salario, String cpf, String rg) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cpf = cpf;
        this.rg = rg;
        this.situacao = EnumSituacao.CLIENTE;
    }

    // Construtor 3: Para Módulo Pedido (Código, Nome, CPF)
    public Cliente(int codigo, String nome, String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.situacao = EnumSituacao.PEDIDO;
    }

    // Getters e Setters
    public void setCodigo(int codigo) { 
        this.codigo = codigo; 
    }
    public int getCodigo() { 
        return this.codigo; 
    }

    public void setNome(String nome) { 
        this.nome = nome; 
    }
    public String getNome() { 
        return this.nome; 
    }

    public void setIdade(int idade) { 
        this.idade = idade; 
    }
    public int getIdade() { 
        return this.idade; 
    }

    public void setSalario(double salario) { 
        this.salario = salario; 
    }
    public double getSalario() { 
        return this.salario; 
    }

    public void setCpf(String cpf) { 
        this.cpf = cpf; 
    }
    public String getCpf() { 
        return this.cpf; 
    }

    public void setRg(String rg) { 
        this.rg = rg; 
    }
    public String getRg() { 
        return this.rg; 
    }

    public void setSituacao(EnumSituacao situacao) { 
        this.situacao = situacao; 
    }
    public EnumSituacao getSituacao() { 
        return this.situacao; 
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n=== DADOS DO CLIENTE ===");
        sb.append("\nSituação: ").append(situacao);
        
        if (codigo > 0) {
            sb.append("\nCódigo: ").append(codigo);
        }
        
        if (nome != null && !nome.isEmpty()) {
            sb.append("\nNome: ").append(nome);
        }
        
        if (idade > 0) {
            sb.append("\nIdade: ").append(idade).append(" anos");
        }
        
        if (salario > 0) {
            sb.append("\nSalário: R$ ").append(String.format("%.2f", salario));
        }
        
        if (cpf != null && !cpf.isEmpty()) {
            sb.append("\nCPF: ").append(cpf);
        }
        
        if (rg != null && !rg.isEmpty()) {
            sb.append("\nRG: ").append(rg);
        }
        
        return sb.toString();
    }
}
