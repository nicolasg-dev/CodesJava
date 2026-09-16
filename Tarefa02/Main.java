//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        System.out.println("Cadastro da primeira conta: ");

        System.out.print("Nome: ");
        conta1.setNome(teclado.nextLine());

        System.out.print("Saldo: ");
        conta1.setSaldo(teclado.nextDouble());

        System.out.print("Especial: (true, false): ");
        conta1.setEspecial(teclado.nextBoolean());
        teclado.nextLine();

        System.out.println("Cadastro da segunda conta: ");

        System.out.print("Nome: ");
        conta2.setNome(teclado.nextLine());

        System.out.print("Saldo: ");
        conta2.setSaldo(teclado.nextDouble());

        System.out.print("Especial: (true, false): ");
        conta2.setEspecial(teclado.nextBoolean());
        teclado.nextLine();

        double quanto;

        System.out.println("- Depósito -");
        System.out.print("Quanto vai depositar (conta 1): ");
        quanto = (teclado.nextDouble());
        
        conta1.depositarValor(quanto);
        conta1.print();
        conta2.print();

        System.out.println("- Retirada -");
        System.out.print("Quanto vai retirar (conta 2): ");
        quanto = (teclado.nextDouble());
        
        conta2.retirarValor(quanto);
        conta1.print();
        conta2.print();

        System.out.println("- Transferir valor entre contas -");
        System.out.print("Quanto deseja transferir: ");
        quanto = (teclado.nextDouble());
        
        conta1.transferirValor(quanto, conta2);

        conta1.print(); 
        conta2.print();

        teclado.close();
    }
}