import java.text.ParseException;

public class programa {
    public static void main(String[]args) throws ParseException {
        ContaCorrente cliente = new ContaCorrente("joao", "00000000000");
        cliente.setNascimento(10, 12, 2003);
        cliente.deposito(1000);
        cliente.saque(350);
        cliente.extrato();
        cliente.getSaldo();
        cliente.getNascimento();


    }
}
