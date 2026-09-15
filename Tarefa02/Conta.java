public class Conta {
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
        this.saldo += valor;

        return 0.0;
    }

    double retirarValor(double valor) {
        if (this.especial){
            this.saldo -= valor;           
        } else {
            if (valor > this.saldo){
                System.out.println("\nA conta não pode ser negativada!");
                return -1;
            }
            this.saldo -= valor;
        }
        return 0.0;
    }

    int transferirValor(double valor, Conta outra) {
        if (this.especial){
            outra.saldo = depositarValor(valor);
            this.saldo = retirarValor(valor);
        } else if (valor <= this.saldo){
            outra.saldo = depositarValor(valor);
            this.saldo = retirarValor(valor);
        } else return -1;
        return 0;
    }
}
