public class ContaEspecial extends ContaCorrente{
    public ContaEspecial(String nome, String CPF, String RG) {
        super(nome, CPF, RG);
    }
    public void saque(float valor){
        if(super.idade >= 18){
            super.saldo = valor;
            this.movimentos.add(String.valueOf(valor));
        }else{
            System.out.println("Voce não tem idade suficiente para criar a conta!");
        }

    }
}

