import java.util.ArrayList;
import java.util.List;

public class ColaboradorBanco {
    private List<Colaborador> colaboradores;

    public ColaboradorBanco() {
        this.colaboradores = new ArrayList<>();
    }

    // Inserir colaborador
    public void inserir(Colaborador colaborador) {
        colaboradores.add(colaborador);
        System.out.println("✅ Colaborador cadastrado com sucesso! Código: " + colaborador.getCodigoInterno());
    }

    // Alterar colaborador
    public boolean alterar(String codigo, Colaborador novoColaborador) {
        Colaborador colaborador = pesquisarPorCodigo(codigo);
        if (colaborador != null) {
            int index = colaboradores.indexOf(colaborador);
            novoColaborador.setNome(novoColaborador.getNome());
            colaboradores.set(index, novoColaborador);
            System.out.println("✅ Colaborador alterado com sucesso!");
            return true;
        }
        System.out.println("❌ Colaborador não encontrado!");
        return false;
    }

    // Excluir colaborador
    public boolean excluir(String codigo) {
        Colaborador colaborador = pesquisarPorCodigo(codigo);
        if (colaborador != null) {
            colaboradores.remove(colaborador);
            System.out.println("✅ Colaborador removido com sucesso!");
            return true;
        }
        System.out.println("❌ Colaborador não encontrado!");
        return false;
    }

    // Pesquisar por código
    public Colaborador pesquisarPorCodigo(String codigo) {
        for (Colaborador colaborador : colaboradores) {
            if (colaborador.getCodigoInterno().equals(codigo)) {
                return colaborador;
            }
        }
        return null;
    }

    // Pesquisar por nome parcial
    public List<Colaborador> pesquisarPorNome(String nomeParcial) {
        List<Colaborador> resultado = new ArrayList<>();
        String nomeBusca = nomeParcial.toLowerCase();
        
        for (Colaborador colaborador : colaboradores) {
            if (colaborador.getNome().toLowerCase().contains(nomeBusca)) {
                resultado.add(colaborador);
            }
        }
        
        return resultado;
    }

    // Relatório completo
    public void relatorio() {
        if (colaboradores.isEmpty()) {
            System.out.println("\n⚠️  Nenhum colaborador cadastrado!");
            return;
        }

        System.out.println("\n========================================");
        System.out.println("    RELATÓRIO DE COLABORADORES");
        System.out.println("========================================");
        System.out.println("Total de colaboradores: " + colaboradores.size());
        
        for (Colaborador colaborador : colaboradores) {
            System.out.println(colaborador.toString());
            System.out.println("========================================");
        }
    }

    // Retornar total de colaboradores
    public int getTotalColaboradores() {
        return colaboradores.size();
    }
}
