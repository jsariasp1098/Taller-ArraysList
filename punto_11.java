import java.util.ArrayList;

public class punto_11 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(5);

    numeros.add(5);
    numeros.add(3);
    numeros.add(9);
    numeros.add(1);
    numeros.add(4);
        
        System.out.println("Arreglo Inicial:");
        
        int tamaño=numeros.size();

        for(int i=0; i<tamaño; i++){
            int j=i+1;
            System.out.println("Numero "+ j +": " +numeros.get(i));
            numeros.add(numeros.get(i));
        }

        System.out.println("Arreglo Duplicado:");

        for(int i=0; i<numeros.size(); i++){
            int k= i+1;
            System.out.println("Numero "+ k +": " +numeros.get(i));
        }
    }
    
}
