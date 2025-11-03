
public class Veiculo {
    private int codigo;
    private String marca;
    private String modelo;
    private int ano;
    private EnumCombustivel combustivel;

    public void setCodigo(int codigo) { this.codigo = codigo; }
    public int getCodigo() { return this.codigo; };

    public void setMarca(String marca) { this.marca = marca; }
    public String getMarca() { return this.marca; }

    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getModelo() { return this.modelo; }

    public void setAno(int ano) { this.ano = ano; } 
    public int getAno() { return this.ano; }

    public void setCombustivel(EnumCombustivel combustivel) { this.combustivel = combustivel; }
    public EnumCombustivel getCombustivel() { return this.combustivel;}

}
