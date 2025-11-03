
public class Mamifero extends Animal {
    private EnumTipoMamifero tipo;
    private String cor;
    private EnumAlimentacao alimentacao;

    // Getters e Setters
    public void setTipo(EnumTipoMamifero tipo) { 
        this.tipo = tipo; 
    }
    public EnumTipoMamifero getTipo() { 
        return this.tipo; 
    }

    public void setCor(String cor) { 
        this.cor = cor; 
    }
    public String getCor() { 
        return this.cor; 
    }

    public void setAlimentacao(EnumAlimentacao alimentacao) { 
        this.alimentacao = alimentacao; 
    }
    public EnumAlimentacao getAlimentacao() { 
        return this.alimentacao; 
    }

    @Override
    public String toString() {
        return super.toString() +
               "\n--- MAMÍFERO ---" +
               "\nTipo: " + tipo +
               "\nCor: " + cor +
               "\nAlimentação: " + alimentacao;
    }
}
