import java.util.ArrayList;
import java.util.List;

public class punto_8 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList <>();

       if(!lista.isEmpty()){
            System.out.println("La lista no esta vacia");
       } else {
            System.out.println("La lista esta vacia");
       }
        lista.add("juan");
        lista.add("Andres");
        lista.add("sebastian");
        if(!lista.isEmpty()){
                System.out.println("La lista no esta vacia");
                for(int i=0; i<lista.size(); i++){
                    System.out.println(lista.get(i));
                }
        } else {
                System.out.println("La lista esta vacia");
        }
    }   
}
