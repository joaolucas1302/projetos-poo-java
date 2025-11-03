import java.util.Scanner;
import java.time.LocalDate;

public class SistemaVeterinario {
    private static Scanner scanner = new Scanner(System.in);
    private static AnimalBanco banco = new AnimalBanco();

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    cadastrarMamifero();
                    break;
                case 2:
                    cadastrarReptil();
                    break;
                case 3:
                    pesquisarAnimal();
                    break;
                case 4:
                    excluirAnimal();
                    break;
                case 5:
                    banco.relatorio();
                    break;
                case 0:
                    System.out.println("\n👋 Encerrando sistema...");
                    break;
                default:
                    System.out.println("❌ Opção inválida!");
            }

            if (opcao != 0) {
                System.out.println("\nPressione ENTER para continuar...");
                scanner.nextLine();
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║     SISTEMA VETERINÁRIO - MENU         ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("║ 1 - Cadastrar Mamífero                 ║");
        System.out.println("║ 2 - Cadastrar Réptil                   ║");
        System.out.println("║ 3 - Pesquisar Animal (Código)          ║");
        System.out.println("║ 4 - Excluir Animal (Código)            ║");
        System.out.println("║ 5 - Relatório (Todos os Animais)       ║");
        System.out.println("║ 0 - Sair                               ║");
        System.out.println("╚════════════════════════════════════════╝");
    }

    private static void cadastrarMamifero() {
        System.out.println("\n=== CADASTRAR MAMÍFERO ===");
        
        Mamifero mamifero = new Mamifero();
        
        // Dados comuns
        preencherDadosComuns(mamifero);
        
        // Dados específicos do mamífero
        System.out.println("\n--- Dados do Mamífero ---");
        System.out.println("Tipos: GATO, CACHORRO, PORCO, COELHO, OUTRO");
        String tipo = lerString("Tipo: ").toUpperCase();
        mamifero.setTipo(EnumTipoMamifero.valueOf(tipo));
        
        mamifero.setCor(lerString("Cor: "));
        
        System.out.println("Alimentação: CARNIVORO, HERBIVORO");
        String alimentacao = lerString("Alimentação: ").toUpperCase();
        mamifero.setAlimentacao(EnumAlimentacao.valueOf(alimentacao));
        
        banco.inserir(mamifero);
    }

    private static void cadastrarReptil() {
        System.out.println("\n=== CADASTRAR RÉPTIL ===");
        
        Reptil reptil = new Reptil();
        
        // Dados comuns
        preencherDadosComuns(reptil);
        
        // Dados específicos do réptil
        System.out.println("\n--- Dados do Réptil ---");
        System.out.println("Classificações: ESCAMADOS, CROCODILIANOS, LACERTILIOS");
        String classificacao = lerString("Classificação: ").toUpperCase();
        reptil.setClassificacao(EnumClassificacaoReptil.valueOf(classificacao));
        
        System.out.println("Tipo Reprodução: OVIPARA, FECUNDACAO");
        String reproducao = lerString("Tipo Reprodução: ").toUpperCase();
        reptil.setTipoReproducao(EnumTipoReproducao.valueOf(reproducao));
        
        System.out.println("Habitat: AQUATICO, TERREO");
        String habitat = lerString("Habitat: ").toUpperCase();
        reptil.setHabitat(EnumHabitat.valueOf(habitat));
        
        banco.inserir(reptil);
    }

    private static void preencherDadosComuns(Animal animal) {
        animal.setNome(lerString("Nome do animal: "));
        animal.setPeso(lerDouble("Peso (kg): "));
        animal.setIdade(lerInteiro("Idade (anos): "));
        animal.setSexo(lerString("Sexo (M/F): ").charAt(0));
        animal.setMotivoAtendimento(lerString("Motivo do atendimento: "));
        
        System.out.println("\n--- Dados do Responsável ---");
        animal.setNomeResponsavel(lerString("Nome: "));
        animal.setCpfResponsavel(lerString("CPF: "));
        animal.setTelefoneResponsavel(lerString("Telefone: "));
    }

    private static void pesquisarAnimal() {
        System.out.println("\n=== PESQUISAR ANIMAL ===");
        int codigo = lerInteiro("Código do animal: ");
        
        Animal animal = banco.pesquisar(codigo);
        if (animal != null) {
            System.out.println(animal.toString());
        } else {
            System.out.println("❌ Animal não encontrado!");
        }
    }

    private static void excluirAnimal() {
        System.out.println("\n=== EXCLUIR ANIMAL ===");
        int codigo = lerInteiro("Código do animal: ");
        banco.excluir(codigo);
    }

    // Métodos auxiliares para leitura
    private static String lerString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    private static int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("❌ Digite um número válido: ");
        }
        int valor = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer
        return valor;
    }

    private static double lerDouble(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print("❌ Digite um número válido: ");
        }
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Limpar buffer
        return valor;
    }
}
