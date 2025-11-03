import java.time.LocalDate;

public class Animal {
    private int codigo;
    private String nome;
    private double peso;
    private int idade;
    private char sexo;
    private LocalDate dataEntrada;
    private String motivoAtendimento;
    private String nomeResponsavel;
    private String cpfResponsavel;
    private String telefoneResponsavel;

    // Construtor
    public Animal() {
        this.dataEntrada = LocalDate.now();
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

    public void setPeso(double peso) { 
        this.peso = peso; 
    }
    public double getPeso() { 
        return this.peso; 
    }

    public void setIdade(int idade) { 
        this.idade = idade; 
    }
    public int getIdade() { 
        return this.idade; 
    }

    public void setSexo(char sexo) { 
        this.sexo = sexo; 
    }
    public char getSexo() { 
        return this.sexo; 
    }

    public void setDataEntrada(LocalDate dataEntrada) { 
        this.dataEntrada = dataEntrada; 
    }
    public LocalDate getDataEntrada() { 
        return this.dataEntrada; 
    }

    public void setMotivoAtendimento(String motivoAtendimento) { 
        this.motivoAtendimento = motivoAtendimento; 
    }
    public String getMotivoAtendimento() { 
        return this.motivoAtendimento; 
    }

    public void setNomeResponsavel(String nomeResponsavel) { 
        this.nomeResponsavel = nomeResponsavel; 
    }
    public String getNomeResponsavel() { 
        return this.nomeResponsavel; 
    }

    public void setCpfResponsavel(String cpfResponsavel) { 
        this.cpfResponsavel = cpfResponsavel; 
    }
    public String getCpfResponsavel() { 
        return this.cpfResponsavel; 
    }

    public void setTelefoneResponsavel(String telefoneResponsavel) { 
        this.telefoneResponsavel = telefoneResponsavel; 
    }
    public String getTelefoneResponsavel() { 
        return this.telefoneResponsavel; 
    }

    @Override
    public String toString() {
        return "\n=== DADOS DO ANIMAL ===" +
               "\nCódigo: " + codigo +
               "\nNome: " + nome +
               "\nPeso: " + peso + " kg" +
               "\nIdade: " + idade + " anos" +
               "\nSexo: " + sexo +
               "\nData Entrada: " + dataEntrada +
               "\nMotivo: " + motivoAtendimento +
               "\n--- RESPONSÁVEL ---" +
               "\nNome: " + nomeResponsavel +
               "\nCPF: " + cpfResponsavel +
               "\nTelefone: " + telefoneResponsavel;
    }
}
