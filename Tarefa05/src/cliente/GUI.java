package cliente;

import java.util.Scanner;
import pilha.*;

public class GUI{
    Pilha pilha = new Pilha();
    Scanner scanner = new Scanner(System.in);
    public void executar() {
        int opcao;
        do {
            System.out.println("\nA sua pilha está assim:\n");
            pilha.printpilha();
            System.out.println("\nO que deseja fazer:");
            System.out.println("1. Empilha número");
            System.out.println("2. Desempilhar");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            opcao = //Integer.parseInt(scanner.nextLine());
                    scanner.nextInt();

            switch (opcao) {
                case 1 -> empilharMenu();
                case 2 -> pilha.desempilha();
                case 3 -> System.out.println("\nSaindo. ");
                default -> System.out.println("\nOpção inválida. ");

            }
        } while (opcao != 3);



    }
    private void empilharMenu(){
        System.out.print("\nQual número deseja empilhar: ");
        int num = scanner.nextInt();
        pilha.empilha(num);
    }

}


