import java.util.Scanner;

public class CidadesMenu {

    public void exibir() {
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);

    do {
        System.out.println("");
        System.out.println("CADASTRO DE CIDADES");
        System.out.println("21. Cadastrar");
        System.out.println("22. Remover");
        System.out.println("23. Alterar");
        System.out.println("24. Pesquisar");
        System.out.println("29. Sair");
        System.out.print("Digite a opção: ");
        opcao = teclado.nextInt();
        
        if (opcao == 21) {
        } else if (opcao == 22) {
        } else if (opcao == 23) {
        } else if (opcao == 24) {
        }

    } while (opcao != 29);
    teclado.close();
    }
    

}