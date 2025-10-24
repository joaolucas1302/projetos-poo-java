/**
 * Classe Carros com validações específicas
 * Implementa validações para placa, capacidade do tanque e número de portas
 * 
 * @author Professor Marçal
 * @version 2025
 */
public class Carros {
    // Atributos da classe Carros
    private String Placa;                   // Placa do veículo
    private double CapacidadeTanque;        // Capacidade do tanque em litros
    private String Marca;                   // Marca do veículo
    private String Modelo;                  // Modelo do veículo
    private int NumeroPortas;               // Número de portas

    /**
     * Construtor padrão da classe Carros
     */
    public Carros() {
        this.Placa = "";
        this.CapacidadeTanque = 0.0;
        this.Marca = "";
        this.Modelo = "";
        this.NumeroPortas = 0;
    }

    /**
     * Construtor parametrizado da classe Carros
     * 
     * @param placa Placa do veículo
     * @param capacidadeTanque Capacidade do tanque
     * @param marca Marca do veículo
     * @param modelo Modelo do veículo
     * @param numeroPortas Número de portas
     */
    public Carros(String placa, double capacidadeTanque, String marca, 
                  String modelo, int numeroPortas) {
        this.Placa = placa;
        this.CapacidadeTanque = capacidadeTanque;
        this.Marca = marca;
        this.Modelo = modelo;
        this.NumeroPortas = numeroPortas;
    }

    // Métodos getters e setters com validações

    /**
     * Método getter para a Placa
     * @return Placa do veículo
     */
    public String getPlaca() {
        return Placa;
    }

    /**
     * Método setter para a Placa com validação
     * Informa o usuário se a placa contém menos de 7 caracteres
     * @param placa Placa do veículo
     */
    public void setPlaca(String placa) {
        if (placa == null || placa.trim().isEmpty()) {
            this.Placa = "";
            return;
        }
        
        String placaLimpa = placa.trim();
        if (placaLimpa.length() < 7) {
            System.out.println("AVISO: A placa contém menos de 7 caracteres!");
            System.out.println("Placa informada: '" + placaLimpa + "' (" + placaLimpa.length() + " caracteres)");
            System.out.println("A placa deve ter pelo menos 7 caracteres.");
        }
        
        this.Placa = placaLimpa;
    }

    /**
     * Método getter para a CapacidadeTanque
     * @return Capacidade do tanque
     */
    public double getCapacidadeTanque() {
        return CapacidadeTanque;
    }

    /**
     * Método setter para a CapacidadeTanque com validação
     * Avisa o usuário se a capacidade for inferior a 35 litros
     * @param capacidadeTanque Capacidade do tanque
     */
    public void setCapacidadeTanque(double capacidadeTanque) {
        if (capacidadeTanque < 35) {
            System.out.println("AVISO: A capacidade do tanque é inferior a 35 litros!");
            System.out.println("Capacidade informada: " + capacidadeTanque + " litros");
            System.out.println("Recomenda-se uma capacidade de pelo menos 35 litros.");
        }
        
        this.CapacidadeTanque = capacidadeTanque;
    }

    /**
     * Método getter para a Marca
     * @return Marca do veículo
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * Método setter para a Marca
     * @param marca Marca do veículo
     */
    public void setMarca(String marca) {
        this.Marca = marca;
    }

    /**
     * Método getter para o Modelo
     * @return Modelo do veículo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * Método setter para o Modelo
     * @param modelo Modelo do veículo
     */
    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    /**
     * Método getter para o NumeroPortas
     * @return Número de portas
     */
    public int getNumeroPortas() {
        return NumeroPortas;
    }

    /**
     * Método setter para o NumeroPortas com validação
     * Informa o usuário se o número de portas for inferior a 2
     * @param numeroPortas Número de portas
     */
    public void setNumeroPortas(int numeroPortas) {
        if (numeroPortas < 2) {
            System.out.println("AVISO: O número de portas é inferior a 2!");
            System.out.println("Número de portas informado: " + numeroPortas);
            System.out.println("Um veículo deve ter pelo menos 2 portas.");
        }
        
        this.NumeroPortas = numeroPortas;
    }

    /**
     * Método para imprimir a ficha completa do veículo
     * Exibe todos os valores de cada propriedade do objeto Carros
     */
    public void ImprimirFicha() {
        System.out.println("=== FICHA DO VEÍCULO ===");
        System.out.println("Placa: " + Placa);
        System.out.printf("Capacidade do Tanque: %.1f litros%n", CapacidadeTanque);
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Número de Portas: " + NumeroPortas);
        System.out.println("========================");
    }
}
