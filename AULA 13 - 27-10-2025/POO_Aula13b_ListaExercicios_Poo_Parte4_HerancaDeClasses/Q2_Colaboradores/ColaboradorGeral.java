
public class ColaboradorGeral extends Colaborador {
    private EnumCargo cargo;
    private EnumAreaGeral area;

    // Getters e Setters
    public void setCargo(EnumCargo cargo) { 
        this.cargo = cargo; 
    }
    public EnumCargo getCargo() { 
        return this.cargo; 
    }

    public void setArea(EnumAreaGeral area) { 
        this.area = area; 
    }
    public EnumAreaGeral getArea() { 
        return this.area; 
    }

    @Override
    public String toString() {
        return super.toString() +
               "\n--- COLABORADOR GERAL ---" +
               "\nCargo: " + cargo +
               "\nÁrea: " + area;
    }
}
