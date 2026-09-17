//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        cliente1.setNome("Lulu");
        cliente1.setEnder("Rua rosa dos ventos - 321");
        cliente1.setEspecial(false);
        cliente1.conta.setSaldo(2000);

        cliente2.setNome("Chiquinho");
        cliente2.setEnder("Avenida das cigarras - 123");
        cliente2.setEspecial(true);
        cliente2.conta.setSaldo(5000);

        cliente1.print();
        cliente2.print();

        double quanto;

        System.out.println("- Depósito -");
        System.out.print("Quanto vai depositar (conta 1): ");
        quanto = (teclado.nextDouble());
        
        cliente1.conta.depositarValor(quanto);
        cliente1.print();
        cliente2.print();

        System.out.println("- Retirada -");
        System.out.print("Quanto vai retirar (conta 2): ");
        quanto = (teclado.nextDouble());
        
        cliente2.conta.retirarValor(quanto);
        cliente1.print();
        cliente2.print();

        System.out.println("- Transferir valor entre contas -");
        System.out.print("Quanto deseja transferir: ");
        quanto = (teclado.nextDouble());
        
        cliente1.conta.transferirValor(quanto, cliente2.conta);

        cliente1.print(); 
        cliente2.print();

        teclado.close();
    }
}