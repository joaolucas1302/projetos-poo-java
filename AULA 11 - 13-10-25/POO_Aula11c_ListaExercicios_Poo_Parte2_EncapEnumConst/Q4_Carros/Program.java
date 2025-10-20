/**
 * Classe principal do programa Q4 - Carros com Validações
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
        // Demonstração do uso da classe Carros com validações
        
        System.out.println("=== DEMONSTRAÇÃO DA CLASSE CARROS ===\n");
        
        // Criando um carro usando o construtor padrão
        Carros carro1 = new Carros();
        
        // Testando validações de consistência
        System.out.println("--- Testando Validações de Consistência ---");
        
        // Teste 1: Placa com menos de 7 caracteres (deve avisar)
        System.out.println("1. Testando placa com menos de 7 caracteres:");
        carro1.setPlaca("ABC123"); // 6 caracteres
        
        // Teste 2: Placa com 7 ou mais caracteres (deve aceitar)
        System.out.println("\n2. Testando placa com 7 caracteres:");
        carro1.setPlaca("ABC1234"); // 7 caracteres
        
        // Teste 3: Capacidade do tanque inferior a 35 litros (deve avisar)
        System.out.println("\n3. Testando capacidade do tanque inferior a 35 litros:");
        carro1.setCapacidadeTanque(30.0);
        
        // Teste 4: Capacidade do tanque igual ou superior a 35 litros (deve aceitar)
        System.out.println("\n4. Testando capacidade do tanque igual a 35 litros:");
        carro1.setCapacidadeTanque(35.0);
        
        // Teste 5: Número de portas inferior a 2 (deve avisar)
        System.out.println("\n5. Testando número de portas inferior a 2:");
        carro1.setNumeroPortas(1);
        
        // Teste 6: Número de portas igual ou superior a 2 (deve aceitar)
        System.out.println("\n6. Testando número de portas igual a 2:");
        carro1.setNumeroPortas(2);
        
        // Definindo outros atributos
        carro1.setMarca("Toyota");
        carro1.setModelo("Corolla");
        
        // Exibindo a ficha do carro
        System.out.println("\n--- Ficha do Carro 1 ---");
        carro1.ImprimirFicha();
        
        // Criando outro carro usando o construtor parametrizado
        System.out.println("\n--- Criando Carro 2 ---");
        Carros carro2 = new Carros(
            "XYZ9876",      // Placa válida (7 caracteres)
            45.0,           // Capacidade válida (>= 35 litros)
            "Honda",        // Marca
            "Civic",        // Modelo
            4               // Número de portas válido (>= 2)
        );
        
        System.out.println("Ficha do Carro 2 (criado com construtor parametrizado):");
        carro2.ImprimirFicha();
        
        // Testando casos extremos
        System.out.println("\n--- Testando Casos Extremos ---");
        
        // Carro com placa muito curta
        Carros carro3 = new Carros();
        carro3.setPlaca("AB"); // Apenas 2 caracteres
        carro3.setCapacidadeTanque(20.0); // Capacidade muito baixa
        carro3.setMarca("Fiat");
        carro3.setModelo("Uno");
        carro3.setNumeroPortas(0); // Nenhuma porta
        
        System.out.println("Ficha do Carro 3 (com validações ativadas):");
        carro3.ImprimirFicha();
        
        // Carro com valores válidos
        Carros carro4 = new Carros();
        carro4.setPlaca("DEF4567"); // Placa válida
        carro4.setCapacidadeTanque(50.0); // Capacidade válida
        carro4.setMarca("Volkswagen");
        carro4.setModelo("Golf");
        carro4.setNumeroPortas(5); // Número válido de portas
        
        System.out.println("\nFicha do Carro 4 (todos os valores válidos):");
        carro4.ImprimirFicha();
        
        // Testando placa null e vazia
        System.out.println("\n--- Testando Placa Null e Vazia ---");
        Carros carro5 = new Carros();
        carro5.setPlaca(null); // Placa null
        carro5.setCapacidadeTanque(40.0);
        carro5.setMarca("Ford");
        carro5.setModelo("Focus");
        carro5.setNumeroPortas(4);
        
        System.out.println("Ficha do Carro 5 (placa null):");
        carro5.ImprimirFicha();
        
        carro5.setPlaca(""); // Placa vazia
        System.out.println("\nFicha do Carro 5 (placa vazia):");
        carro5.ImprimirFicha();
    }
}
