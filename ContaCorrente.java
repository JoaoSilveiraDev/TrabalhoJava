public class ContaCorrente extends Cliente {
    public ContaCorrente(String nome, String CPF) {
        super(nome, CPF);
    }

    public Cliente cliente;
    public float saldo;
    public String movimentos = " ";
    public float taxa;
    public boolean permissao = super.flag;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void deposito(double valor) {
        if(this.flag == true){
            this.saldo += valor;
            this.movimentos = movimentos.concat(String.valueOf("\n|" + "Deposito: " + valor + "|"));
        }else{
            System.out.println("Acesso negado, idade minima não atingida!");
        }
    }

    public void saque(double valor) {
        if(this.flag == true){
            this.saldo -= valor + (valor * 0.005);
            this.movimentos = movimentos.concat(String.valueOf("\n|" + "Saque: " + valor + "|"));
        }else{
            System.out.println("Acesso negado, idade minima não atingida!");
        }

    }

    public float getSaldo() {
        if(this.flag == true){
            System.out.println("|Saldo: " + this.saldo + "|");
            return 0;
        }else{
            System.out.println("Acesso negado, idade minima não atingida!");
            return 0;
        }
    }
    public void extrato(){
        if(this.flag == true){
            System.out.println(this.movimentos);
        }
        else{
            System.out.println("Acesso negado, idade minima não atingida!");
        }
    }
}