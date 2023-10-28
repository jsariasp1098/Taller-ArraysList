import java.util.ArrayList;
import java.util.List;

public class punto_6 {


    public static void main(String[] args) {
        
        List<String> nombres = new ArrayList<>();
            
        nombres.add("Juan");
        nombres.add("Andres");
        nombres.add("Emiliana");

        for(int i =0; i<nombres.size(); i++){
            System.out.println(nombres.get(i));
        }

        nombres.set(1, "Ana");
        System.out.println("Arreglo modificado");
        for(int i =0; i<nombres.size(); i++){
            
            System.out.println(nombres.get(i));
        }


    }
}
