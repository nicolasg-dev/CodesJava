//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Endereço do cliente: ");
        String ender = scanner.nextLine();
        System.out.print("Especial (true/false): ");
        boolean especial = scanner.nextBoolean();
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();
        System.out.println("Cliente criado com sucesso.");
        Cliente cliente1 = new Cliente(nome, ender, especial, saldo);
        
        scanner.nextLine();

        System.out.print("Nome do cliente: ");
        nome = scanner.nextLine();
        System.out.print("Endereço do cliente: ");
        ender = scanner.nextLine();
        System.out.print("Especial (true/false): ");
        especial = scanner.nextBoolean();
        System.out.print("Saldo: ");
        saldo = scanner.nextDouble();
        System.out.println("Cliente criado com sucesso.");
        Cliente cliente2 = new Cliente(nome, ender, especial, saldo);

        cliente1.print();
        cliente2.print();

        double quanto;

        System.out.println("- Depósito -");
        System.out.print("Quanto vai depositar (conta 1): ");
        quanto = (scanner.nextDouble());
        
        cliente1.conta.depositarValor(quanto);
        cliente1.print();
        cliente2.print();

        System.out.println("- Retirada -");
        System.out.print("Quanto vai retirar (conta 2): ");
        quanto = (scanner.nextDouble());
        
        cliente2.conta.retirarValor(quanto);
        cliente1.print();
        cliente2.print();

        System.out.println("- Transferir valor entre contas -");
        System.out.print("Quanto deseja transferir: ");
        quanto = (scanner.nextDouble());
        
        cliente1.conta.transferirValor(quanto, cliente2.conta);

        cliente1.print(); 
        cliente2.print();

        scanner.close();
    }
}