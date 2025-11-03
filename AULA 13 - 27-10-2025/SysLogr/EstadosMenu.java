import java.util.Scanner;

public class EstadosMenu {

    //modo constrututor
    public EstadosMenu() {
        this.exibir();
    }
    
    private void exibir() {
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);

    do {
        System.out.println("");
        System.out.println("CADASTRO DE ESTADOS");
        System.out.println("11. Cadastrar");
        System.out.println("12. Remover");
        System.out.println("13. Alterar");
        System.out.println("14. Pesquisar");
        System.out.println("19. Sair");
        System.out.print("Digite a opção: ");
        opcao = teclado.nextInt();

        if (opcao == 11) {
        } else if (opcao == 12) {
        } else if (opcao == 13) {
        } else if (opcao == 14) {
        } 

    } while (opcao != 19);
    teclado.close();
    }
    
}