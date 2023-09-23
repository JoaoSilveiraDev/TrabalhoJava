//João Vitor da Cunha Silveira, Diego Maglia Germann, Gustavo Von Burg;
public class FaturaTeste {
    public static void main(String []args){
        Fatura fatura = new Fatura();
        fatura.setCodigo("001");
        fatura.setDescricao("banana");
        fatura.setPreco(10);
        fatura.setQuantidade(2);
        fatura.setCodigo("002");
        fatura.setDescricao("pessego");
        fatura.setPreco(7);
        fatura.setQuantidade(5);
        fatura.setCodigo("003");
        fatura.setDescricao("chocolate");
        fatura.setPreco(16);
        fatura.setQuantidade(3);
        fatura.getFatura();
    }
}
