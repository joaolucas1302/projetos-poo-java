/**
 * Enumerador para controle de ativação
 * Contém os valores: caAtivo, caDesativado, caPendente
 * 
 * @author Professor Marçal
 * @version 2025
 */
public enum EControleAtivacao {
    caAtivo("Ativo"),
    caDesativado("Desativado"),
    caPendente("Pendente");
    
    private final String descricao;
    
    /**
     * Construtor do enumerador
     * @param descricao Descrição do status
     */
    EControleAtivacao(String descricao) {
        this.descricao = descricao;
    }
    
    /**
     * Método para obter a descrição do status
     * @return Descrição do status
     */
    public String getDescricao() {
        return descricao;
    }
    
    /**
     * Método toString para exibição
     * @return Descrição do status
     */
    @Override
    public String toString() {
        return descricao;
    }
}
