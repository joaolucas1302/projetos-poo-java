
public class Engenheiro extends Colaborador {
    private EnumTipoEngenheiro tipo;
    private EnumNivel nivel;

    // Getters e Setters
    public void setTipo(EnumTipoEngenheiro tipo) { 
        this.tipo = tipo; 
    }
    public EnumTipoEngenheiro getTipo() { 
        return this.tipo; 
    }

    public void setNivel(EnumNivel nivel) { 
        this.nivel = nivel; 
    }
    public EnumNivel getNivel() { 
        return this.nivel; 
    }

    @Override
    public String toString() {
        return super.toString() +
               "\n--- ENGENHEIRO ---" +
               "\nTipo: " + tipo +
               "\nNível: " + nivel;
    }
}
