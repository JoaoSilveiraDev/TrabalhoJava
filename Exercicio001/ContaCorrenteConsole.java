public class ContaCorrenteConsole {
    public static void main(String []args){
        ContaCorrente conta = new ContaCorrente("joao", "12345678901", "1112220912");
        conta.setNascimento(10, 12, 2002);
        conta.deposito(1000);
        conta.getSaldo();
        conta.saque(500);
        conta.getSaldo();
        conta.extrato();
    }
}
