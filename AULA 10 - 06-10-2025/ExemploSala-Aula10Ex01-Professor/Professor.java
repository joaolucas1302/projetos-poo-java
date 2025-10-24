public class Professor {
    //atributos
    private int codigo;
    private String nome;
    private int numeroAulas;
    private double salario;
    
    //propriedades
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public int getCodigo() {return this.codigo;}
    
    public void setNome(String nome) {this.nome = nome;}
    public String getNome() {return this.nome;}

    public void setNumeroAulas(int numero) {
        this.numeroAulas = numero; 
        this.salario = 37.80 * this.numeroAulas;
    }
    public int getNumeroAulas() {return this.numeroAulas; }

    //public void setSalario(double salario) {this.salario = salario;}
    public double getSalario() {return this.salario; }    

}
