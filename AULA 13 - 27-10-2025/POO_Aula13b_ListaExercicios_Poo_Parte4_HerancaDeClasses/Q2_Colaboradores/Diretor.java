import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Diretor extends Colaborador {
    private EnumAreaDiretor area;
    private LocalDate dataPosse;

    // Getters e Setters
    public void setArea(EnumAreaDiretor area) { 
        this.area = area; 
    }
    public EnumAreaDiretor getArea() { 
        return this.area; 
    }

    public void setDataPosse(LocalDate dataPosse) { 
        this.dataPosse = dataPosse; 
    }
    public LocalDate getDataPosse() { 
        return this.dataPosse; 
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return super.toString() +
               "\n--- DIRETOR ---" +
               "\nÁrea: " + area +
               "\nData Posse: " + (dataPosse != null ? dataPosse.format(formatter) : "N/A");
    }
}
