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

        System.out.print("Especial: (true, false)");
        conta1.setEspecial(teclado.nextBoolean());
        teclado.nextLine();

        System.out.println("Cadastro da segunda conta: ");

        System.out.print("Nome: ");
        conta2.setNome(teclado.nextLine());

        System.out.print("Saldo: ");
        conta2.setSaldo(teclado.nextDouble());

        System.out.print("Especial: (true, false)");
        conta2.setEspecial(teclado.nextBoolean());
        teclado.nextLine();

  /*       // Venda válida de uma unidade do primeiro produto
        double totalVenda1 = conta1.efetuarVenda(1);

        if (totalVenda1 > 0)
            System.out.printf("%nVenda realizada. Total: R$ %.2f%n", totalVenda1);
        else
            System.out.println("\nNão foi possível realizar a venda.");


        // Tentativa de venda com estoque insuficiente
        int quantidade = conta2.getEstoque() + 1;
        double totalVenda2 = conta2.efetuarVenda(quantidade);

        if (totalVenda2 > 0)
            System.out.printf("Venda realizada. Total: R$ %.2f%n", totalVenda2);
        else
            System.out.println("Venda não realizada: estoque insuficiente."); */

        conta1.depositarValor(200);
        conta2.depositarValor

        System.out.println("\nSituação dos produtos:");

        System.out.printf("%s | Saldo: R$ %.2f | Especial: %b%n",
                conta1.getNome(),
                conta1.getSaldo(),
                conta1.getEspecial());

        System.out.printf("%s | Saldo: R$ %.2f | Especial: %d%n",
                conta2.getNome(),
                conta2.getSaldo(),
                conta2.getEspecial());

        teclado.close();
    }
}