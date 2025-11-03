import java.util.List;
import java.util.ArrayList;

public class EstadosBanco {
    //atributos
    private List<Estado> list;
    private int cont;   

    //construtor
    public EstadosBanco() {
        this.list = new ArrayList<Estado>();
        this.cont = 0;
    }

    public void add(Estado estado) {
        list.add(estado);
        cont++;
    }

    public void remove(int codigo) { }

    public Estado get(int codigo) {return null;}

    public void update(Estado estado) { };

    public int getCont() {return cont;}

    private boolean exist(int codigo) {return false;}

}
