import java.util.ArrayList;
import java.util.List;

public class AnimalBanco {
    private List<Animal> animais;
    private int proximoCodigo;

    public AnimalBanco() {
        this.animais = new ArrayList<>();
        this.proximoCodigo = 1;
    }

    // Gerar código automático
    private int gerarCodigo() {
        return proximoCodigo++;
    }

    // Inserir animal
    public void inserir(Animal animal) {
        animal.setCodigo(gerarCodigo());
        animais.add(animal);
        System.out.println("✅ Animal cadastrado com sucesso! Código: " + animal.getCodigo());
    }

    // Pesquisar por código
    public Animal pesquisar(int codigo) {
        for (Animal animal : animais) {
            if (animal.getCodigo() == codigo) {
                return animal;
            }
        }
        return null;
    }

    // Excluir por código
    public boolean excluir(int codigo) {
        Animal animal = pesquisar(codigo);
        if (animal != null) {
            animais.remove(animal);
            System.out.println("✅ Animal removido com sucesso!");
            return true;
        }
        System.out.println("❌ Animal não encontrado!");
        return false;
    }

    // Relatório - imprimir todos
    public void relatorio() {
        if (animais.isEmpty()) {
            System.out.println("\n⚠️  Nenhum animal cadastrado!");
            return;
        }

        System.out.println("\n========================================");
        System.out.println("       RELATÓRIO DE ANIMAIS");
        System.out.println("========================================");
        System.out.println("Total de animais: " + animais.size());
        
        for (Animal animal : animais) {
            System.out.println(animal.toString());
            System.out.println("========================================");
        }
    }

    // Retornar quantidade de animais
    public int getTotalAnimais() {
        return animais.size();
    }
}
