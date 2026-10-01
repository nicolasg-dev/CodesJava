package pilha;
import java.util.ArrayList;

public class Pilha {
    private ArrayList<Integer> pilha = new ArrayList<>();
    private int topo = 0;

    public int empilha(Integer num){
        pilha.add(0, num);
        topo = pilha.get(0);
        return 0;
    }

    public int desempilha(){
        if (pilha.size() > 0){
            pilha.remove(0);
            if (pilha.size() > 0) topo = pilha.get(0);
            return 0;
        } 
        else{
            return -1;
        }
    }
    
    public void printpilha(){

        for (int i = 0; i < this.pilha.size(); i++){
            System.out.printf("%d -> ", this.pilha.get(i));
        }
        System.out.println("\n");
        System.out.printf("\nO topo eh:%d\n", topo);
    }
    
}
