/**
 * Enumerador para controle de sexo
 * Contém os valores: Fem (Feminino) e Masc (Masculino)
 * 
 * @author Professor Marçal
 * @version 2025
 */
public enum EnumSexo {
    Fem("Feminino"),
    Masc("Masculino");
    
    private final String descricao;
    
    /**
     * Construtor do enumerador
     * @param descricao Descrição do sexo
     */
    EnumSexo(String descricao) {
        this.descricao = descricao;
    }
    
    /**
     * Método para obter a descrição do sexo
     * @return Descrição do sexo
     */
    public String getDescricao() {
        return descricao;
    }
    
    /**
     * Método toString para exibição
     * @return Descrição do sexo
     */
    @Override
    public String toString() {
        return descricao;
    }
}
