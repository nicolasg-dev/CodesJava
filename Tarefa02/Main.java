//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        System.out.println("Cadastro do primeiro produto");

        System.out.print("Descrição: ");
        produto1.setDescricao(teclado.nextLine());

        System.out.print("Preço unitário: ");
        produto1.setPrecoUnitario(teclado.nextDouble());

        System.out.print("Estoque: ");
        produto1.setEstoque(teclado.nextInt());
        teclado.nextLine();

        System.out.println("\nCadastro do segundo produto");

        System.out.print("Descrição: ");
        produto2.setDescricao(teclado.nextLine());

        System.out.print("Preço unitário: ");
        produto2.setPrecoUnitario(teclado.nextDouble());

        System.out.print("Estoque: ");
        produto2.setEstoque(teclado.nextInt());

        // Venda válida de uma unidade do primeiro produto
        double totalVenda1 = produto1.efetuarVenda(1);

        if (totalVenda1 > 0)
            System.out.printf("%nVenda realizada. Total: R$ %.2f%n", totalVenda1);
        else
            System.out.println("\nNão foi possível realizar a venda.");


        // Tentativa de venda com estoque insuficiente
        int quantidade = produto2.getEstoque() + 1;
        double totalVenda2 = produto2.efetuarVenda(quantidade);

        if (totalVenda2 > 0)
            System.out.printf("Venda realizada. Total: R$ %.2f%n", totalVenda2);
        else
            System.out.println("Venda não realizada: estoque insuficiente.");

        System.out.println("\nSituação dos produtos:");

        System.out.printf("%s | Preço: R$ %.2f | Estoque: %d%n",
                produto1.getDescricao(),
                produto1.getPrecoUnitario(),
                produto1.getEstoque());

        System.out.printf("%s | Preço: R$ %.2f | Estoque: %d%n",
                produto2.getDescricao(),
                produto2.getPrecoUnitario(),
                produto2.getEstoque());

        teclado.close();
    }
}