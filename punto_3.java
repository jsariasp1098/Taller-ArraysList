import java.util.ArrayList;


public class punto_3 {

   public static void main(String[] args) {
    ArrayList<Integer> mayor = new ArrayList<>(5);

    mayor.add(5);
    mayor.add(3);
    mayor.add(9);
    mayor.add(1);
    mayor.add(4);

    int j = mayor.get(0);

    for(int i=0; i<mayor.size(); i++){
        if(j<mayor.get(i)){
            j = mayor.get(i);
        }    
    }
    System.out.println("Numero Mayor es: "+ j);
   }

}
