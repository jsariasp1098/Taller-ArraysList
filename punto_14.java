import java.util.ArrayList;
import java.util.List;

public class punto_14 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
            
        nombres.add("Juan");
        nombres.add("Andres");
        nombres.add("Emiliana");
        nombres.add("Carlos");

        String[] nombresArray = new String[nombres.size()];

        nombres.toArray(nombresArray);

        for (String nombre : nombresArray) {
            System.out.println(nombre);
        }
    }
}
