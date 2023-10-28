import java.util.ArrayList;
import java.util.List;

public class punto_7 {
    public static void main(String[] args) {
    
         List<String> nombres = new ArrayList<>();
            
        nombres.add("Juan");
        nombres.add("Andres");
        nombres.add("Emiliana");

        for(int i =0; i<nombres.size(); i++){
            System.out.println(nombres.get(i));
        }

        nombres.remove(0);

        for(int i =0; i<nombres.size(); i++){
            System.out.println(nombres.get(i));
        }

    }
}
