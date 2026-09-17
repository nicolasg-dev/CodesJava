public class Cliente {
    String nome;
    String endereço;
    boolean especial;
    Conta conta = new Conta();

    String getEnder() {
        return endereço;
    }

    void setEnder(String ender) {
        this.endereço = ender;
    }

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    boolean getEspecial() {
        return especial;
    }

    void setEspecial(boolean especial) {
        this.especial = especial;
    }

        void print(){
            System.out.println("--------------------------------------------------\n");
            System.out.println("Informações do cliente: \n");
            System.out.printf("%s | Saldo: R$ %.2f | Especial: %b | Endereço: %s\n\n | Extrato (%s): %s\n\n",
                    this.getNome(),
                    this.conta.getSaldo(),
                    this.getEspecial(),
                    this.endereço,
                    this.getNome(),
                    this.conta.extrato);
                    return;
        } 

}