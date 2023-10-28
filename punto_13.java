import java.util.ArrayList;
import java.util.List;

public class punto_13 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
            
        nombres.add("Juan");
        nombres.add("Andres");
        nombres.add("Emiliana");
        nombres.add("Carlos");

        for(int i=0; i<nombres.size(); i++){
            System.out.println(nombres.get(i));
        }
        
        nombres.add(1,"Pedro");

        for(int i=0; i<nombres.size(); i++){
            System.out.println(nombres.get(i));
        }
        
    }
}
