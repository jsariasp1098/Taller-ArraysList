import java.util.ArrayList;
import java.util.List;

public class punto_19 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
            
        nombres.add("Juan");
        nombres.add("Andres");
        nombres.add("Emiliana");
        nombres.add("Carlos");

        for(int i=0; i<nombres.size(); i++){
            nombres.set(i, "Hola");
        }

        for (String Hola : nombres) {
            System.out.println(Hola);
        }
    }
}
