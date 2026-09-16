import java.util.Scanner;

public class Conta {
    Scanner teclado = new Scanner(System.in);
    String nome;
    double saldo;
    boolean especial;

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    double getSaldo() {
        return saldo;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    boolean getEspecial() {
        return especial;
    }

    void setEspecial(boolean especial) {
        this.especial = especial;
    }

    double depositarValor(double valor) {
        if (valor < 0) return -1;
        this.saldo += valor;

        return 0.0;
    }

    double retirarValor(double valor) {
        if (valor < 0) return -1;
        if (this.especial){
            this.saldo -= valor;           
        } else {
            if (valor > this.saldo){
                System.out.println("\nA conta não pode ser negativada!");
                return -1;
            }
            this.saldo -= valor;
        }
        return 0;
    }

    int transferirValor(double valor, Conta outra) {
        if (this.especial){
            outra.saldo += valor;
            this.saldo -= valor;
        } else if (valor <= this.saldo){
            outra.saldo += valor;
            this.saldo -= valor;
        } else return -1;
        return 0;
    }
        void print(){
            System.out.println("-------------------------\n");

            System.out.printf("%s | Saldo: R$ %.2f | Especial: %b\n\n",
                    this.getNome(),
                    this.getSaldo(),
                    this.getEspecial());
                    return;
        } 
}
