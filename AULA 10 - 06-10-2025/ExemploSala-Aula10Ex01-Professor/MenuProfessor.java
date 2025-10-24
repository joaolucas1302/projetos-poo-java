import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MenuProfessor {

    public void exibirMenu() {
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);
        List<Professor> listaProfessores = new ArrayList<Professor>();

        do {
            System.out.println("");
            System.out.println(":: MENU PROFESSORES ::..");
            System.out.println(":: 1. Adicionar (C)");
            System.out.println(":: 2. Pesquisar - Codigo (R)");
            System.out.println(":: 3. Atualizar (U)");
            System.out.println(":: 4. Remover (D)");
            System.out.println(":: 5. Imprimir");
            System.out.println(":: 9. Sair");
            System.out.print("Digite a opcao: ");
            opcao = teclado.nextInt();

            if (opcao == 1) {
                Professor prof = new Professor();
                prof.setCodigo(teclado.nextInt());
                prof.setNome(teclado.next());
                prof.setNumeroAulas(teclado.nextInt());
                //prof.setSalario(teclado.nextDouble());

                listaProfessores.add(prof);
                System.out.println("Professor adicionado!");

            } else if (opcao == 2) {
                Professor localizado = null;
                int codigo;
                                
                codigo = teclado.nextInt();

                for (Professor item : listaProfessores) {
                    if (item.getCodigo() == codigo) {
                        localizado = item;
                        break;
                    }    
                }

                if (localizado == null) {
                    System.out.println("Não localizado!");
                } else {
                    System.out.println("Localizado: " 
                    + localizado.getCodigo() + " - "  
                    + localizado.getNome() + " - " 
                    + localizado.getSalario());
                }

            } else if (opcao == 3) {
                int codigo = teclado.nextInt();

                for (Professor item : listaProfessores) {
                    if (item.getCodigo() == codigo) {
                        System.out.println("Digite o novo código, nome e salário!");
                        item.setCodigo(teclado.nextInt());
                        item.setNome(teclado.next());
                        item.setNumeroAulas(teclado.nextInt());
                        //item.setSalario(teclado.nextDouble());
                        break;
                    }
                }

            } else if (opcao == 4) {
                Professor localizado = null;
                int codigo;
                                
                codigo = teclado.nextInt();

                for (Professor item : listaProfessores) {
                    if (item.getCodigo() == codigo) {
                        localizado = item;
                        break;
                    }    
                }

                if (localizado == null) {
                    System.out.println("Não localizado!");
                } else {
                    listaProfessores.remove(localizado);
                    System.out.println("Professor removido!");
                }

            } else if (opcao == 5) {
                for (Professor item : listaProfessores) {
                    System.out.println(
                        item.getCodigo() + " - " + 
                        item.getNome() + " - " + 
                        item.getSalario());
                }
            }
        } while (opcao != 9);
    }
}
