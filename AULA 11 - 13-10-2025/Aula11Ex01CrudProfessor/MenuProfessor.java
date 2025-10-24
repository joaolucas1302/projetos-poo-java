import java.util.Scanner;

public class MenuProfessor {
    
    public void exibir() {
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);
        ProfessorBanco bancoDados = new ProfessorBanco();

        do {
            System.out.println("");
            System.out.println("PROFESSORES");
            System.out.println("1. Adicionar");
            System.out.println("2. Alterar");
            System.out.println("3. Remover");
            System.out.println("4. Pesquisar");
            System.out.println("5. Imprimir todos");
            System.out.println("Digite a opçao: ");
            opcao = teclado.nextInt();

            if(opcao == 1) {
                Professor objProfessor = new Professor();
               
                objProfessor.setCodigo(teclado.nextInt());
                objProfessor.setNome(teclado.next());
                objProfessor.setSalario(teclado.nextDouble());
                int genero = teclado.nextInt();
                if (genero == 1) {
                    objProfessor.setGenero(EnumGenero.Feminio);
                } else {
                    objProfessor.setGenero(EnumGenero.Masculino);
                }

                bancoDados.adicionar(objProfessor);

            } else if (opcao == 2) {
            } else if (opcao == 3) {
            } else if (opcao == 4) {
                Professor item = null;
                int codigo = 0;

                codigo = teclado.nextInt();
                item = bancoDados.obterProfessor(codigo);  
                
                if (item != null) {
                    item.imprimir();
                } else {
                    System.out.println("Professor não localizado!");
                }

            } else if (opcao == 5) {
                bancoDados.imprimirTodosProfessores();
            }

        } while (opcao != 9);
    }    
}
