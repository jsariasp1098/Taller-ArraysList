import java.util.ArrayList;
import java.util.List;

public class punto_9 {
    public static void main(String[] args) {
            int verificar=0;
        List<String> nombres = new ArrayList<>();
            
        nombres.add("Juan");
        nombres.add("Andres");
        nombres.add("Emiliana");
        nombres.add("Carlos");


        for(int i =0; i<nombres.size(); i++){

            if(nombres.get(i)=="Carlos"){
                verificar=1;
            }
        }

        if(verificar == 1) {
            System.out.println("En el Arreglo si esta el nombre Carlos");
        }else{
            System.out.println("En el arreglo  no esta el nomrbre Carlos");
        }
    }  
}
