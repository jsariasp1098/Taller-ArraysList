import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class punto_15 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
            
        nombres.add("Juan");
        nombres.add("Andres");
        nombres.add("Emiliana");
        nombres.add("Carlos");

        Collections.sort(nombres);

        for (String ordenado : nombres) {

            System.out.println(ordenado);
            
        }
    }
}
