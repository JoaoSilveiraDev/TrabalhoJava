//João Vitor da Cunha Silveira, Diego Maglia Germann, Gustavo Von Burg;
import java.util.ArrayList;
import java.util.LinkedList;
public class Fatura {
    public ArrayList<String> codigo = new ArrayList<String>();
    public ArrayList<String> descricao = new ArrayList<String>();
    public LinkedList<Integer> quantidade = new LinkedList<Integer>();
    public LinkedList<Double> preco = new LinkedList<Double>();
    public double fatura = 0;

    public void setCodigo(String codigo){
        this.codigo.add(codigo);
    }
    public void setDescricao(String descricao){
        this.descricao.add(descricao);
    }
    public void setQuantidade(int quantidade){
        this.quantidade.add(quantidade);
    }
    public void setPreco(double preco){
        this.preco.add(preco);
    }
    public double getFatura(){
        for(int i = 0; i<this.preco.size(); i++){
            this.fatura += this.preco.get(i) * this.quantidade.get(i);
        }
        System.out.println("Codigo dos produtos: " + this.codigo);
        System.out.println("Descricao dos produtos: " + this.descricao);
        System.out.println("Quantidade comprada: " + this.quantidade);
        System.out.println("Precos dos itens comprados: " + this.preco);
        System.out.println("Total fatura: " + this.fatura);
        if(this.fatura>0){
            return 0.0;
        }else if(this.fatura<0){
            return 0;
        }
        return 1;
    }
}
