//João Vitor da Cunha Silveira, Diego Maglia Germann, Gustavo Von Burg;
import java.util.ArrayList;
public class ContaCorrente extends Cliente{
    public ContaCorrente(String nome, String CPF, String RG){
        super(nome, CPF, RG);
    }
    public Cliente cliente;
    public float saldo;
    public ArrayList<String> movimentos = new ArrayList<String>();
    public float taxa;

    public void deposito(float valor){
        if(super.idade >= 18){
            this.saldo = valor;
            this.movimentos.add(String.valueOf(valor));
        }else{
            System.out.println("Voce não tem idade para criar um conta corrente!");
        }

    }
    public void saque(float valor){
        if(super.idade >= 18){
            this.saldo -= valor + (valor*0.005);
            this.movimentos.add(String.valueOf(valor));
        }else{
            System.out.println("Voce não tem idade para criar um conta corrente!");
        }

    }
    public float getSaldo(){
        if(super.idade >= 18){
            System.out.println(this.saldo);
            return this.saldo;
        }else{
            System.out.println("Voce não tem idade para criar um conta corrente!");
            return 0;
        }

    }
    public void extrato(){
        if(super.idade >= 18){
            System.out.println(this.movimentos);
        }else{
            System.out.println("Voce não tem idade para criar um conta corrente!");
        }

    }
}
