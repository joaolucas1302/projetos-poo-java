import java.util.ArrayList;
import java.util.List;

public class ProfessorBanco {
    //atributos
    private List<Professor> banco = new ArrayList<Professor>();

    //propriedades (metodos)
    public void adicionar(Professor professor) {
        Professor localizar = obterProfessor(professor.getCodigo());

        if (localizar != null) {
            System.out.println("Já existe professor cadastrado com esse código!");    
        } else {
            banco.add(professor);
            System.out.println("Processor adicionado!");
        }
    }

    public void remover(int codigo) {
        Professor localizado = null;

        for (Professor professor : banco) {
            if (professor.getCodigo() == codigo) {
                localizado = professor;
                break;
            }
        }

        if (localizado == null) {
           
        } else {
            banco.remove(localizado);
            System.out.println("Professor removido!");
        }
    }

    public void remover(Professor professor) {
        boolean localizado = false;

        for (Professor item : banco) {
            if (item == professor) {
                localizado = true;
                banco.remove(professor);
                break;
            }    
        }

        if (localizado == false) {
            System.out.println("Professor não localizado!");
        } else {
            System.out.println("Professor removido!");
        }
    }

    public Professor obterProfessor(int codigo) {
        Professor localizado = null;

        for (Professor item : banco) {
            if (item.getCodigo() == codigo) {
                localizado = item;
                break;
            }
        }

        if (localizado == null) {
            return null;
        } else {
            return localizado;
        }
    }

    public int obterNumeroProfessores() {
        int cont = 0;

        for (Professor item : banco) {
            if (item != null) {
                cont = cont + 1;
            }
        }

        return cont;
    }

    public void imprimirTodosProfessores() {
        for (Professor item : banco) {
            item.imprimir();
        }
    }
}
