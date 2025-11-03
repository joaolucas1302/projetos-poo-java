import java.util.Scanner;

public class SysLogrMenu {  
    public void exibir() {  
        int opcao = 0;  
        Scanner teclado = new Scanner(System.in);  

    do {
        System.out.println("");
        System.out.println("SYSLOGR SYSTEM");
        System.out.println("1. Estados");
        System.out.println("2. Cidades");  
        System.out.println("3. Bairros");
        System.out.println("9. Sair");
        System.out.print("Digite a opção: ");
        opcao = teclado.nextInt();

        if (opcao == 1) {
            EstadosMenu menuEstados = new EstadosMenu();

        } else if (opcao == 2) {
            CidadesMenu menuCidades = new CidadesMenu();
            menuCidades.exibir();

        } else if (opcao == 3) {
            BairrosMenu menuBairros = new BairrosMenu();
            menuBairros.exibir();

        }
    } while (opcao != 9);

    teclado.close();
    }

}