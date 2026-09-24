public class Cliente {
    String nome;
    String endereço;
    boolean especial;    
    Conta conta = new Conta(0);

    public Cliente(String nome, String endereço, boolean especial, double saldo){
        this.nome = nome;
        this.endereço = endereço;
        this.especial = especial;
        this.conta.saldo = saldo;
    }

        void print(){
            System.out.println("--------------------------------------------------\n");
            System.out.println("Informações do cliente: \n");   
            System.out.printf("%s | Saldo: R$ %.2f | Especial: %b | Endereço: %s\n\n | Extrato (%s): %s\n\n",
                    this.nome,
                    this.conta.saldo,
                    this.especial,
                    this.endereço,
                    this.nome,
                    this.conta.extrato);
                    return;
        } 

}