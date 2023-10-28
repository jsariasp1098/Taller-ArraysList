import java.util.ArrayList;

public class punto_12 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(5);

            numeros.add(5);
            numeros.add(3);
            numeros.add(9);
            numeros.add(1);
            numeros.add(4);

            int k = numeros.size();
            System.out.println("tamaño arreglo: "+k);
                for(int i=0;i<k;i++){
                    System.out.println(numeros.get(i));
                }

                numeros.clear();
        
        if(numeros.isEmpty()){
          System.out.println("Arreglo vacio");
        }
    }
}
