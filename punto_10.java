import java.util.ArrayList;

public class punto_10 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(5);

    numeros.add(5);
    numeros.add(3);
    numeros.add(9);
    numeros.add(1);
    numeros.add(4);

    
    for(int i=0; i<numeros.size(); i++){
        int indece = i+1;
        System.out.println("Numero " + indece +": "+  numeros.get(i) );
    }

    }
}
