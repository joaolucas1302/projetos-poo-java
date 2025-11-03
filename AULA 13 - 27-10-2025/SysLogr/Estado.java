public class Estado {
    //atributos
    private int codigo;
    private String nome;
    private String sigla;

    //propriedades
    public void setCodigo(int codigo) {
        if (codigo <= 0) {
            System.out.println("Código inválido!");
            return;
        } else {
            this.codigo = codigo;
        }
        
    }

    public int getCodigo() {return this.codigo;}

    public void setNome(String nome) {this.nome = nome;}
    public String getNome() {return this.nome;}

    public void setSigla(String sigla) {this.sigla = sigla;}
    public String getSigla() {return this.sigla;}
}
