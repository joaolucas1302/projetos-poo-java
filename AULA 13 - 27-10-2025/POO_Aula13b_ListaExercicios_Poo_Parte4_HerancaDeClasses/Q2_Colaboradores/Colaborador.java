import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Colaborador {
    private String codigoInterno;
    private String nome;
    private String cpf;
    private LocalDate dataAdmissao;
    private double salario;

    // Construtor
    public Colaborador() {
        this.dataAdmissao = LocalDate.now();
        this.codigoInterno = gerarCodigoInterno();
    }

    // Gerar código interno no formato YYMMSSS
    private String gerarCodigoInterno() {
        LocalDate hoje = LocalDate.now();
        int ano = hoje.getYear() % 100; // Pega os 2 últimos dígitos do ano
        int mes = hoje.getMonthValue();
        
        Random random = new Random();
        int codigoAleatorio = random.nextInt(1000); // Gera número de 0 a 999
        
        return String.format("%02d%02d%03d", ano, mes, codigoAleatorio);
    }

    // Getters e Setters com validações
    public String getCodigoInterno() { 
        return this.codigoInterno; 
    }

    public void setNome(String nome) {
        if (nome == null || nome.length() <= 10) {
            throw new IllegalArgumentException("❌ Nome deve ter mais de 10 caracteres!");
        }
        this.nome = nome; 
    }
    public String getNome() { 
        return this.nome; 
    }

    public void setCpf(String cpf) {
        // Remove caracteres não numéricos
        String cpfLimpo = cpf.replaceAll("[^0-9]", "");
        
        if (cpfLimpo.length() != 11) {
            throw new IllegalArgumentException("❌ CPF deve ter exatamente 11 dígitos!");
        }
        
        this.cpf = cpfLimpo;
    }
    public String getCpf() { 
        return this.cpf; 
    }

    public void setDataAdmissao(LocalDate dataAdmissao) { 
        this.dataAdmissao = dataAdmissao; 
    }
    public LocalDate getDataAdmissao() { 
        return this.dataAdmissao; 
    }

    public void setSalario(double salario) {
        if (salario <= 0) {
            throw new IllegalArgumentException("❌ Salário não pode ser negativo ou zero!");
        }
        this.salario = salario; 
    }
    public double getSalario() { 
        return this.salario; 
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "\n=== COLABORADOR ===" +
               "\nCódigo Interno: " + codigoInterno +
               "\nNome: " + nome +
               "\nCPF: " + formatarCPF(cpf) +
               "\nData Admissão: " + dataAdmissao.format(formatter) +
               "\nSalário: R$ " + String.format("%.2f", salario);
    }

    private String formatarCPF(String cpf) {
        return cpf.substring(0, 3) + "." + 
               cpf.substring(3, 6) + "." + 
               cpf.substring(6, 9) + "-" + 
               cpf.substring(9, 11);
    }
}
