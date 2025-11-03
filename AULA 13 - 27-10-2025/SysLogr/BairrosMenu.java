import java.util.Scanner;

public class BairrosMenu {
    public void exibir() {
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);

    do {
        System.out.println("");
        System.out.println("CADASTRO DE BAIRROS");
        System.out.println("31. Cadastrar");
        System.out.println("32. Remover");
        System.out.println("33. Alterar");
        System.out.println("34. Pesquisar");
        System.out.println("39. Sair");
        System.out.print("Digite a opção: ");
        opcao = teclado.nextInt();
        
        if (opcao == 31) {
        } else if (opcao == 32) {
        } else if (opcao == 33) {
        } else if (opcao == 34) {
        }

    } while (opcao != 39);
    teclado.close();
    }
    
}