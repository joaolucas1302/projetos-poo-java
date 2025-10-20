/**
 * Classe principal do programa Q3 - Cliente com Enumerador e Validações
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
        // Demonstração do uso da classe Cliente com enumerador e validações
        
        System.out.println("=== DEMONSTRAÇÃO DA CLASSE CLIENTE ===\n");
        
        // Criando clientes usando o construtor com parâmetro de sexo
        System.out.println("--- Criando Cliente Masculino ---");
        Cliente cliente1 = new Cliente(EnumSexo.Masc);
        
        // Testando validações de consistência
        System.out.println("--- Testando Validações de Consistência ---");
        
        // Teste 1: Idade menor que 21 (deve falhar)
        System.out.println("1. Testando idade menor que 21:");
        cliente1.setIdade(18);
        
        // Teste 2: Idade igual a 21 (deve aceitar)
        System.out.println("\n2. Testando idade igual a 21:");
        cliente1.setIdade(21);
        
        // Teste 3: Idade maior que 21 (deve aceitar)
        System.out.println("\n3. Testando idade maior que 21:");
        cliente1.setIdade(35);
        
        // Definindo outros atributos
        cliente1.setCodigo(1001);
        cliente1.setNome("João Silva"); // Será prefixado com "Sr."
        
        // Exibindo a ficha do cliente
        System.out.println("\n--- Ficha do Cliente Masculino ---");
        cliente1.ImprimirFicha();
        
        // Criando cliente feminino
        System.out.println("\n--- Criando Cliente Feminino ---");
        Cliente cliente2 = new Cliente(EnumSexo.Fem);
        
        // Testando validação de idade novamente
        System.out.println("Testando idade inválida para cliente feminino:");
        cliente2.setIdade(20); // Deve falhar
        
        // Definindo atributos válidos
        cliente2.setCodigo(1002);
        cliente2.setIdade(28); // Idade válida
        cliente2.setNome("Maria Santos"); // Será prefixado com "Sra."
        
        // Exibindo a ficha do cliente feminino
        System.out.println("\n--- Ficha do Cliente Feminino ---");
        cliente2.ImprimirFicha();
        
        // Demonstração do prefixo automático
        System.out.println("\n--- Demonstração do Prefixo Automático ---");
        Cliente cliente3 = new Cliente(EnumSexo.Masc);
        cliente3.setCodigo(1003);
        cliente3.setIdade(25);
        cliente3.setNome("Pedro Oliveira");
        System.out.println("Nome sem prefixo: Pedro Oliveira");
        System.out.println("Nome com prefixo automático: " + cliente3.getNome());
        
        Cliente cliente4 = new Cliente(EnumSexo.Fem);
        cliente4.setCodigo(1004);
        cliente4.setIdade(30);
        cliente4.setNome("Ana Costa");
        System.out.println("Nome sem prefixo: Ana Costa");
        System.out.println("Nome com prefixo automático: " + cliente4.getNome());
        
        // Demonstração de todos os valores do enumerador EnumSexo
        System.out.println("\n--- Valores do Enumerador EnumSexo ---");
        for (EnumSexo sexo : EnumSexo.values()) {
            System.out.println("Valor: " + sexo + " - Descrição: " + sexo.getDescricao());
        }
        
        // Teste com nome null ou vazio
        System.out.println("\n--- Teste com Nome Null/Vazio ---");
        Cliente cliente5 = new Cliente(EnumSexo.Masc);
        cliente5.setCodigo(1005);
        cliente5.setIdade(22);
        cliente5.setNome(null); // Nome null
        cliente5.ImprimirFicha();
        
        cliente5.setNome(""); // Nome vazio
        cliente5.ImprimirFicha();
    }
}
