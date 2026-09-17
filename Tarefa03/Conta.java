import java.util.Scanner;

public class Conta {
    String extrato = "";
    double saldo;
    Scanner teclado = new Scanner(System.in);

    double getSaldo() {
        return saldo;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    double depositarValor(double valor) {
        if (valor < 0) return -1;
        this.saldo += valor;
        extrato += "Depositado: " + valor + "\n";
        return 0.0;
    }

    double retirarValor(double valor) {
        if (valor < 0) return -1;

            if (valor > this.saldo){
                System.out.println("\nA conta não pode ser negativada!");
                return -1;
            }
            this.saldo -= valor;
        extrato += "Retirado: " + valor + "\n";
        return 0;
    }

    int transferirValor(double valor, Conta outra) {
        if (valor <= this.saldo){
            outra.saldo += valor;
            this.saldo -= valor;
        } else {
            System.out.println("Essa operação viola as condições!");
            return -1;
        }
        extrato += "Transferido da conta atual para " + outra + ": " +"R$ " + valor + "\n";
        return 0;
    }

}

