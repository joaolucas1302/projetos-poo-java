
import java.util.Scanner;

public class SysCar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Carro carro = new Carro();
        carro.setCodigo(100);
        carro.setMarca("Hyundai");
        carro.setModelo("Hb20");
        carro.setAno(2025);
        carro.setHibrido(false);
        carro.setCombustivel(EnumCombustivel.gasolina);

        System.out.println("Dados do carro:");
        System.out.println(carro.toString());

    }
    
}
