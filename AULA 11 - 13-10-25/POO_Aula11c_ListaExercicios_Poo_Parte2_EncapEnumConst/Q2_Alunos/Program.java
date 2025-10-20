/**
 * Classe principal do programa Q2 - Alunos com Enumeradores e Consistência
 * 
 * @author Professor Marçal
 * @version 2025
 */
public class Program {
    /**
     * Método principal do programa
     * @param args Argumentos da linha de comando
     */
    public static void main(String[] args) {
        // Demonstração do uso da classe Alunos com enumeradores e consistência
        
        System.out.println("=== DEMONSTRAÇÃO DA CLASSE ALUNOS ===\n");
        
        // Criando um aluno usando o construtor padrão
        Alunos aluno1 = new Alunos();
        
        // Testando validações de consistência
        System.out.println("--- Testando Validações de Consistência ---");
        
        // Teste 1: Nome com menos de 10 caracteres (deve falhar)
        System.out.println("1. Testando nome com menos de 10 caracteres:");
        aluno1.setNOME("João"); // Nome muito curto
        
        // Teste 2: Nome null (deve falhar)
        System.out.println("\n2. Testando nome null:");
        aluno1.setNOME(null);
        
        // Teste 3: Nome válido
        System.out.println("\n3. Testando nome válido:");
        aluno1.setNOME("João da Silva Santos"); // Nome válido
        
        // Teste 4: Mensalidade zero (deve falhar)
        System.out.println("\n4. Testando mensalidade zero:");
        aluno1.setMENSALIDADE(0.0);
        
        // Teste 5: Mensalidade negativa (deve falhar)
        System.out.println("\n5. Testando mensalidade negativa:");
        aluno1.setMENSALIDADE(-100.0);
        
        // Teste 6: Mensalidade válida
        System.out.println("\n6. Testando mensalidade válida:");
        aluno1.setMENSALIDADE(850.50);
        
        // Definindo outros atributos
        aluno1.setRA("2024001234");
        aluno1.setSITUACAO(EControleAtivacao.caAtivo);
        
        // Exibindo relatórios
        System.out.println("\n--- Relatórios ---");
        System.out.println("Relatório Sintético:");
        aluno1.ImprimirRelatorio(EControleRelatorio.crSintetico);
        
        System.out.println("\nRelatório Analítico:");
        aluno1.ImprimirRelatorio(EControleRelatorio.crAnalitico);
        
        // Criando outro aluno usando o construtor parametrizado
        System.out.println("\n--- Segundo Aluno ---");
        Alunos aluno2 = new Alunos(
            "2024005678",
            "Maria Fernanda Oliveira", // Nome válido (mais de 10 caracteres)
            1200.00, // Mensalidade válida
            EControleAtivacao.caPendente
        );
        
        System.out.println("Relatório Analítico do segundo aluno:");
        aluno2.ImprimirRelatorio(EControleRelatorio.crAnalitico);
        
        // Demonstração de todos os valores do enumerador EControleAtivacao
        System.out.println("\n--- Valores do Enumerador EControleAtivacao ---");
        for (EControleAtivacao situacao : EControleAtivacao.values()) {
            System.out.println("Valor: " + situacao + " - Descrição: " + situacao.getDescricao());
        }
        
        // Demonstração de todos os valores do enumerador EControleRelatorio
        System.out.println("\n--- Valores do Enumerador EControleRelatorio ---");
        for (EControleRelatorio formato : EControleRelatorio.values()) {
            System.out.println("Valor: " + formato + " - Descrição: " + formato.getDescricao());
        }
    }
}
