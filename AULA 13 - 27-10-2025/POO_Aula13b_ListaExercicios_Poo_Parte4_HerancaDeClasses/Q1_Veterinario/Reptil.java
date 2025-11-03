
public class Reptil extends Animal {
    private EnumClassificacaoReptil classificacao;
    private EnumTipoReproducao tipoReproducao;
    private EnumHabitat habitat;

    // Getters e Setters
    public void setClassificacao(EnumClassificacaoReptil classificacao) { 
        this.classificacao = classificacao; 
    }
    public EnumClassificacaoReptil getClassificacao() { 
        return this.classificacao; 
    }

    public void setTipoReproducao(EnumTipoReproducao tipoReproducao) { 
        this.tipoReproducao = tipoReproducao; 
    }
    public EnumTipoReproducao getTipoReproducao() { 
        return this.tipoReproducao; 
    }

    public void setHabitat(EnumHabitat habitat) { 
        this.habitat = habitat; 
    }
    public EnumHabitat getHabitat() { 
        return this.habitat; 
    }

    @Override
    public String toString() {
        return super.toString() +
               "\n--- RÉPTIL ---" +
               "\nClassificação: " + classificacao +
               "\nTipo Reprodução: " + tipoReproducao +
               "\nHabitat: " + habitat;
    }
}
