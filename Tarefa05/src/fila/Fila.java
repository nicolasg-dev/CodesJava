package fila;
import java.util.ArrayList;

public class Fila {
    private ArrayList<Integer> fila = new ArrayList<>();
    private int inicio = 0, fim = 0;

    public int addFila(Integer num){
        fila.add(num);
        inicio = fila.get(0);
        fim = fila.get(fila.size()-1);
        return 0;
    }

    public int saiFila(){
        if (fila.size() > 0){
            fila.remove(0);
            inicio = fila.get(0);
            fim = fila.get(fila.size()-1);
            return 0;
        } 
        else{
            return -1;
        }
    }
    
    public void printFila(){

        for (int i = 0; i < this.fila.size(); i++){
            System.out.printf("%d -> ", this.fila.get(i));
        }
        System.out.println("\n");
        System.out.printf("O inicio eh:%d\nO fim eh:%d\n", inicio, fim);
    }
    
}
