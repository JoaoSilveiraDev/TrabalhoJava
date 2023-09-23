public class ContaEspecialConsole {
    public static void main(String []args){
        ContaEspecial conta = new ContaEspecial("joao", "12345678901", "1234567890");
        conta.setNascimento(10, 12, 2003);
        conta.deposito(1000);
        conta.saque(300);
        conta.getSaldo();
        conta.extrato();
    }
}
