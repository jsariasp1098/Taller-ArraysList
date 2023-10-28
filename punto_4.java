import java.util.ArrayList;

public class punto_4 {

    public static void main(String[] args) {
        ArrayList<Integer> par = new ArrayList<>(5);

        par.add(1);
        par.add(2);
        par.add(3);
        par.add(4);
        par.add(5);
        
        for(int i=0; i<par.size(); i++){
            if(par.get(i) % 2 == 0){
                par.remove(i);
            }
        }
        for(int i=0; i<par.size(); i++){
            System.out.println(par.get(i));
        }
    }
}
