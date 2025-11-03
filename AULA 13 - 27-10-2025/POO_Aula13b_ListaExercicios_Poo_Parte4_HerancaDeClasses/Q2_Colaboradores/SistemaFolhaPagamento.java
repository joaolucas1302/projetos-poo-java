import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class SistemaFolhaPagamento {
    private static Scanner scanner = new Scanner(System.in);
    private static ColaboradorBanco banco = new ColaboradorBanco();

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");

            try {
                switch (opcao) {
                    case 1:
                        cadastrarEngenheiro();
                        break;
                    case 2:
                        cadastrarDiretor();
                        break;
                    case 3:
                        cadastrarColaboradorGeral();
                        break;
                    case 4:
                        pesquisarPorCodigo();
                        break;
                    case 5:
                        pesquisarPorNome();
                        break;
                    case 6:
                        excluirColaborador();
                        break;
                    case 7:
                        banco.relatorio();
                        break;
                    case 0:
                        System.out.println("\n👋 Encerrando sistema...");
                        break;
                    default:
                        System.out.println("❌ Opção inválida!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("❌ Erro: " + e.getMessage());
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
        System.out.println("║   SISTEMA FOLHA DE PAGAMENTO - MENU    ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("║ 1 - Cadastrar Engenheiro               ║");
        System.out.println("║ 2 - Cadastrar Diretor                  ║");
        System.out.println("║ 3 - Cadastrar Colaborador Geral        ║");
        System.out.println("║ 4 - Pesquisar por Código               ║");
        System.out.println("║ 5 - Pesquisar por Nome                 ║");
        System.out.println("║ 6 - Excluir Colaborador                ║");
        System.out.println("║ 7 - Relatório Completo                 ║");
        System.out.println("║ 0 - Sair                               ║");
        System.out.println("╚════════════════════════════════════════╝");
    }

    private static void cadastrarEngenheiro() {
        System.out.println("\n=== CADASTRAR ENGENHEIRO ===");
        
        Engenheiro engenheiro = new Engenheiro();
        
        // Dados comuns
        preencherDadosComuns(engenheiro);
        
        // Dados específicos
        System.out.println("\n--- Dados do Engenheiro ---");
        System.out.println("Tipos: CIVIL, AMBIENTAL, PRODUCAO, OUTRO");
        String tipo = lerString("Tipo: ").toUpperCase();
        engenheiro.setTipo(EnumTipoEngenheiro.valueOf(tipo));
        
        System.out.println("Níveis: ESTAGIARIO, JUNIOR, PLENO, SENIOR");
        String nivel = lerString("Nível: ").toUpperCase();
        engenheiro.setNivel(EnumNivel.valueOf(nivel));
        
        banco.inserir(engenheiro);
    }

    private static void cadastrarDiretor() {
        System.out.println("\n=== CADASTRAR DIRETOR ===");
        
        Diretor diretor = new Diretor();
        
        // Dados comuns
        preencherDadosComuns(diretor);
        
        // Dados específicos
        System.out.println("\n--- Dados do Diretor ---");
        System.out.println("Áreas: ADMINISTRATIVO, COMERCIAL, MARKETING, FINANCEIRO, FATURAMENTO, OUTRO");
        String area = lerString("Área: ").toUpperCase();
        diretor.setArea(EnumAreaDiretor.valueOf(area));
        
        String dataPosse = lerString("Data da Posse (dd/MM/yyyy): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        diretor.setDataPosse(LocalDate.parse(dataPosse, formatter));
        
        banco.inserir(diretor);
    }

    private static void cadastrarColaboradorGeral() {
        System.out.println("\n=== CADASTRAR COLABORADOR GERAL ===");
        
        ColaboradorGeral colaborador = new ColaboradorGeral();
        
        // Dados comuns
        preencherDadosComuns(colaborador);
        
        // Dados específicos
        System.out.println("\n--- Dados do Colaborador ---");
        System.out.println("Cargos: LIMPEZA, SECRETARIA, CONTROLE_ACESSO, SEGURANCA, OUTRO");
        String cargo = lerString("Cargo: ").toUpperCase();
        colaborador.setCargo(EnumCargo.valueOf(cargo));
        
        System.out.println("Áreas: FISCAL, COMERCIAL, FINANCEIRA, VENDAS, OUTRA");
        String area = lerString("Área: ").toUpperCase();
        colaborador.setArea(EnumAreaGeral.valueOf(area));
        
        banco.inserir(colaborador);
    }

    private static void preencherDadosComuns(Colaborador colaborador) {
        colaborador.setNome(lerString("Nome (mais de 10 caracteres): "));
        colaborador.setCpf(lerString("CPF (11 dígitos): "));
        colaborador.setSalario(lerDouble("Salário: R$ "));
        
        System.out.println("✅ Código interno gerado: " + colaborador.getCodigoInterno());
        System.out.println("✅ Data de admissão: " + colaborador.getDataAdmissao());
    }

    private static void pesquisarPorCodigo() {
        System.out.println("\n=== PESQUISAR POR CÓDIGO ===");
        String codigo = lerString("Código do colaborador: ");
        
        Colaborador colaborador = banco.pesquisarPorCodigo(codigo);
        if (colaborador != null) {
            System.out.println(colaborador.toString());
        } else {
            System.out.println("❌ Colaborador não encontrado!");
        }
    }

    private static void pesquisarPorNome() {
        System.out.println("\n=== PESQUISAR POR NOME ===");
        String nome = lerString("Digite parte do nome: ");
        
        List<Colaborador> resultado = banco.pesquisarPorNome(nome);
        
        if (resultado.isEmpty()) {
            System.out.println("❌ Nenhum colaborador encontrado!");
        } else {
            System.out.println("\n✅ " + resultado.size() + " colaborador(es) encontrado(s):");
            for (Colaborador colaborador : resultado) {
                System.out.println(colaborador.toString());
                System.out.println("----------------------------------------");
            }
        }
    }

    private static void excluirColaborador() {
        System.out.println("\n=== EXCLUIR COLABORADOR ===");
        String codigo = lerString("Código do colaborador: ");
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
