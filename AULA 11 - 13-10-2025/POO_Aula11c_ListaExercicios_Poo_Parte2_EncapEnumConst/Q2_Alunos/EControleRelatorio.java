/**
 * Enumerador para controle de relatório
 * Contém os valores: crAnalitico, crSintetico
 * 
 * @author Professor Marçal
 * @version 2025
 */
public enum EControleRelatorio {
    crAnalitico("Analítico"),
    crSintetico("Sintético");
    
    private final String descricao;
    
    /**
     * Construtor do enumerador
     * @param descricao Descrição do tipo de relatório
     */
    EControleRelatorio(String descricao) {
        this.descricao = descricao;
    }
    
    /**
     * Método para obter a descrição do tipo de relatório
     * @return Descrição do tipo de relatório
     */
    public String getDescricao() {
        return descricao;
    }
    
    /**
     * Método toString para exibição
     * @return Descrição do tipo de relatório
     */
    @Override
    public String toString() {
        return descricao;
    }
}
