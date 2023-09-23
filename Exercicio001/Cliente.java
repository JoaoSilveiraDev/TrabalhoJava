//João Vitor da Cunha Silveira, Diego Maglia Germann, Gustavo Von Burg;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Cliente {
    public String nome;
    public String CPF;
    public String RG;
    public Date nascimento;
    Date data = new Date();
    public String dataAtual = new SimpleDateFormat("yyyyMMdd").format(data);
    public int dataFormatada = Integer.parseInt((String.valueOf(dataAtual.charAt(0)))+(String.valueOf(dataAtual.charAt(1))) +(String.valueOf(dataAtual.charAt(2))) +(String.valueOf(dataAtual.charAt(3))));
    public int idade;

    public Cliente (String nome, String CPF, String RG){
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
    }
    public void setNascimento(int dia, int mes, int ano){
        this.nascimento = new Date(dia, mes, ano);
        this.idade = dataFormatada - ano;
    }
    public String getNascimento(){
        return String.valueOf(this.nascimento);
    }
}
