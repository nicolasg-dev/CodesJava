package cliente;

import fila.*;
import pilha.*;

public class GI{
    Pilha pilha = new Pilha();
    Fila fila = new Fila();

    public void executar(){
        System.out.println("\n-----Pilha-----\n");
        System.out.println("\nEmpilhando 8...");
        pilha.empilha(8);
        System.out.println("\n");
        pilha.printpilha();        
        System.out.println("\nEmpilhando 5...");
        pilha.empilha(5);
        System.out.println("\n");
        pilha.printpilha();        
        System.out.println("\nDesempilhando..."); 
        pilha.desempilha();       
        System.out.println("\n");
        pilha.printpilha();

        System.out.println("\n-----Fila-----\n");
        System.out.println("\n8 entra na fila...");
        fila.addFila(8);
        System.out.println("\n");
        fila.printFila();        
        System.out.println("\n5 entra na fila...");
        fila.addFila(5);
        System.out.println("\n");
        fila.printFila();
        System.out.println("\n75 entra na fila...");
        fila.addFila(75);
        System.out.println("\n");
        fila.printFila();     
        System.out.println("\nSai o primeiro..."); 
        fila.saiFila();       
        System.out.println("\n");
        fila.printFila();
        System.out.println("\nSai o primeiro..."); 
        fila.saiFila();       
        System.out.println("\n");
        fila.printFila();       
    }

}