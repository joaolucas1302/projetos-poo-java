
public class Carro extends Veiculo {
    private int numeroPortas;
    private boolean hibrido;

    public void setNumeroPortas(int numeroPortas) { this.numeroPortas = numeroPortas; }
    public int getNumeroPortas() { return this.numeroPortas; }

    public void setHibrido(boolean hibrido) { this.hibrido = hibrido; }
    public boolean isHibrido() { return this.hibrido; }

    @Override
    public String toString() {
        return "Codigo: " + getCodigo() 
            + "\nMarca: " + getMarca() 
            + "\nModelo: " + getModelo();
    }
}
