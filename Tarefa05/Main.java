import java.util.Scanner;

import cliente.GUI;
import cliente.GI;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GUI gui = new GUI();
        GI gi = new GI();
        System.out.print("Digite 1 para entrar na interface com usuário e 0 para entrar na outra: ");
        int opcao = 2;
        do {
            opcao = scanner.nextInt();
            switch (opcao) {
                case 0 -> gi.executar();
                case 1 -> gui.executar();
            }
        } while (opcao != 1 && opcao != 0);
    }
}